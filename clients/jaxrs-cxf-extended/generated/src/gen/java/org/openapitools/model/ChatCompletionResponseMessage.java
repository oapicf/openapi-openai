package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ChatCompletionMessageToolCall;
import org.openapitools.model.ChatCompletionRequestAssistantMessageFunctionCall;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * A chat completion message generated by the model.
 */
@ApiModel(description="A chat completion message generated by the model.")

public class ChatCompletionResponseMessage  {
  
 /**
  * The contents of the message.
  */
  @ApiModelProperty(required = true, value = "The contents of the message.")
  private String content;

 /**
  * The tool calls generated by the model, such as function calls.
  */
  @ApiModelProperty(value = "The tool calls generated by the model, such as function calls.")
  @Valid
  private List<@Valid ChatCompletionMessageToolCall> toolCalls;

public enum RoleEnum {

    @JsonProperty("assistant") ASSISTANT(String.valueOf("assistant"));

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
  * The role of the author of this message.
  */
  @ApiModelProperty(required = true, value = "The role of the author of this message.")
  private RoleEnum role;

  @ApiModelProperty(value = "")
  @Valid
  private ChatCompletionRequestAssistantMessageFunctionCall functionCall;
 /**
  * The contents of the message.
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
  public ChatCompletionResponseMessage content(String content) {
    this.content = content;
    return this;
  }

 /**
  * The tool calls generated by the model, such as function calls.
  * @return toolCalls
  */
  @JsonProperty("tool_calls")
  public List<@Valid ChatCompletionMessageToolCall> getToolCalls() {
    return toolCalls;
  }

  /**
   * Sets the <code>toolCalls</code> property.
   */
 public void setToolCalls(List<@Valid ChatCompletionMessageToolCall> toolCalls) {
    this.toolCalls = toolCalls;
  }

  /**
   * Sets the <code>toolCalls</code> property.
   */
  public ChatCompletionResponseMessage toolCalls(List<@Valid ChatCompletionMessageToolCall> toolCalls) {
    this.toolCalls = toolCalls;
    return this;
  }

  /**
   * Adds a new item to the <code>toolCalls</code> list.
   */
  public ChatCompletionResponseMessage addToolCallsItem(ChatCompletionMessageToolCall toolCallsItem) {
    this.toolCalls.add(toolCallsItem);
    return this;
  }

 /**
  * The role of the author of this message.
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
  public ChatCompletionResponseMessage role(RoleEnum role) {
    this.role = role;
    return this;
  }

 /**
  * Get functionCall
  * @return functionCall
  */
  @JsonProperty("function_call")
  public ChatCompletionRequestAssistantMessageFunctionCall getFunctionCall() {
    return functionCall;
  }

  /**
   * Sets the <code>functionCall</code> property.
   */
 public void setFunctionCall(ChatCompletionRequestAssistantMessageFunctionCall functionCall) {
    this.functionCall = functionCall;
  }

  /**
   * Sets the <code>functionCall</code> property.
   */
  public ChatCompletionResponseMessage functionCall(ChatCompletionRequestAssistantMessageFunctionCall functionCall) {
    this.functionCall = functionCall;
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
    ChatCompletionResponseMessage chatCompletionResponseMessage = (ChatCompletionResponseMessage) o;
    return Objects.equals(this.content, chatCompletionResponseMessage.content) &&
        Objects.equals(this.toolCalls, chatCompletionResponseMessage.toolCalls) &&
        Objects.equals(this.role, chatCompletionResponseMessage.role) &&
        Objects.equals(this.functionCall, chatCompletionResponseMessage.functionCall);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, toolCalls, role, functionCall);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionResponseMessage {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    toolCalls: ").append(toIndentedString(toolCalls)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    functionCall: ").append(toIndentedString(functionCall)).append("\n");
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
