package apimodels;

import apimodels.ChatCompletionMessageToolCall;
import apimodels.ChatCompletionRequestAssistantMessageAudio;
import apimodels.ChatCompletionRequestAssistantMessageContent;
import apimodels.ChatCompletionRequestAssistantMessageFunctionCall;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * FineTuneChatCompletionRequestAssistantMessage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class FineTuneChatCompletionRequestAssistantMessage   {
  @JsonProperty("content")
  @Valid

  private ChatCompletionRequestAssistantMessageContent content;

  @JsonProperty("refusal")
  
  private String refusal;

  /**
   * The role of the messages author, in this case `assistant`.
   */
  public enum RoleEnum {
    ASSISTANT("assistant");

    private final String value;

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

  @JsonProperty("role")
  @NotNull

  private RoleEnum role;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("audio")
  @Valid

  private ChatCompletionRequestAssistantMessageAudio audio;

  @JsonProperty("tool_calls")
  @Valid

  private List<@Valid ChatCompletionMessageToolCall> toolCalls = null;

  @JsonProperty("function_call")
  @Valid

  private ChatCompletionRequestAssistantMessageFunctionCall functionCall;

  /**
   * Controls whether the assistant message is trained against (0 or 1)
   */
  public enum WeightEnum {
    NUMBER_0(0),
    
    NUMBER_1(1);

    private final Integer value;

    WeightEnum(Integer value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
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

  @JsonProperty("weight")
  
  private WeightEnum weight;

  public FineTuneChatCompletionRequestAssistantMessage content(ChatCompletionRequestAssistantMessageContent content) {
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  public ChatCompletionRequestAssistantMessageContent getContent() {
    return content;
  }

  public void setContent(ChatCompletionRequestAssistantMessageContent content) {
    this.content = content;
  }

  public FineTuneChatCompletionRequestAssistantMessage refusal(String refusal) {
    this.refusal = refusal;
    return this;
  }

   /**
   * The refusal message by the assistant.
   * @return refusal
  **/
  public String getRefusal() {
    return refusal;
  }

  public void setRefusal(String refusal) {
    this.refusal = refusal;
  }

  public FineTuneChatCompletionRequestAssistantMessage role(RoleEnum role) {
    this.role = role;
    return this;
  }

   /**
   * The role of the messages author, in this case `assistant`.
   * @return role
  **/
  public RoleEnum getRole() {
    return role;
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }

  public FineTuneChatCompletionRequestAssistantMessage name(String name) {
    this.name = name;
    return this;
  }

   /**
   * An optional name for the participant. Provides the model information to differentiate between participants of the same role.
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FineTuneChatCompletionRequestAssistantMessage audio(ChatCompletionRequestAssistantMessageAudio audio) {
    this.audio = audio;
    return this;
  }

   /**
   * Get audio
   * @return audio
  **/
  public ChatCompletionRequestAssistantMessageAudio getAudio() {
    return audio;
  }

  public void setAudio(ChatCompletionRequestAssistantMessageAudio audio) {
    this.audio = audio;
  }

  public FineTuneChatCompletionRequestAssistantMessage toolCalls(List<@Valid ChatCompletionMessageToolCall> toolCalls) {
    this.toolCalls = toolCalls;
    return this;
  }

  public FineTuneChatCompletionRequestAssistantMessage addToolCallsItem(ChatCompletionMessageToolCall toolCallsItem) {
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
  public List<@Valid ChatCompletionMessageToolCall> getToolCalls() {
    return toolCalls;
  }

  public void setToolCalls(List<@Valid ChatCompletionMessageToolCall> toolCalls) {
    this.toolCalls = toolCalls;
  }

  public FineTuneChatCompletionRequestAssistantMessage functionCall(ChatCompletionRequestAssistantMessageFunctionCall functionCall) {
    this.functionCall = functionCall;
    return this;
  }

   /**
   * Get functionCall
   * @return functionCall
  **/
  public ChatCompletionRequestAssistantMessageFunctionCall getFunctionCall() {
    return functionCall;
  }

  public void setFunctionCall(ChatCompletionRequestAssistantMessageFunctionCall functionCall) {
    this.functionCall = functionCall;
  }

  public FineTuneChatCompletionRequestAssistantMessage weight(WeightEnum weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Controls whether the assistant message is trained against (0 or 1)
   * @return weight
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

