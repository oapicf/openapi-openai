package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ChatCompletionMessageToolCall;
import org.openapitools.model.ChatCompletionRequestAssistantMessage;
import org.openapitools.model.ChatCompletionRequestAssistantMessageFunctionCall;
import org.openapitools.model.ChatCompletionRequestFunctionMessage;
import org.openapitools.model.ChatCompletionRequestSystemMessage;
import org.openapitools.model.ChatCompletionRequestToolMessage;
import org.openapitools.model.ChatCompletionRequestUserMessage;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ChatCompletionRequestMessage  {
  
  @ApiModelProperty(required = true, value = "The contents of the function message.")
 /**
   * The contents of the function message.
  **/
  private String content;

public enum RoleEnum {

FUNCTION(String.valueOf("function"));


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

  @ApiModelProperty(required = true, value = "The role of the messages author, in this case `function`.")
 /**
   * The role of the messages author, in this case `function`.
  **/
  private RoleEnum role;

  @ApiModelProperty(required = true, value = "The name of the function to call.")
 /**
   * The name of the function to call.
  **/
  private String name;

  @ApiModelProperty(value = "The tool calls generated by the model, such as function calls.")
  @Valid
 /**
   * The tool calls generated by the model, such as function calls.
  **/
  private List<@Valid ChatCompletionMessageToolCall> toolCalls = new ArrayList<>();

  @ApiModelProperty(value = "")
  @Valid
  private ChatCompletionRequestAssistantMessageFunctionCall functionCall;

  @ApiModelProperty(required = true, value = "Tool call that this message is responding to.")
 /**
   * Tool call that this message is responding to.
  **/
  private String toolCallId;
 /**
   * The contents of the function message.
   * @return content
  **/
  @JsonProperty("content")
  @NotNull
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public ChatCompletionRequestMessage content(String content) {
    this.content = content;
    return this;
  }

 /**
   * The role of the messages author, in this case &#x60;function&#x60;.
   * @return role
  **/
  @JsonProperty("role")
  @NotNull
  public String getRole() {
    if (role == null) {
      return null;
    }
    return role.value();
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }

  public ChatCompletionRequestMessage role(RoleEnum role) {
    this.role = role;
    return this;
  }

 /**
   * The name of the function to call.
   * @return name
  **/
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ChatCompletionRequestMessage name(String name) {
    this.name = name;
    return this;
  }

 /**
   * The tool calls generated by the model, such as function calls.
   * @return toolCalls
  **/
  @JsonProperty("tool_calls")
  public List<@Valid ChatCompletionMessageToolCall> getToolCalls() {
    return toolCalls;
  }

  public void setToolCalls(List<@Valid ChatCompletionMessageToolCall> toolCalls) {
    this.toolCalls = toolCalls;
  }

  public ChatCompletionRequestMessage toolCalls(List<@Valid ChatCompletionMessageToolCall> toolCalls) {
    this.toolCalls = toolCalls;
    return this;
  }

  public ChatCompletionRequestMessage addToolCallsItem(ChatCompletionMessageToolCall toolCallsItem) {
    this.toolCalls.add(toolCallsItem);
    return this;
  }

 /**
   * Get functionCall
   * @return functionCall
  **/
  @JsonProperty("function_call")
  public ChatCompletionRequestAssistantMessageFunctionCall getFunctionCall() {
    return functionCall;
  }

  public void setFunctionCall(ChatCompletionRequestAssistantMessageFunctionCall functionCall) {
    this.functionCall = functionCall;
  }

  public ChatCompletionRequestMessage functionCall(ChatCompletionRequestAssistantMessageFunctionCall functionCall) {
    this.functionCall = functionCall;
    return this;
  }

 /**
   * Tool call that this message is responding to.
   * @return toolCallId
  **/
  @JsonProperty("tool_call_id")
  @NotNull
  public String getToolCallId() {
    return toolCallId;
  }

  public void setToolCallId(String toolCallId) {
    this.toolCallId = toolCallId;
  }

  public ChatCompletionRequestMessage toolCallId(String toolCallId) {
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
    ChatCompletionRequestMessage chatCompletionRequestMessage = (ChatCompletionRequestMessage) o;
    return Objects.equals(this.content, chatCompletionRequestMessage.content) &&
        Objects.equals(this.role, chatCompletionRequestMessage.role) &&
        Objects.equals(this.name, chatCompletionRequestMessage.name) &&
        Objects.equals(this.toolCalls, chatCompletionRequestMessage.toolCalls) &&
        Objects.equals(this.functionCall, chatCompletionRequestMessage.functionCall) &&
        Objects.equals(this.toolCallId, chatCompletionRequestMessage.toolCallId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, role, name, toolCalls, functionCall, toolCallId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionRequestMessage {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    toolCalls: ").append(toIndentedString(toolCalls)).append("\n");
    sb.append("    functionCall: ").append(toIndentedString(functionCall)).append("\n");
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

