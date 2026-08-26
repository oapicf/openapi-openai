package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.RunStepObject;
import org.openapitools.server.model.RunStepStreamEventOneOf;
import org.openapitools.server.model.RunStepStreamEventOneOf1;
import org.openapitools.server.model.RunStepStreamEventOneOf2;
import org.openapitools.server.model.RunStepStreamEventOneOf3;
import org.openapitools.server.model.RunStepStreamEventOneOf4;
import org.openapitools.server.model.RunStepStreamEventOneOf5;
import org.openapitools.server.model.RunStepStreamEventOneOf6;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class RunStepStreamEvent   {


    /**
    * Gets or Sets event
    */
    public enum EventEnum {
        THREAD_RUN_STEP_EXPIRED("thread.run.step.expired");

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
    private RunStepObject data;

    /**
     * Default constructor.
     */
    public RunStepStreamEvent() {
    // JSON-B / Jackson
    }

    /**
     * Create RunStepStreamEvent.
     *
     * @param event event
     * @param data data
     */
    public RunStepStreamEvent(
        EventEnum event, 
        RunStepObject data
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
    public RunStepObject getData() {
        return data;
    }

    public void setData(RunStepObject data) {
        this.data = data;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunStepStreamEvent {\n");
        
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

