package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ChatCompletionMessageToolCallChunk;
import org.openapitools.model.ChatCompletionStreamResponseDeltaFunctionCall;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * A chat completion delta generated by streamed model responses.
 **/
@ApiModel(description="A chat completion delta generated by streamed model responses.")

public class ChatCompletionStreamResponseDelta  {
  
  @ApiModelProperty(value = "The contents of the chunk message.")
 /**
   * The contents of the chunk message.
  **/
  private String content;

  @ApiModelProperty(value = "")
  private ChatCompletionStreamResponseDeltaFunctionCall functionCall;

  @ApiModelProperty(value = "")
  private List<ChatCompletionMessageToolCallChunk> toolCalls = new ArrayList<>();

public enum RoleEnum {

SYSTEM(String.valueOf("system")), USER(String.valueOf("user")), ASSISTANT(String.valueOf("assistant")), TOOL(String.valueOf("tool"));


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

  @ApiModelProperty(value = "The role of the author of this message.")
 /**
   * The role of the author of this message.
  **/
  private RoleEnum role;
 /**
   * The contents of the chunk message.
   * @return content
  **/
  @JsonProperty("content")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public ChatCompletionStreamResponseDelta content(String content) {
    this.content = content;
    return this;
  }

 /**
   * Get functionCall
   * @return functionCall
  **/
  @JsonProperty("function_call")
  public ChatCompletionStreamResponseDeltaFunctionCall getFunctionCall() {
    return functionCall;
  }

  public void setFunctionCall(ChatCompletionStreamResponseDeltaFunctionCall functionCall) {
    this.functionCall = functionCall;
  }

  public ChatCompletionStreamResponseDelta functionCall(ChatCompletionStreamResponseDeltaFunctionCall functionCall) {
    this.functionCall = functionCall;
    return this;
  }

 /**
   * Get toolCalls
   * @return toolCalls
  **/
  @JsonProperty("tool_calls")
  public List<ChatCompletionMessageToolCallChunk> getToolCalls() {
    return toolCalls;
  }

  public void setToolCalls(List<ChatCompletionMessageToolCallChunk> toolCalls) {
    this.toolCalls = toolCalls;
  }

  public ChatCompletionStreamResponseDelta toolCalls(List<ChatCompletionMessageToolCallChunk> toolCalls) {
    this.toolCalls = toolCalls;
    return this;
  }

  public ChatCompletionStreamResponseDelta addToolCallsItem(ChatCompletionMessageToolCallChunk toolCallsItem) {
    this.toolCalls.add(toolCallsItem);
    return this;
  }

 /**
   * The role of the author of this message.
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

  public ChatCompletionStreamResponseDelta role(RoleEnum role) {
    this.role = role;
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
    ChatCompletionStreamResponseDelta chatCompletionStreamResponseDelta = (ChatCompletionStreamResponseDelta) o;
    return Objects.equals(this.content, chatCompletionStreamResponseDelta.content) &&
        Objects.equals(this.functionCall, chatCompletionStreamResponseDelta.functionCall) &&
        Objects.equals(this.toolCalls, chatCompletionStreamResponseDelta.toolCalls) &&
        Objects.equals(this.role, chatCompletionStreamResponseDelta.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, functionCall, toolCalls, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionStreamResponseDelta {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    functionCall: ").append(toIndentedString(functionCall)).append("\n");
    sb.append("    toolCalls: ").append(toIndentedString(toolCalls)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

