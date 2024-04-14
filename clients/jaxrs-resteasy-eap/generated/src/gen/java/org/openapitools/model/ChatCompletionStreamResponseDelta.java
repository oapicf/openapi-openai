package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ChatCompletionMessageToolCallChunk;
import org.openapitools.model.ChatCompletionStreamResponseDeltaFunctionCall;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="A chat completion delta generated by streamed model responses.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2024-04-14T13:42:04.201119898Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ChatCompletionStreamResponseDelta   {
  
  private String content;
  private ChatCompletionStreamResponseDeltaFunctionCall functionCall;
  private List<@Valid ChatCompletionMessageToolCallChunk> toolCalls;

  /**
   * The role of the author of this message.
   */
  public enum RoleEnum {
    SYSTEM("system"),

        USER("user"),

        ASSISTANT("assistant"),

        TOOL("tool");
    private String value;

    RoleEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private RoleEnum role;

  /**
   * The contents of the chunk message.
   **/
  
  @ApiModelProperty(value = "The contents of the chunk message.")
  @JsonProperty("content")
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("function_call")
  public ChatCompletionStreamResponseDeltaFunctionCall getFunctionCall() {
    return functionCall;
  }
  public void setFunctionCall(ChatCompletionStreamResponseDeltaFunctionCall functionCall) {
    this.functionCall = functionCall;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tool_calls")
  public List<@Valid ChatCompletionMessageToolCallChunk> getToolCalls() {
    return toolCalls;
  }
  public void setToolCalls(List<@Valid ChatCompletionMessageToolCallChunk> toolCalls) {
    this.toolCalls = toolCalls;
  }

  /**
   * The role of the author of this message.
   **/
  
  @ApiModelProperty(value = "The role of the author of this message.")
  @JsonProperty("role")
  public RoleEnum getRole() {
    return role;
  }
  public void setRole(RoleEnum role) {
    this.role = role;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

