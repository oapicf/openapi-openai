package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.ThreadObject;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Occurs when a new [thread](/docs/api-reference/threads/object) is created.
 */
public class ThreadStreamEvent   {

    private Boolean enabled;

    /**
    * Gets or Sets event
    */
    public enum EventEnum {
        THREAD_CREATED("thread.created");

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
    private ThreadObject data;

    /**
     * Default constructor.
     */
    public ThreadStreamEvent() {
    // JSON-B / Jackson
    }

    /**
     * Create ThreadStreamEvent.
     *
     * @param enabled Whether to enable input audio transcription.
     * @param event event
     * @param data data
     */
    public ThreadStreamEvent(
        Boolean enabled, 
        EventEnum event, 
        ThreadObject data
    ) {
        this.enabled = enabled;
        this.event = event;
        this.data = data;
    }



    /**
     * Whether to enable input audio transcription.
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
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
    public ThreadObject getData() {
        return data;
    }

    public void setData(ThreadObject data) {
        this.data = data;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ThreadStreamEvent {\n");
        
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

