package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ChatCompletionRequestFunctionMessage   {


    /**
    * The role of the messages author, in this case `function`.
    */
    public enum RoleEnum {
        FUNCTION("function");

        private String value;

        RoleEnum(String value) {
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
        public static RoleEnum fromValue(String text) {
            for (RoleEnum b : RoleEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private RoleEnum role;
    private String content;
    private String name;

    /**
     * Default constructor.
     */
    public ChatCompletionRequestFunctionMessage() {
    // JSON-B / Jackson
    }

    /**
     * Create ChatCompletionRequestFunctionMessage.
     *
     * @param role The role of the messages author, in this case &#x60;function&#x60;.
     * @param content The contents of the function message.
     * @param name The name of the function to call.
     */
    public ChatCompletionRequestFunctionMessage(
        RoleEnum role, 
        String content, 
        String name
    ) {
        this.role = role;
        this.content = content;
        this.name = name;
    }



    /**
     * The role of the messages author, in this case `function`.
     * @return role
     */
    public RoleEnum getRole() {
        return role;
    }

    public void setRole(RoleEnum role) {
        this.role = role;
    }

    /**
     * The contents of the function message.
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * The name of the function to call.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChatCompletionRequestFunctionMessage {\n");
        
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

