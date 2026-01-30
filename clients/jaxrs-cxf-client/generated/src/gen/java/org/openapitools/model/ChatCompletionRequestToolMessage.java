package org.openapitools.model;

import org.openapitools.model.ChatCompletionRequestToolMessageContent;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ChatCompletionRequestToolMessage  {
  
public enum RoleEnum {

TOOL(String.valueOf("tool"));


    private String value;

    RoleEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static RoleEnum fromValue(String value) {
        for (RoleEnum b : RoleEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * The role of the messages author, in this case `tool`.
  */
  @ApiModelProperty(required = true, value = "The role of the messages author, in this case `tool`.")

  private RoleEnum role;

  @ApiModelProperty(required = true, value = "")

  private ChatCompletionRequestToolMessageContent content;

 /**
  * Tool call that this message is responding to.
  */
  @ApiModelProperty(required = true, value = "Tool call that this message is responding to.")

  private String toolCallId;
 /**
   * The role of the messages author, in this case &#x60;tool&#x60;.
   * @return role
  **/
  @JsonProperty("role")
  public String getRole() {
    if (role == null) {
      return null;
    }
    return role.value();
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }

  public ChatCompletionRequestToolMessage role(RoleEnum role) {
    this.role = role;
    return this;
  }

 /**
   * Get content
   * @return content
  **/
  @JsonProperty("content")
  public ChatCompletionRequestToolMessageContent getContent() {
    return content;
  }

  public void setContent(ChatCompletionRequestToolMessageContent content) {
    this.content = content;
  }

  public ChatCompletionRequestToolMessage content(ChatCompletionRequestToolMessageContent content) {
    this.content = content;
    return this;
  }

 /**
   * Tool call that this message is responding to.
   * @return toolCallId
  **/
  @JsonProperty("tool_call_id")
  public String getToolCallId() {
    return toolCallId;
  }

  public void setToolCallId(String toolCallId) {
    this.toolCallId = toolCallId;
  }

  public ChatCompletionRequestToolMessage toolCallId(String toolCallId) {
    this.toolCallId = toolCallId;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatCompletionRequestToolMessage chatCompletionRequestToolMessage = (ChatCompletionRequestToolMessage) o;
    return Objects.equals(this.role, chatCompletionRequestToolMessage.role) &&
        Objects.equals(this.content, chatCompletionRequestToolMessage.content) &&
        Objects.equals(this.toolCallId, chatCompletionRequestToolMessage.toolCallId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(role, content, toolCallId);
  }

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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

