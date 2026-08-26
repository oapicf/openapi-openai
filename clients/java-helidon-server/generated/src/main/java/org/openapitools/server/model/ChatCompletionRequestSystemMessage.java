package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.ChatCompletionRequestSystemMessageContent;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Developer-provided instructions that the model should follow, regardless of messages sent by the user. With o1 models and newer, use `developer` messages for this purpose instead. 
 */
public class ChatCompletionRequestSystemMessage   {

    private ChatCompletionRequestSystemMessageContent content;

    /**
    * The role of the messages author, in this case `system`.
    */
    public enum RoleEnum {
        SYSTEM("system");

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
    public ChatCompletionRequestSystemMessage() {
    // JSON-B / Jackson
    }

    /**
     * Create ChatCompletionRequestSystemMessage.
     *
     * @param content content
     * @param role The role of the messages author, in this case &#x60;system&#x60;.
     * @param name An optional name for the participant. Provides the model information to differentiate between participants of the same role.
     */
    public ChatCompletionRequestSystemMessage(
        ChatCompletionRequestSystemMessageContent content, 
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
    public ChatCompletionRequestSystemMessageContent getContent() {
        return content;
    }

    public void setContent(ChatCompletionRequestSystemMessageContent content) {
        this.content = content;
    }

    /**
     * The role of the messages author, in this case `system`.
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
        sb.append("class ChatCompletionRequestSystemMessage {\n");
        
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

