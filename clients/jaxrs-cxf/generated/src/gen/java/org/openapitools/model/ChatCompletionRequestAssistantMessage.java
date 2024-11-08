package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ChatCompletionMessageToolCall;
import org.openapitools.model.ChatCompletionRequestAssistantMessageFunctionCall;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ChatCompletionRequestAssistantMessage  {
  
  @ApiModelProperty(value = "The contents of the assistant message. Required unless `tool_calls` or `function_call` is specified. ")
 /**
   * The contents of the assistant message. Required unless `tool_calls` or `function_call` is specified. 
  **/
  private String content;

public enum RoleEnum {

ASSISTANT(String.valueOf("assistant"));


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

  @ApiModelProperty(required = true, value = "The role of the messages author, in this case `assistant`.")
 /**
   * The role of the messages author, in this case `assistant`.
  **/
  private RoleEnum role;

  @ApiModelProperty(value = "An optional name for the participant. Provides the model information to differentiate between participants of the same role.")
 /**
   * An optional name for the participant. Provides the model information to differentiate between participants of the same role.
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
 /**
   * The contents of the assistant message. Required unless &#x60;tool_calls&#x60; or &#x60;function_call&#x60; is specified. 
   * @return content
  **/
  @JsonProperty("content")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public ChatCompletionRequestAssistantMessage content(String content) {
    this.content = content;
    return this;
  }

 /**
   * The role of the messages author, in this case &#x60;assistant&#x60;.
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

  public ChatCompletionRequestAssistantMessage role(RoleEnum role) {
    this.role = role;
    return this;
  }

 /**
   * An optional name for the participant. Provides the model information to differentiate between participants of the same role.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ChatCompletionRequestAssistantMessage name(String name) {
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

  public ChatCompletionRequestAssistantMessage toolCalls(List<@Valid ChatCompletionMessageToolCall> toolCalls) {
    this.toolCalls = toolCalls;
    return this;
  }

  public ChatCompletionRequestAssistantMessage addToolCallsItem(ChatCompletionMessageToolCall toolCallsItem) {
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

  public ChatCompletionRequestAssistantMessage functionCall(ChatCompletionRequestAssistantMessageFunctionCall functionCall) {
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
    ChatCompletionRequestAssistantMessage chatCompletionRequestAssistantMessage = (ChatCompletionRequestAssistantMessage) o;
    return Objects.equals(this.content, chatCompletionRequestAssistantMessage.content) &&
        Objects.equals(this.role, chatCompletionRequestAssistantMessage.role) &&
        Objects.equals(this.name, chatCompletionRequestAssistantMessage.name) &&
        Objects.equals(this.toolCalls, chatCompletionRequestAssistantMessage.toolCalls) &&
        Objects.equals(this.functionCall, chatCompletionRequestAssistantMessage.functionCall);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, role, name, toolCalls, functionCall);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionRequestAssistantMessage {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    toolCalls: ").append(toIndentedString(toolCalls)).append("\n");
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

