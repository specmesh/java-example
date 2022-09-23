package io.specmesh.apiparser.model;

import java.util.Map;

public class APISpec {
    private String id;
    private String asyncapi;

    private Map<String, Map<String, Operation>> channels;

    public String getId() {
        return id;
    }

    public Map<String, Map<String, Operation>> getChannels() {
        return channels;
    }

    public String getAsyncapi() {
        return asyncapi;
    }

}
