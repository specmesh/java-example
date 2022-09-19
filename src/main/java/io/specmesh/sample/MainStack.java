package io.specmesh.sample;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.hashicorp.cdktf.TerraformVariable;
import imports.kafka.KafkaProvider;
import imports.kafka.Topic;
import software.constructs.Construct;

import com.hashicorp.cdktf.TerraformStack;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class MainStack extends TerraformStack
{
//    private final TerraformVariable varEnvironment;

    public MainStack(final Construct scope, final String id) {
        super(scope, id);
        List<String> servers = new ArrayList<String>();
        servers.add("localhost:29092");

        KafkaProvider.Builder.create(this, "dev")
                .bootstrapServers(servers)
                .saslUsername("broker")
                .saslPassword("broker")
                .tlsEnabled(false)
                .build();


    }

    void buildTopics(Set<String> topics){
        for (String topic : topics) {
            String topicName = generateTopicName(topic);
            Topic.Builder.create(this, topicName)
                    .name(topicName)
                    .partitions(3)
                    .replicationFactor(1)
                    .build();
        }

    }

    private String generateTopicName(String topic) {
        Splitter slashSplitter = Splitter.on('/');
        List<String> parts = slashSplitter.splitToList(topic);
        return Joiner.on("-").skipNulls().join(parts);
    }
}