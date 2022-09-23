package io.specmesh.apiparser.model;

import java.util.Map;
import java.util.Objects;

/**
 * https://www.asyncapi.com/docs/reference/specification/v2.4.0#messageObject
 */
public class Message {
    private String messageId;
    private Map headers;
    private Map payload;
    private Map correlationId;
    private String schemaFormat;
    private String contentType;
    private String name;
    private String title;
    private String summary;
    private String description;
    private Map tags;
    private Map bindings;
    private Map traits;

    public String getMessageId() {
        return messageId;
    }

    public Map getHeaders() {
        return headers;
    }

    public Map getPayload() {
        return payload;
    }

    public Map getCorrelationId() {
        return correlationId;
    }

    public String getSchemaFormat() {
        return schemaFormat;
    }

    public String getContentType() {
        return contentType;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public String getSummary() {
        return summary;
    }

    public String getDescription() {
        return description;
    }

    public Map getTags() {
        return tags;
    }

    public Map getBindings() {
        return bindings;
    }

    public Map getTraits() {
        return traits;
    }

    @Override
    public String toString() {
        return "Message{" +
                "messageId='" + messageId + '\'' +
                ", headers=" + headers +
                ", payload=" + payload +
                ", correlationId=" + correlationId +
                ", schemaFormat='" + schemaFormat + '\'' +
                ", contentType='" + contentType + '\'' +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", summary='" + summary + '\'' +
                ", description='" + description + '\'' +
                ", tags=" + tags +
                ", bindings=" + bindings +
                ", traits=" + traits +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Message)) return false;
        Message message = (Message) o;
        return Objects.equals(getMessageId(), message.getMessageId()) && Objects.equals(getHeaders(), message.getHeaders()) && Objects.equals(getPayload(), message.getPayload()) && Objects.equals(getCorrelationId(), message.getCorrelationId()) && Objects.equals(getSchemaFormat(), message.getSchemaFormat()) && Objects.equals(getContentType(), message.getContentType()) && Objects.equals(getName(), message.getName()) && Objects.equals(getTitle(), message.getTitle()) && Objects.equals(getSummary(), message.getSummary()) && Objects.equals(getDescription(), message.getDescription()) && Objects.equals(getTags(), message.getTags()) && Objects.equals(getBindings(), message.getBindings()) && Objects.equals(getTraits(), message.getTraits());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMessageId(), getHeaders(), getPayload(), getCorrelationId(), getSchemaFormat(), getContentType(), getName(), getTitle(), getSummary(), getDescription(), getTags(), getBindings(), getTraits());
    }
}
