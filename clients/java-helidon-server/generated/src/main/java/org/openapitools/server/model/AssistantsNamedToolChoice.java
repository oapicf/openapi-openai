package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.AssistantsNamedToolChoiceFunction;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Specifies a tool the model should use. Use to force the model to call a specific tool.
 */
public class AssistantsNamedToolChoice   {


    /**
    * The type of the tool. If type is `function`, the function name must be set
    */
    public enum TypeEnum {
        FUNCTION("function"),
        CODE_INTERPRETER("code_interpreter"),
        FILE_SEARCH("file_search");

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
    private AssistantsNamedToolChoiceFunction function;

    /**
     * Default constructor.
     */
    public AssistantsNamedToolChoice() {
    // JSON-B / Jackson
    }

    /**
     * Create AssistantsNamedToolChoice.
     *
     * @param type The type of the tool. If type is &#x60;function&#x60;, the function name must be set
     * @param function function
     */
    public AssistantsNamedToolChoice(
        TypeEnum type, 
        AssistantsNamedToolChoiceFunction function
    ) {
        this.type = type;
        this.function = function;
    }



    /**
     * The type of the tool. If type is `function`, the function name must be set
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    /**
     * Get function
     * @return function
     */
    public AssistantsNamedToolChoiceFunction getFunction() {
        return function;
    }

    public void setFunction(AssistantsNamedToolChoiceFunction function) {
        this.function = function;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssistantsNamedToolChoice {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    function: ").append(toIndentedString(function)).append("\n");
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

