package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ChatCompletionRequestToolMessageContent;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("ChatCompletionRequestToolMessage")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ChatCompletionRequestToolMessage   {
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
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static RoleEnum fromString(String s) {
        for (RoleEnum b : RoleEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
    public static RoleEnum fromValue(String value) {
        for (RoleEnum b : RoleEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private RoleEnum role;
  private ChatCompletionRequestToolMessageContent content;
  private String toolCallId;

  public ChatCompletionRequestToolMessage() {
  }

  @JsonCreator
  public ChatCompletionRequestToolMessage(
    @JsonProperty(required = true, value = "role") RoleEnum role,
    @JsonProperty(required = true, value = "content") ChatCompletionRequestToolMessageContent content,
    @JsonProperty(required = true, value = "tool_call_id") String toolCallId
  ) {
    this.role = role;
    this.content = content;
    this.toolCallId = toolCallId;
  }

  /**
   * The role of the messages author, in this case &#x60;tool&#x60;.
   **/
  public ChatCompletionRequestToolMessage role(RoleEnum role) {
    this.role = role;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The role of the messages author, in this case `tool`.")
  @JsonProperty(required = true, value = "role")
  @NotNull public RoleEnum getRole() {
    return role;
  }

  @JsonProperty(required = true, value = "role")
  public void setRole(RoleEnum role) {
    this.role = role;
  }

  /**
   **/
  public ChatCompletionRequestToolMessage content(ChatCompletionRequestToolMessageContent content) {
    this.content = content;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "content")
  @NotNull @Valid public ChatCompletionRequestToolMessageContent getContent() {
    return content;
  }

  @JsonProperty(required = true, value = "content")
  public void setContent(ChatCompletionRequestToolMessageContent content) {
    this.content = content;
  }

  /**
   * Tool call that this message is responding to.
   **/
  public ChatCompletionRequestToolMessage toolCallId(String toolCallId) {
    this.toolCallId = toolCallId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Tool call that this message is responding to.")
  @JsonProperty(required = true, value = "tool_call_id")
  @NotNull public String getToolCallId() {
    return toolCallId;
  }

  @JsonProperty(required = true, value = "tool_call_id")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

