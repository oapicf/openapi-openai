package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.FunctionObject;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ChatCompletionTool   {


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
    private FunctionObject function;

    /**
     * Default constructor.
     */
    public ChatCompletionTool() {
    // JSON-B / Jackson
    }

    /**
     * Create ChatCompletionTool.
     *
     * @param type The type of the tool. Currently, only &#x60;function&#x60; is supported.
     * @param function function
     */
    public ChatCompletionTool(
        TypeEnum type, 
        FunctionObject function
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
    public FunctionObject getFunction() {
        return function;
    }

    public void setFunction(FunctionObject function) {
        this.function = function;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChatCompletionTool {\n");
        
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

