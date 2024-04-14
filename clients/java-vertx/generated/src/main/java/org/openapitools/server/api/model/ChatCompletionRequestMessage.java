package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.ChatCompletionMessageToolCall;
import org.openapitools.server.api.model.ChatCompletionRequestAssistantMessage;
import org.openapitools.server.api.model.ChatCompletionRequestAssistantMessageFunctionCall;
import org.openapitools.server.api.model.ChatCompletionRequestFunctionMessage;
import org.openapitools.server.api.model.ChatCompletionRequestSystemMessage;
import org.openapitools.server.api.model.ChatCompletionRequestToolMessage;
import org.openapitools.server.api.model.ChatCompletionRequestUserMessage;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChatCompletionRequestMessage   {
  
  private String content;


  public enum RoleEnum {
    FUNCTION("function");

    private String value;

    RoleEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private RoleEnum role;
  private String name;
  private List<ChatCompletionMessageToolCall> toolCalls;
  private ChatCompletionRequestAssistantMessageFunctionCall functionCall;
  private String toolCallId;

  public ChatCompletionRequestMessage () {

  }

  public ChatCompletionRequestMessage (String content, RoleEnum role, String name, List<ChatCompletionMessageToolCall> toolCalls, ChatCompletionRequestAssistantMessageFunctionCall functionCall, String toolCallId) {
    this.content = content;
    this.role = role;
    this.name = name;
    this.toolCalls = toolCalls;
    this.functionCall = functionCall;
    this.toolCallId = toolCallId;
  }

    
  @JsonProperty("content")
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }

    
  @JsonProperty("role")
  public RoleEnum getRole() {
    return role;
  }
  public void setRole(RoleEnum role) {
    this.role = role;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("tool_calls")
  public List<ChatCompletionMessageToolCall> getToolCalls() {
    return toolCalls;
  }
  public void setToolCalls(List<ChatCompletionMessageToolCall> toolCalls) {
    this.toolCalls = toolCalls;
  }

    
  @JsonProperty("function_call")
  public ChatCompletionRequestAssistantMessageFunctionCall getFunctionCall() {
    return functionCall;
  }
  public void setFunctionCall(ChatCompletionRequestAssistantMessageFunctionCall functionCall) {
    this.functionCall = functionCall;
  }

    
  @JsonProperty("tool_call_id")
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
    ChatCompletionRequestMessage chatCompletionRequestMessage = (ChatCompletionRequestMessage) o;
    return Objects.equals(content, chatCompletionRequestMessage.content) &&
        Objects.equals(role, chatCompletionRequestMessage.role) &&
        Objects.equals(name, chatCompletionRequestMessage.name) &&
        Objects.equals(toolCalls, chatCompletionRequestMessage.toolCalls) &&
        Objects.equals(functionCall, chatCompletionRequestMessage.functionCall) &&
        Objects.equals(toolCallId, chatCompletionRequestMessage.toolCallId);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
