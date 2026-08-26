package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.ChatCompletionRequestToolMessageContent;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ChatCompletionRequestToolMessage   {


    /**
    * The role of the messages author, in this case `tool`.
    */
    public enum RoleEnum {
        TOOL("tool");

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
    private ChatCompletionRequestToolMessageContent content;
    private String toolCallId;

    /**
     * Default constructor.
     */
    public ChatCompletionRequestToolMessage() {
    // JSON-B / Jackson
    }

    /**
     * Create ChatCompletionRequestToolMessage.
     *
     * @param role The role of the messages author, in this case &#x60;tool&#x60;.
     * @param content content
     * @param toolCallId Tool call that this message is responding to.
     */
    public ChatCompletionRequestToolMessage(
        RoleEnum role, 
        ChatCompletionRequestToolMessageContent content, 
        String toolCallId
    ) {
        this.role = role;
        this.content = content;
        this.toolCallId = toolCallId;
    }



    /**
     * The role of the messages author, in this case `tool`.
     * @return role
     */
    public RoleEnum getRole() {
        return role;
    }

    public void setRole(RoleEnum role) {
        this.role = role;
    }

    /**
     * Get content
     * @return content
     */
    public ChatCompletionRequestToolMessageContent getContent() {
        return content;
    }

    public void setContent(ChatCompletionRequestToolMessageContent content) {
        this.content = content;
    }

    /**
     * Tool call that this message is responding to.
     * @return toolCallId
     */
    public String getToolCallId() {
        return toolCallId;
    }

    public void setToolCallId(String toolCallId) {
        this.toolCallId = toolCallId;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChatCompletionRequestToolMessage {\n");
        
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    toolCallId: ").append(toIndentedString(toolCallId)).append("\n");
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

