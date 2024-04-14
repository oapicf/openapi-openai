/*
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.MessageDeltaObject;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * Occurs when parts of a [Message](/docs/api-reference/messages/object) are being streamed.
 */
@JsonPropertyOrder({
  MessageStreamEventOneOf2.JSON_PROPERTY_EVENT,
  MessageStreamEventOneOf2.JSON_PROPERTY_DATA
})
@JsonTypeName("MessageStreamEvent_oneOf_2")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-04-14T13:37:52.123317469Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Introspected
public class MessageStreamEventOneOf2 {
    /**
     * Gets or Sets event
     */
    public enum EventEnum {
        THREAD_MESSAGE_DELTA("thread.message.delta");

        private String value;

        EventEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static EventEnum fromValue(String value) {
            for (EventEnum b : EventEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }
    public static final String JSON_PROPERTY_EVENT = "event";
    private EventEnum event;

    public static final String JSON_PROPERTY_DATA = "data";
    private MessageDeltaObject data;

    public MessageStreamEventOneOf2(EventEnum event, MessageDeltaObject data) {
        this.event = event;
        this.data = data;
    }

    public MessageStreamEventOneOf2 event(EventEnum event) {
        this.event = event;
        return this;
    }

    /**
     * Get event
     * @return event
     **/
    @NotNull
    @JsonProperty(JSON_PROPERTY_EVENT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public EventEnum getEvent() {
        return event;
    }

    @JsonProperty(JSON_PROPERTY_EVENT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setEvent(EventEnum event) {
        this.event = event;
    }

    public MessageStreamEventOneOf2 data(MessageDeltaObject data) {
        this.data = data;
        return this;
    }

    /**
     * Get data
     * @return data
     **/
    @Valid
    @NotNull
    @JsonProperty(JSON_PROPERTY_DATA)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public MessageDeltaObject getData() {
        return data;
    }

    @JsonProperty(JSON_PROPERTY_DATA)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setData(MessageDeltaObject data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessageStreamEventOneOf2 messageStreamEventOneOf2 = (MessageStreamEventOneOf2) o;
        return Objects.equals(this.event, messageStreamEventOneOf2.event) &&
            Objects.equals(this.data, messageStreamEventOneOf2.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(event, data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MessageStreamEventOneOf2 {\n");
        sb.append("    event: ").append(toIndentedString(event)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

