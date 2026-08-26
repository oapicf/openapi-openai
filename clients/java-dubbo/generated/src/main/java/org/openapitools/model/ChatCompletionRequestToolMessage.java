package org.openapitools.model;

import org.openapitools.model.ChatCompletionRequestToolMessageContent;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ChatCompletionRequestToolMessage implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The role of the messages author, in this case &#x60;tool&#x60;.
   */
  @JsonProperty("role")
  private String role;

  @JsonProperty("content")
  private ChatCompletionRequestToolMessageContent content;

  /**
   * Tool call that this message is responding to.
   */
  @JsonProperty("tool_call_id")
  private String toolCallId;

  /**
   * The role of the messages author, in this case &#x60;tool&#x60;.
   * @return role
   */
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  /**
   * 
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
