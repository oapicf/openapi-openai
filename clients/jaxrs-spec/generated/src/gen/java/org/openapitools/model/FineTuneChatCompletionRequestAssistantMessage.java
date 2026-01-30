package org.openapitools.model;

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
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("FineTuneChatCompletionRequestAssistantMessage")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class FineTuneChatCompletionRequestAssistantMessage   {
  private ChatCompletionRequestAssistantMessageContent content;
  private String refusal;
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

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static RoleEnum fromString(String s) {
        for (RoleEnum b : RoleEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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

  private RoleEnum role;
  private String name;
  private ChatCompletionRequestAssistantMessageAudio audio;
  private @Valid List<@Valid ChatCompletionMessageToolCall> toolCalls = new ArrayList<>();
  private ChatCompletionRequestAssistantMessageFunctionCall functionCall;
  public enum WeightEnum {

    NUMBER_0(Integer.valueOf(0)), NUMBER_1(Integer.valueOf(1));


    private Integer value;

    WeightEnum (Integer v) {
        value = v;
    }

    public Integer value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into Integer, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static WeightEnum fromString(String s) {
        for (WeightEnum b : WeightEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
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

  public FineTuneChatCompletionRequestAssistantMessage() {
  }

  @JsonCreator
  public FineTuneChatCompletionRequestAssistantMessage(
    @JsonProperty(required = true, value = "role") RoleEnum role
  ) {
    this.role = role;
  }

  /**
   **/
  public FineTuneChatCompletionRequestAssistantMessage content(ChatCompletionRequestAssistantMessageContent content) {
    this.content = content;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("content")
  @Valid public ChatCompletionRequestAssistantMessageContent getContent() {
    return content;
  }

  @JsonProperty("content")
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

  @JsonProperty("refusal")
  public void setRefusal(String refusal) {
    this.refusal = refusal;
  }

  /**
   * The role of the messages author, in this case &#x60;assistant&#x60;.
   **/
  public FineTuneChatCompletionRequestAssistantMessage role(RoleEnum role) {
    this.role = role;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The role of the messages author, in this case `assistant`.")
  @JsonProperty(required = true, value = "role")
  @NotNull public RoleEnum getRole() {
    return role;
  }

  @JsonProperty(required = true, value = "role")
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

  @JsonProperty("name")
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
  @Valid public ChatCompletionRequestAssistantMessageAudio getAudio() {
    return audio;
  }

  @JsonProperty("audio")
  public void setAudio(ChatCompletionRequestAssistantMessageAudio audio) {
    this.audio = audio;
  }

  /**
   * The tool calls generated by the model, such as function calls.
   **/
  public FineTuneChatCompletionRequestAssistantMessage toolCalls(List<@Valid ChatCompletionMessageToolCall> toolCalls) {
    this.toolCalls = toolCalls;
    return this;
  }

  
  @ApiModelProperty(value = "The tool calls generated by the model, such as function calls.")
  @JsonProperty("tool_calls")
  @Valid public List<@Valid ChatCompletionMessageToolCall> getToolCalls() {
    return toolCalls;
  }

  @JsonProperty("tool_calls")
  public void setToolCalls(List<@Valid ChatCompletionMessageToolCall> toolCalls) {
    this.toolCalls = toolCalls;
  }

  public FineTuneChatCompletionRequestAssistantMessage addToolCallsItem(ChatCompletionMessageToolCall toolCallsItem) {
    if (this.toolCalls == null) {
      this.toolCalls = new ArrayList<>();
    }

    this.toolCalls.add(toolCallsItem);
    return this;
  }

  public FineTuneChatCompletionRequestAssistantMessage removeToolCallsItem(ChatCompletionMessageToolCall toolCallsItem) {
    if (toolCallsItem != null && this.toolCalls != null) {
      this.toolCalls.remove(toolCallsItem);
    }

    return this;
  }
  /**
   **/
  public FineTuneChatCompletionRequestAssistantMessage functionCall(ChatCompletionRequestAssistantMessageFunctionCall functionCall) {
    this.functionCall = functionCall;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("function_call")
  @Valid public ChatCompletionRequestAssistantMessageFunctionCall getFunctionCall() {
    return functionCall;
  }

  @JsonProperty("function_call")
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

  @JsonProperty("weight")
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
    return Objects.equals(this.content, fineTuneChatCompletionRequestAssistantMessage.content) &&
        Objects.equals(this.refusal, fineTuneChatCompletionRequestAssistantMessage.refusal) &&
        Objects.equals(this.role, fineTuneChatCompletionRequestAssistantMessage.role) &&
        Objects.equals(this.name, fineTuneChatCompletionRequestAssistantMessage.name) &&
        Objects.equals(this.audio, fineTuneChatCompletionRequestAssistantMessage.audio) &&
        Objects.equals(this.toolCalls, fineTuneChatCompletionRequestAssistantMessage.toolCalls) &&
        Objects.equals(this.functionCall, fineTuneChatCompletionRequestAssistantMessage.functionCall) &&
        Objects.equals(this.weight, fineTuneChatCompletionRequestAssistantMessage.weight);
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

