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
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ChatCompletionMessageToolCall;
import org.openapitools.model.ChatCompletionRequestAssistantMessageAudio;
import org.openapitools.model.ChatCompletionRequestAssistantMessageContent;
import org.openapitools.model.ChatCompletionRequestAssistantMessageFunctionCall;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-01-29T14:07:47.634062747Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class FineTuneChatCompletionRequestAssistantMessage   {
  @JsonProperty("content")
  private ChatCompletionRequestAssistantMessageContent content;

  @JsonProperty("refusal")
  private String refusal;

  /**
   * The role of the messages author, in this case `assistant`.
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
    public static RoleEnum fromValue(String text) {
      for (RoleEnum b : RoleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("role")
  private RoleEnum role;

  @JsonProperty("name")
  private String name;

  @JsonProperty("audio")
  private ChatCompletionRequestAssistantMessageAudio audio;

  @JsonProperty("tool_calls")
  private List<ChatCompletionMessageToolCall> toolCalls = null;

  @JsonProperty("function_call")
  private ChatCompletionRequestAssistantMessageFunctionCall functionCall;

  /**
   * Controls whether the assistant message is trained against (0 or 1)
   */
  public enum WeightEnum {
    NUMBER_0(0),
    
    NUMBER_1(1);

    private Integer value;

    WeightEnum(Integer value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static WeightEnum fromValue(String text) {
      for (WeightEnum b : WeightEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("weight")
  private WeightEnum weight;

  /**
   **/
  public FineTuneChatCompletionRequestAssistantMessage content(ChatCompletionRequestAssistantMessageContent content) {
    this.content = content;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("content")
  public ChatCompletionRequestAssistantMessageContent getContent() {
    return content;
  }
  public void setContent(ChatCompletionRequestAssistantMessageContent content) {
    this.content = content;
  }

  /**
   * The refusal message by the assistant.
   **/
  public FineTuneChatCompletionRequestAssistantMessage refusal(String refusal) {
    this.refusal = refusal;
    return this;
  }

  
  @ApiModelProperty(value = "The refusal message by the assistant.")
  @JsonProperty("refusal")
  public String getRefusal() {
    return refusal;
  }
  public void setRefusal(String refusal) {
    this.refusal = refusal;
  }

  /**
   * The role of the messages author, in this case `assistant`.
   **/
  public FineTuneChatCompletionRequestAssistantMessage role(RoleEnum role) {
    this.role = role;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The role of the messages author, in this case `assistant`.")
  @JsonProperty("role")
  public RoleEnum getRole() {
    return role;
  }
  public void setRole(RoleEnum role) {
    this.role = role;
  }

  /**
   * An optional name for the participant. Provides the model information to differentiate between participants of the same role.
   **/
  public FineTuneChatCompletionRequestAssistantMessage name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "An optional name for the participant. Provides the model information to differentiate between participants of the same role.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public FineTuneChatCompletionRequestAssistantMessage audio(ChatCompletionRequestAssistantMessageAudio audio) {
    this.audio = audio;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("audio")
  public ChatCompletionRequestAssistantMessageAudio getAudio() {
    return audio;
  }
  public void setAudio(ChatCompletionRequestAssistantMessageAudio audio) {
    this.audio = audio;
  }

  /**
   * The tool calls generated by the model, such as function calls.
   **/
  public FineTuneChatCompletionRequestAssistantMessage toolCalls(List<ChatCompletionMessageToolCall> toolCalls) {
    this.toolCalls = toolCalls;
    return this;
  }

  
  @ApiModelProperty(value = "The tool calls generated by the model, such as function calls.")
  @JsonProperty("tool_calls")
  public List<ChatCompletionMessageToolCall> getToolCalls() {
    return toolCalls;
  }
  public void setToolCalls(List<ChatCompletionMessageToolCall> toolCalls) {
    this.toolCalls = toolCalls;
  }

  /**
   **/
  public FineTuneChatCompletionRequestAssistantMessage functionCall(ChatCompletionRequestAssistantMessageFunctionCall functionCall) {
    this.functionCall = functionCall;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("function_call")
  public ChatCompletionRequestAssistantMessageFunctionCall getFunctionCall() {
    return functionCall;
  }
  public void setFunctionCall(ChatCompletionRequestAssistantMessageFunctionCall functionCall) {
    this.functionCall = functionCall;
  }

  /**
   * Controls whether the assistant message is trained against (0 or 1)
   **/
  public FineTuneChatCompletionRequestAssistantMessage weight(WeightEnum weight) {
    this.weight = weight;
    return this;
  }

  
  @ApiModelProperty(value = "Controls whether the assistant message is trained against (0 or 1)")
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

