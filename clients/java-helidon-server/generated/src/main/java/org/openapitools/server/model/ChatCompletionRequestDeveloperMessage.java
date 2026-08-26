package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.ChatCompletionRequestDeveloperMessageContent;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Developer-provided instructions that the model should follow, regardless of messages sent by the user. With o1 models and newer, `developer` messages replace the previous `system` messages. 
 */
public class ChatCompletionRequestDeveloperMessage   {

    private ChatCompletionRequestDeveloperMessageContent content;

    /**
    * The role of the messages author, in this case `developer`.
    */
    public enum RoleEnum {
        DEVELOPER("developer");

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
    public ChatCompletionRequestDeveloperMessage() {
    // JSON-B / Jackson
    }

    /**
     * Create ChatCompletionRequestDeveloperMessage.
     *
     * @param content content
     * @param role The role of the messages author, in this case &#x60;developer&#x60;.
     * @param name An optional name for the participant. Provides the model information to differentiate between participants of the same role.
     */
    public ChatCompletionRequestDeveloperMessage(
        ChatCompletionRequestDeveloperMessageContent content, 
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
    public ChatCompletionRequestDeveloperMessageContent getContent() {
        return content;
    }

    public void setContent(ChatCompletionRequestDeveloperMessageContent content) {
        this.content = content;
    }

    /**
     * The role of the messages author, in this case `developer`.
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
        sb.append("class ChatCompletionRequestDeveloperMessage {\n");
        
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

