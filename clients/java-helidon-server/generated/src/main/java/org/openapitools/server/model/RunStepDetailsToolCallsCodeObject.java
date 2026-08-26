package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.RunStepDetailsToolCallsCodeObjectCodeInterpreter;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Details of the Code Interpreter tool call the run step was involved in.
 */
public class RunStepDetailsToolCallsCodeObject   {

    private String id;

    /**
    * The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
    */
    public enum TypeEnum {
        CODE_INTERPRETER("code_interpreter");

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
    private RunStepDetailsToolCallsCodeObjectCodeInterpreter codeInterpreter;

    /**
     * Default constructor.
     */
    public RunStepDetailsToolCallsCodeObject() {
    // JSON-B / Jackson
    }

    /**
     * Create RunStepDetailsToolCallsCodeObject.
     *
     * @param id The ID of the tool call.
     * @param type The type of tool call. This is always going to be &#x60;code_interpreter&#x60; for this type of tool call.
     * @param codeInterpreter codeInterpreter
     */
    public RunStepDetailsToolCallsCodeObject(
        String id, 
        TypeEnum type, 
        RunStepDetailsToolCallsCodeObjectCodeInterpreter codeInterpreter
    ) {
        this.id = id;
        this.type = type;
        this.codeInterpreter = codeInterpreter;
    }



    /**
     * The ID of the tool call.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    /**
     * Get codeInterpreter
     * @return codeInterpreter
     */
    public RunStepDetailsToolCallsCodeObjectCodeInterpreter getCodeInterpreter() {
        return codeInterpreter;
    }

    public void setCodeInterpreter(RunStepDetailsToolCallsCodeObjectCodeInterpreter codeInterpreter) {
        this.codeInterpreter = codeInterpreter;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunStepDetailsToolCallsCodeObject {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    codeInterpreter: ").append(toIndentedString(codeInterpreter)).append("\n");
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

