package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.AssistantsNamedToolChoiceFunction;
import org.openapitools.server.model.ChatCompletionNamedToolChoice;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Controls which (if any) tool is called by the model. `none` means the model will not call any tool and instead generates a message. `auto` means the model can pick between generating a message or calling one or more tools. `required` means the model must call one or more tools. Specifying a particular tool via `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}` forces the model to call that tool.  `none` is the default when no tools are present. `auto` is the default if tools are present. 
 */
public class ChatCompletionToolChoiceOption   {


    /**
    * The type of the tool. Currently, only `function` is supported.
    */
    public enum TypeEnum {
        FUNCTION("function");

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
    public ChatCompletionToolChoiceOption() {
    // JSON-B / Jackson
    }

    /**
     * Create ChatCompletionToolChoiceOption.
     *
     * @param type The type of the tool. Currently, only &#x60;function&#x60; is supported.
     * @param function function
     */
    public ChatCompletionToolChoiceOption(
        TypeEnum type, 
        AssistantsNamedToolChoiceFunction function
    ) {
        this.type = type;
        this.function = function;
    }



    /**
     * The type of the tool. Currently, only `function` is supported.
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
        sb.append("class ChatCompletionToolChoiceOption {\n");
        
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

