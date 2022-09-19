package io.specmesh.sample;


import com.hashicorp.cdktf.App;
import com.microsoft.terraform.TerraformClient;
import com.microsoft.terraform.TerraformOptions;
import org.yaml.snakeyaml.Yaml;


import java.io.*;
import java.util.*;

public class Main
{

    public static void main(String[] args) throws Exception {
        final App app = new App();
        MainStack stack = new MainStack(app, "learn-cdktf-docker");

        //load the spec
        Yaml yaml = new Yaml();
        InputStream inputStream = new FileInputStream("src/main/resources/bigdatalondon-api.yaml");
        Map<String, Object> spec = yaml.load(inputStream);
        LinkedHashMap<String, Object> channels = (LinkedHashMap<String, Object>) spec.get("channels");
        Set<String> topics = channels.keySet();

        //pull the channels and update the stack
        stack.buildTopics(topics);

        //sync the config
        app.synth();
    }
}