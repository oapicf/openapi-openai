package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.RunStepDetailsToolCallsCodeOutputImageObject;
import org.openapitools.server.model.RunStepDetailsToolCallsCodeOutputImageObjectImage;
import org.openapitools.server.model.RunStepDetailsToolCallsCodeOutputLogsObject;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner   {


    /**
    * Always `logs`.
    */
    public enum TypeEnum {
        LOGS("logs"),
        IMAGE("image");

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
    private RunStepDetailsToolCallsCodeOutputImageObjectImage image;

    /**
     * Default constructor.
     */
    public RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner() {
    // JSON-B / Jackson
    }

    /**
     * Create RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.
     *
     * @param type Always &#x60;logs&#x60;.
     * @param logs The text output from the Code Interpreter tool call.
     * @param image image
     */
    public RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner(
        TypeEnum type, 
        String logs, 
        RunStepDetailsToolCallsCodeOutputImageObjectImage image
    ) {
        this.type = type;
        this.logs = logs;
        this.image = image;
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
     * Get image
     * @return image
     */
    public RunStepDetailsToolCallsCodeOutputImageObjectImage getImage() {
        return image;
    }

    public void setImage(RunStepDetailsToolCallsCodeOutputImageObjectImage image) {
        this.image = image;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
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

