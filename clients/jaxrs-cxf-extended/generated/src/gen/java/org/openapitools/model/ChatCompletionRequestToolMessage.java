package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ChatCompletionRequestToolMessage  {
  
public enum RoleEnum {

    @JsonProperty("tool") TOOL(String.valueOf("tool"));

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

 /**
  * The contents of the tool message.
  */
  @ApiModelProperty(required = true, value = "The contents of the tool message.")
  private String content;

 /**
  * Tool call that this message is responding to.
  */
  @ApiModelProperty(required = true, value = "Tool call that this message is responding to.")
  private String toolCallId;
 /**
  * The role of the messages author, in this case &#x60;tool&#x60;.
  * @return role
  */
  @JsonProperty("role")
  @NotNull
  public String getRole() {
    return role == null ? null : role.value();
  }

  /**
   * Sets the <code>role</code> property.
   */
 public void setRole(RoleEnum role) {
    this.role = role;
  }

  /**
   * Sets the <code>role</code> property.
   */
  public ChatCompletionRequestToolMessage role(RoleEnum role) {
    this.role = role;
    return this;
  }

 /**
  * The contents of the tool message.
  * @return content
  */
  @JsonProperty("content")
  @NotNull
  public String getContent() {
    return content;
  }

  /**
   * Sets the <code>content</code> property.
   */
 public void setContent(String content) {
    this.content = content;
  }

  /**
   * Sets the <code>content</code> property.
   */
  public ChatCompletionRequestToolMessage content(String content) {
    this.content = content;
    return this;
  }

 /**
  * Tool call that this message is responding to.
  * @return toolCallId
  */
  @JsonProperty("tool_call_id")
  @NotNull
  public String getToolCallId() {
    return toolCallId;
  }

  /**
   * Sets the <code>toolCallId</code> property.
   */
 public void setToolCallId(String toolCallId) {
    this.toolCallId = toolCallId;
  }

  /**
   * Sets the <code>toolCallId</code> property.
   */
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

