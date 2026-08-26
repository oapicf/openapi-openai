package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.ChatCompletionRequestUserMessageContent;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Messages sent by an end user, containing prompts or additional context information. 
 */
public class ChatCompletionRequestUserMessage   {

    private ChatCompletionRequestUserMessageContent content;

    /**
    * The role of the messages author, in this case `user`.
    */
    public enum RoleEnum {
        USER("user");

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
    private String name;

    /**
     * Default constructor.
     */
    public ChatCompletionRequestUserMessage() {
    // JSON-B / Jackson
    }

    /**
     * Create ChatCompletionRequestUserMessage.
     *
     * @param content content
     * @param role The role of the messages author, in this case &#x60;user&#x60;.
     * @param name An optional name for the participant. Provides the model information to differentiate between participants of the same role.
     */
    public ChatCompletionRequestUserMessage(
        ChatCompletionRequestUserMessageContent content, 
        RoleEnum role, 
        String name
    ) {
        this.content = content;
        this.role = role;
        this.name = name;
    }



    /**
     * Get content
     * @return content
     */
    public ChatCompletionRequestUserMessageContent getContent() {
        return content;
    }

    public void setContent(ChatCompletionRequestUserMessageContent content) {
        this.content = content;
    }

    /**
     * The role of the messages author, in this case `user`.
     * @return role
     */
    public RoleEnum getRole() {
        return role;
    }

    public void setRole(RoleEnum role) {
        this.role = role;
    }

    /**
     * An optional name for the participant. Provides the model information to differentiate between participants of the same role.
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
        sb.append("class ChatCompletionRequestUserMessage {\n");
        
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

