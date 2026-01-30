package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.ChatCompletionMessageToolCall;
import org.openapitools.vertxweb.server.model.ChatCompletionRequestAssistantMessageAudio;
import org.openapitools.vertxweb.server.model.ChatCompletionRequestAssistantMessageFunctionCall;
import org.openapitools.vertxweb.server.model.ChatCompletionRequestFunctionMessage;
import org.openapitools.vertxweb.server.model.ChatCompletionRequestSystemMessage;
import org.openapitools.vertxweb.server.model.ChatCompletionRequestToolMessage;
import org.openapitools.vertxweb.server.model.ChatCompletionRequestUserMessage;
import org.openapitools.vertxweb.server.model.FineTuneChatCompletionRequestAssistantMessage;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FineTuneChatRequestInputMessagesInner   {
  
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


  public enum WeightEnum {
    NUMBER_0(0),
    NUMBER_1(1);

    private String value;

    WeightEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private WeightEnum weight;
  private String refusal;
  private ChatCompletionRequestAssistantMessageAudio audio;
  private List<ChatCompletionMessageToolCall> toolCalls = new ArrayList<>();
  private ChatCompletionRequestAssistantMessageFunctionCall functionCall;
  private String toolCallId;

  public FineTuneChatRequestInputMessagesInner () {

  }

  public FineTuneChatRequestInputMessagesInner (String content, RoleEnum role, String name, WeightEnum weight, String refusal, ChatCompletionRequestAssistantMessageAudio audio, List<ChatCompletionMessageToolCall> toolCalls, ChatCompletionRequestAssistantMessageFunctionCall functionCall, String toolCallId) {
    this.content = content;
    this.role = role;
    this.name = name;
    this.weight = weight;
    this.refusal = refusal;
    this.audio = audio;
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

    
  @JsonProperty("weight")
  public WeightEnum getWeight() {
    return weight;
  }
  public void setWeight(WeightEnum weight) {
    this.weight = weight;
  }

    
  @JsonProperty("refusal")
  public String getRefusal() {
    return refusal;
  }
  public void setRefusal(String refusal) {
    this.refusal = refusal;
  }

    
  @JsonProperty("audio")
  public ChatCompletionRequestAssistantMessageAudio getAudio() {
    return audio;
  }
  public void setAudio(ChatCompletionRequestAssistantMessageAudio audio) {
    this.audio = audio;
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
    FineTuneChatRequestInputMessagesInner fineTuneChatRequestInputMessagesInner = (FineTuneChatRequestInputMessagesInner) o;
    return Objects.equals(content, fineTuneChatRequestInputMessagesInner.content) &&
        Objects.equals(role, fineTuneChatRequestInputMessagesInner.role) &&
        Objects.equals(name, fineTuneChatRequestInputMessagesInner.name) &&
        Objects.equals(weight, fineTuneChatRequestInputMessagesInner.weight) &&
        Objects.equals(refusal, fineTuneChatRequestInputMessagesInner.refusal) &&
        Objects.equals(audio, fineTuneChatRequestInputMessagesInner.audio) &&
        Objects.equals(toolCalls, fineTuneChatRequestInputMessagesInner.toolCalls) &&
        Objects.equals(functionCall, fineTuneChatRequestInputMessagesInner.functionCall) &&
        Objects.equals(toolCallId, fineTuneChatRequestInputMessagesInner.toolCallId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, role, name, weight, refusal, audio, toolCalls, functionCall, toolCallId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FineTuneChatRequestInputMessagesInner {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    refusal: ").append(toIndentedString(refusal)).append("\n");
    sb.append("    audio: ").append(toIndentedString(audio)).append("\n");
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
