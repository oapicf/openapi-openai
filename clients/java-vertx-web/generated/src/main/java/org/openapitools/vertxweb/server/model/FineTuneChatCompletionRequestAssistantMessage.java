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
import org.openapitools.vertxweb.server.model.ChatCompletionRequestAssistantMessageContent;
import org.openapitools.vertxweb.server.model.ChatCompletionRequestAssistantMessageFunctionCall;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FineTuneChatCompletionRequestAssistantMessage   {
  
  private ChatCompletionRequestAssistantMessageContent content;
  private String refusal;


  public enum RoleEnum {
    ASSISTANT("assistant");

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
  private ChatCompletionRequestAssistantMessageAudio audio;
  private List<ChatCompletionMessageToolCall> toolCalls = new ArrayList<>();
  private ChatCompletionRequestAssistantMessageFunctionCall functionCall;


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

  public FineTuneChatCompletionRequestAssistantMessage () {

  }

  public FineTuneChatCompletionRequestAssistantMessage (ChatCompletionRequestAssistantMessageContent content, String refusal, RoleEnum role, String name, ChatCompletionRequestAssistantMessageAudio audio, List<ChatCompletionMessageToolCall> toolCalls, ChatCompletionRequestAssistantMessageFunctionCall functionCall, WeightEnum weight) {
    this.content = content;
    this.refusal = refusal;
    this.role = role;
    this.name = name;
    this.audio = audio;
    this.toolCalls = toolCalls;
    this.functionCall = functionCall;
    this.weight = weight;
  }

    
  @JsonProperty("content")
  public ChatCompletionRequestAssistantMessageContent getContent() {
    return content;
  }
  public void setContent(ChatCompletionRequestAssistantMessageContent content) {
    this.content = content;
  }

    
  @JsonProperty("refusal")
  public String getRefusal() {
    return refusal;
  }
  public void setRefusal(String refusal) {
    this.refusal = refusal;
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

    
  @JsonProperty("weight")
  public WeightEnum getWeight() {
    return weight;
  }
  public void setWeight(WeightEnum weight) {
    this.weight = weight;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FineTuneChatCompletionRequestAssistantMessage fineTuneChatCompletionRequestAssistantMessage = (FineTuneChatCompletionRequestAssistantMessage) o;
    return Objects.equals(content, fineTuneChatCompletionRequestAssistantMessage.content) &&
        Objects.equals(refusal, fineTuneChatCompletionRequestAssistantMessage.refusal) &&
        Objects.equals(role, fineTuneChatCompletionRequestAssistantMessage.role) &&
        Objects.equals(name, fineTuneChatCompletionRequestAssistantMessage.name) &&
        Objects.equals(audio, fineTuneChatCompletionRequestAssistantMessage.audio) &&
        Objects.equals(toolCalls, fineTuneChatCompletionRequestAssistantMessage.toolCalls) &&
        Objects.equals(functionCall, fineTuneChatCompletionRequestAssistantMessage.functionCall) &&
        Objects.equals(weight, fineTuneChatCompletionRequestAssistantMessage.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, refusal, role, name, audio, toolCalls, functionCall, weight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FineTuneChatCompletionRequestAssistantMessage {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    refusal: ").append(toIndentedString(refusal)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    audio: ").append(toIndentedString(audio)).append("\n");
    sb.append("    toolCalls: ").append(toIndentedString(toolCalls)).append("\n");
    sb.append("    functionCall: ").append(toIndentedString(functionCall)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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
