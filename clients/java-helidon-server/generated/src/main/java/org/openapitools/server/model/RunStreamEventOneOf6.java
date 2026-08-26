package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.RunObject;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Occurs when a [run](/docs/api-reference/runs/object) fails.
 */
public class RunStreamEventOneOf6   {


    /**
    * Gets or Sets event
    */
    public enum EventEnum {
        THREAD_RUN_FAILED("thread.run.failed");

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
    private RunObject data;

    /**
     * Default constructor.
     */
    public RunStreamEventOneOf6() {
    // JSON-B / Jackson
    }

    /**
     * Create RunStreamEventOneOf6.
     *
     * @param event event
     * @param data data
     */
    public RunStreamEventOneOf6(
        EventEnum event, 
        RunObject data
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
    public RunObject getData() {
        return data;
    }

    public void setData(RunObject data) {
        this.data = data;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunStreamEventOneOf6 {\n");
        
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

