package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ChatCompletionMessageToolCall;
import org.openapitools.model.ChatCompletionRequestAssistantMessageAudio;
import org.openapitools.model.ChatCompletionRequestAssistantMessageFunctionCall;
import org.openapitools.model.ChatCompletionRequestFunctionMessage;
import org.openapitools.model.ChatCompletionRequestSystemMessage;
import org.openapitools.model.ChatCompletionRequestToolMessage;
import org.openapitools.model.ChatCompletionRequestUserMessage;
import org.openapitools.model.FineTuneChatCompletionRequestAssistantMessage;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class FineTuneChatRequestInputMessagesInner   {
  
  private String content;


public enum RoleEnum {

    @JsonProperty("function") FUNCTION(String.valueOf("function"));


    private String value;

    RoleEnum(String v) {
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

  private RoleEnum role;

  private String name;


public enum WeightEnum {

    @JsonProperty("0") NUMBER_0(Integer.valueOf(0)), @JsonProperty("1") NUMBER_1(Integer.valueOf(1));


    private Integer value;

    WeightEnum(Integer v) {
        value = v;
    }

    public Integer value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static WeightEnum fromValue(Integer value) {
        for (WeightEnum b : WeightEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private WeightEnum weight;

  private String refusal;

  private ChatCompletionRequestAssistantMessageAudio audio;

  private List<@Valid ChatCompletionMessageToolCall> toolCalls = new ArrayList<>();

  private ChatCompletionRequestAssistantMessageFunctionCall functionCall;

  private String toolCallId;

  /**
   * The contents of the function message.
   **/
  public FineTuneChatRequestInputMessagesInner content(String content) {
    this.content = content;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The contents of the function message.")
  @JsonProperty("content")
  @NotNull
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }


  /**
   * The role of the messages author, in this case &#x60;function&#x60;.
   **/
  public FineTuneChatRequestInputMessagesInner role(RoleEnum role) {
    this.role = role;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The role of the messages author, in this case `function`.")
  @JsonProperty("role")
  @NotNull
  public RoleEnum getRole() {
    return role;
  }
  public void setRole(RoleEnum role) {
    this.role = role;
  }


  /**
   * The name of the function to call.
   **/
  public FineTuneChatRequestInputMessagesInner name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name of the function to call.")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Controls whether the assistant message is trained against (0 or 1)
   **/
  public FineTuneChatRequestInputMessagesInner weight(WeightEnum weight) {
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


  /**
   * The refusal message by the assistant.
   **/
  public FineTuneChatRequestInputMessagesInner refusal(String refusal) {
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
   **/
  public FineTuneChatRequestInputMessagesInner audio(ChatCompletionRequestAssistantMessageAudio audio) {
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
  public FineTuneChatRequestInputMessagesInner toolCalls(List<@Valid ChatCompletionMessageToolCall> toolCalls) {
    this.toolCalls = toolCalls;
    return this;
  }

  
  @ApiModelProperty(value = "The tool calls generated by the model, such as function calls.")
  @JsonProperty("tool_calls")
  public List<@Valid ChatCompletionMessageToolCall> getToolCalls() {
    return toolCalls;
  }
  public void setToolCalls(List<@Valid ChatCompletionMessageToolCall> toolCalls) {
    this.toolCalls = toolCalls;
  }

  public FineTuneChatRequestInputMessagesInner addToolCallsItem(ChatCompletionMessageToolCall toolCallsItem) {
    if (this.toolCalls == null) {
      this.toolCalls = new ArrayList<>();
    }
    this.toolCalls.add(toolCallsItem);
    return this;
  }


  /**
   **/
  public FineTuneChatRequestInputMessagesInner functionCall(ChatCompletionRequestAssistantMessageFunctionCall functionCall) {
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
   * Tool call that this message is responding to.
   **/
  public FineTuneChatRequestInputMessagesInner toolCallId(String toolCallId) {
    this.toolCallId = toolCallId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Tool call that this message is responding to.")
  @JsonProperty("tool_call_id")
  @NotNull
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
    return Objects.equals(this.content, fineTuneChatRequestInputMessagesInner.content) &&
        Objects.equals(this.role, fineTuneChatRequestInputMessagesInner.role) &&
        Objects.equals(this.name, fineTuneChatRequestInputMessagesInner.name) &&
        Objects.equals(this.weight, fineTuneChatRequestInputMessagesInner.weight) &&
        Objects.equals(this.refusal, fineTuneChatRequestInputMessagesInner.refusal) &&
        Objects.equals(this.audio, fineTuneChatRequestInputMessagesInner.audio) &&
        Objects.equals(this.toolCalls, fineTuneChatRequestInputMessagesInner.toolCalls) &&
        Objects.equals(this.functionCall, fineTuneChatRequestInputMessagesInner.functionCall) &&
        Objects.equals(this.toolCallId, fineTuneChatRequestInputMessagesInner.toolCallId);
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

