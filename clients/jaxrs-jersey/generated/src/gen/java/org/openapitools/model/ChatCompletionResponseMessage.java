/*
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ChatCompletionMessageToolCall;
import org.openapitools.model.ChatCompletionRequestAssistantMessageFunctionCall;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * A chat completion message generated by the model.
 */
@ApiModel(description = "A chat completion message generated by the model.")
@JsonPropertyOrder({
  ChatCompletionResponseMessage.JSON_PROPERTY_CONTENT,
  ChatCompletionResponseMessage.JSON_PROPERTY_TOOL_CALLS,
  ChatCompletionResponseMessage.JSON_PROPERTY_ROLE,
  ChatCompletionResponseMessage.JSON_PROPERTY_FUNCTION_CALL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-11-03T11:08:40.472203335Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ChatCompletionResponseMessage   {
  public static final String JSON_PROPERTY_CONTENT = "content";
  @JsonProperty(JSON_PROPERTY_CONTENT)
  private String content;

  public static final String JSON_PROPERTY_TOOL_CALLS = "tool_calls";
  @JsonProperty(JSON_PROPERTY_TOOL_CALLS)
  private List<@Valid ChatCompletionMessageToolCall> toolCalls = new ArrayList<>();

  /**
   * The role of the author of this message.
   */
  public enum RoleEnum {
    ASSISTANT("assistant");

    private String value;

    RoleEnum(String value) {
      this.value = value;
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

  public static final String JSON_PROPERTY_ROLE = "role";
  @JsonProperty(JSON_PROPERTY_ROLE)
  private RoleEnum role;

  public static final String JSON_PROPERTY_FUNCTION_CALL = "function_call";
  @JsonProperty(JSON_PROPERTY_FUNCTION_CALL)
  private ChatCompletionRequestAssistantMessageFunctionCall functionCall;

  public ChatCompletionResponseMessage content(String content) {
    this.content = content;
    return this;
  }

  /**
   * The contents of the message.
   * @return content
   **/
  @JsonProperty(value = "content")
  @ApiModelProperty(required = true, value = "The contents of the message.")
  @NotNull 
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public ChatCompletionResponseMessage toolCalls(List<@Valid ChatCompletionMessageToolCall> toolCalls) {
    this.toolCalls = toolCalls;
    return this;
  }

  public ChatCompletionResponseMessage addToolCallsItem(ChatCompletionMessageToolCall toolCallsItem) {
    if (this.toolCalls == null) {
      this.toolCalls = new ArrayList<>();
    }
    this.toolCalls.add(toolCallsItem);
    return this;
  }

  /**
   * The tool calls generated by the model, such as function calls.
   * @return toolCalls
   **/
  @JsonProperty(value = "tool_calls")
  @ApiModelProperty(value = "The tool calls generated by the model, such as function calls.")
  @Valid 
  public List<@Valid ChatCompletionMessageToolCall> getToolCalls() {
    return toolCalls;
  }

  public void setToolCalls(List<@Valid ChatCompletionMessageToolCall> toolCalls) {
    this.toolCalls = toolCalls;
  }

  public ChatCompletionResponseMessage role(RoleEnum role) {
    this.role = role;
    return this;
  }

  /**
   * The role of the author of this message.
   * @return role
   **/
  @JsonProperty(value = "role")
  @ApiModelProperty(required = true, value = "The role of the author of this message.")
  @NotNull 
  public RoleEnum getRole() {
    return role;
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }

  public ChatCompletionResponseMessage functionCall(ChatCompletionRequestAssistantMessageFunctionCall functionCall) {
    this.functionCall = functionCall;
    return this;
  }

  /**
   * Get functionCall
   * @return functionCall
   **/
  @JsonProperty(value = "function_call")
  @ApiModelProperty(value = "")
  @Valid 
  public ChatCompletionRequestAssistantMessageFunctionCall getFunctionCall() {
    return functionCall;
  }

  public void setFunctionCall(ChatCompletionRequestAssistantMessageFunctionCall functionCall) {
    this.functionCall = functionCall;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

