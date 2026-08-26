package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.RunStepDeltaStepDetailsToolCallsObjectToolCallsInner;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Details of the tool call.
 */
public class RunStepDeltaStepDetailsToolCallsObject   {


    /**
    * Always `tool_calls`.
    */
    public enum TypeEnum {
        TOOL_CALLS("tool_calls");

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
    private List<RunStepDeltaStepDetailsToolCallsObjectToolCallsInner> toolCalls = new ArrayList<>();

    /**
     * Default constructor.
     */
    public RunStepDeltaStepDetailsToolCallsObject() {
    // JSON-B / Jackson
    }

    /**
     * Create RunStepDeltaStepDetailsToolCallsObject.
     *
     * @param type Always &#x60;tool_calls&#x60;.
     * @param toolCalls An array of tool calls the run step was involved in. These can be associated with one of three types of tools: &#x60;code_interpreter&#x60;, &#x60;file_search&#x60;, or &#x60;function&#x60;. 
     */
    public RunStepDeltaStepDetailsToolCallsObject(
        TypeEnum type, 
        List<RunStepDeltaStepDetailsToolCallsObjectToolCallsInner> toolCalls
    ) {
        this.type = type;
        this.toolCalls = toolCalls;
    }



    /**
     * Always `tool_calls`.
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    /**
     * An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `file_search`, or `function`. 
     * @return toolCalls
     */
    public List<RunStepDeltaStepDetailsToolCallsObjectToolCallsInner> getToolCalls() {
        return toolCalls;
    }

    public void setToolCalls(List<RunStepDeltaStepDetailsToolCallsObjectToolCallsInner> toolCalls) {
        this.toolCalls = toolCalls;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunStepDeltaStepDetailsToolCallsObject {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    toolCalls: ").append(toIndentedString(toolCalls)).append("\n");
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

