package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.DoneEvent;
import org.openapitools.server.model.ErrorEvent;
import org.openapitools.server.model.MessageStreamEvent;
import org.openapitools.server.model.RunStepStreamEvent;
import org.openapitools.server.model.RunStreamEvent;
import org.openapitools.server.model.ThreadStreamEvent;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Represents an event emitted when streaming a Run.  Each event in a server-sent events stream has an `event` and `data` property:  ``` event: thread.created data: {\"id\": \"thread_123\", \"object\": \"thread\", ...} ```  We emit events whenever a new object is created, transitions to a new state, or is being streamed in parts (deltas). For example, we emit `thread.run.created` when a new run is created, `thread.run.completed` when a run completes, and so on. When an Assistant chooses to create a message during a run, we emit a `thread.message.created event`, a `thread.message.in_progress` event, many `thread.message.delta` events, and finally a `thread.message.completed` event.  We may add additional events over time, so we recommend handling unknown events gracefully in your code. See the [Assistants API quickstart](/docs/assistants/overview) to learn how to integrate the Assistants API with streaming. 
 */
public class AssistantStreamEvent   {

    private Boolean enabled;

    /**
    * Gets or Sets event
    */
    public enum EventEnum {
        DONE("done");

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

    /**
    * Gets or Sets data
    */
    public enum DataEnum {
        _DONE_("[DONE]");

        private String value;

        DataEnum(String value) {
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
        public static DataEnum fromValue(String text) {
            for (DataEnum b : DataEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private DataEnum data;

    /**
     * Default constructor.
     */
    public AssistantStreamEvent() {
    // JSON-B / Jackson
    }

    /**
     * Create AssistantStreamEvent.
     *
     * @param enabled Whether to enable input audio transcription.
     * @param event event
     * @param data data
     */
    public AssistantStreamEvent(
        Boolean enabled, 
        EventEnum event, 
        DataEnum data
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
    public DataEnum getData() {
        return data;
    }

    public void setData(DataEnum data) {
        this.data = data;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssistantStreamEvent {\n");
        
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

