package io.specmesh.apiparser.model;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Value;

@Value
@NoArgsConstructor(force = true, access = AccessLevel.PRIVATE)
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiSpec {
    private String id;
    private String asyncapi;

    private Map<String, Map<String, Operation>> channels;

    public String id() {
        return id;
    }

    public Map<String, Map<String, Operation>> channels() {
        return channels;
    }

    public String asyncapi() {
        return asyncapi;
    }

}
