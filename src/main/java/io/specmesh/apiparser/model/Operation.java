package io.specmesh.apiparser.model;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * https://www.asyncapi.com/docs/reference/specification/v2.4.0#operationObject
 * https://www.asyncapi.com/docs/reference/specification/v2.4.0#messageTraitObject
 */
public class Operation {
    private String operationId;
    private String summary;
    private String description;
    private List<String> tags;

    private Map bindings;
//    https://www.asyncapi.com/docs/reference/specification/v2.4.0#operationTraitObject
    private Map traits;

    private Message message;

    public String getOperationId() {
        return operationId;
    }

    public String getSummary() {
        return summary;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getTags() {
        return tags;
    }

    public Map getBindings() {
        return bindings;
    }

    public Map getTraits() {
        return traits;
    }

    public Message getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "operationId='" + operationId + '\'' +
                ", summary='" + summary + '\'' +
                ", description='" + description + '\'' +
                ", tags=" + tags +
                ", bindings=" + bindings +
                ", traits=" + traits +
                ", message=" + message +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Operation)) return false;
        Operation operation = (Operation) o;
        return Objects.equals(getOperationId(), operation.getOperationId()) && Objects.equals(getSummary(), operation.getSummary()) && Objects.equals(getDescription(), operation.getDescription()) && Objects.equals(getTags(), operation.getTags()) && Objects.equals(getBindings(), operation.getBindings()) && Objects.equals(getTraits(), operation.getTraits()) && Objects.equals(getMessage(), operation.getMessage());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOperationId(), getSummary(), getDescription(), getTags(), getBindings(), getTraits(), getMessage());
    }
}
