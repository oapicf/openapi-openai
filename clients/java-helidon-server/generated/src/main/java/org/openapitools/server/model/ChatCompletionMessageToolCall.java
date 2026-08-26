package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.ChatCompletionMessageToolCallFunction;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ChatCompletionMessageToolCall   {

    private String id;

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
    private ChatCompletionMessageToolCallFunction function;

    /**
     * Default constructor.
     */
    public ChatCompletionMessageToolCall() {
    // JSON-B / Jackson
    }

    /**
     * Create ChatCompletionMessageToolCall.
     *
     * @param id The ID of the tool call.
     * @param type The type of the tool. Currently, only &#x60;function&#x60; is supported.
     * @param function function
     */
    public ChatCompletionMessageToolCall(
        String id, 
        TypeEnum type, 
        ChatCompletionMessageToolCallFunction function
    ) {
        this.id = id;
        this.type = type;
        this.function = function;
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
    public ChatCompletionMessageToolCallFunction getFunction() {
        return function;
    }

    public void setFunction(ChatCompletionMessageToolCallFunction function) {
        this.function = function;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChatCompletionMessageToolCall {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

