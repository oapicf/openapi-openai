package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Text output from the Code Interpreter tool call as part of a run step.
 */
public class RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject   {

    private Integer index;

    /**
    * Always `logs`.
    */
    public enum TypeEnum {
        LOGS("logs");

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String text) {
            for (TypeEnum b : TypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private TypeEnum type;
    private String logs;

    /**
     * Default constructor.
     */
    public RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject() {
    // JSON-B / Jackson
    }

    /**
     * Create RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.
     *
     * @param index The index of the output in the outputs array.
     * @param type Always &#x60;logs&#x60;.
     * @param logs The text output from the Code Interpreter tool call.
     */
    public RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject(
        Integer index, 
        TypeEnum type, 
        String logs
    ) {
        this.index = index;
        this.type = type;
        this.logs = logs;
    }



    /**
     * The index of the output in the outputs array.
     * @return index
     */
    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    /**
     * Always `logs`.
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    /**
     * The text output from the Code Interpreter tool call.
     * @return logs
     */
    public String getLogs() {
        return logs;
    }

    public void setLogs(String logs) {
        this.logs = logs;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject {\n");
        
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
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

