package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.RunStepDeltaObject;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Occurs when parts of a [run step](/docs/api-reference/run-steps/step-object) are being streamed.
 */
public class RunStepStreamEventOneOf2   {


    /**
    * Gets or Sets event
    */
    public enum EventEnum {
        THREAD_RUN_STEP_DELTA("thread.run.step.delta");

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
    private RunStepDeltaObject data;

    /**
     * Default constructor.
     */
    public RunStepStreamEventOneOf2() {
    // JSON-B / Jackson
    }

    /**
     * Create RunStepStreamEventOneOf2.
     *
     * @param event event
     * @param data data
     */
    public RunStepStreamEventOneOf2(
        EventEnum event, 
        RunStepDeltaObject data
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
    public RunStepDeltaObject getData() {
        return data;
    }

    public void setData(RunStepDeltaObject data) {
        this.data = data;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunStepStreamEventOneOf2 {\n");
        
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

