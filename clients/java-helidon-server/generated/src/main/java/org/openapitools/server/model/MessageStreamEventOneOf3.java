package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.MessageObject;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Occurs when a [message](/docs/api-reference/messages/object) is completed.
 */
public class MessageStreamEventOneOf3   {


    /**
    * Gets or Sets event
    */
    public enum EventEnum {
        THREAD_MESSAGE_COMPLETED("thread.message.completed");

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
        public static EventEnum fromValue(String text) {
            for (EventEnum b : EventEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private EventEnum event;
    private MessageObject data;

    /**
     * Default constructor.
     */
    public MessageStreamEventOneOf3() {
    // JSON-B / Jackson
    }

    /**
     * Create MessageStreamEventOneOf3.
     *
     * @param event event
     * @param data data
     */
    public MessageStreamEventOneOf3(
        EventEnum event, 
        MessageObject data
    ) {
        this.event = event;
        this.data = data;
    }



    /**
     * Get event
     * @return event
     */
    public EventEnum getEvent() {
        return event;
    }

    public void setEvent(EventEnum event) {
        this.event = event;
    }

    /**
     * Get data
     * @return data
     */
    public MessageObject getData() {
        return data;
    }

    public void setData(MessageObject data) {
        this.data = data;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MessageStreamEventOneOf3 {\n");
        
        sb.append("    event: ").append(toIndentedString(event)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

