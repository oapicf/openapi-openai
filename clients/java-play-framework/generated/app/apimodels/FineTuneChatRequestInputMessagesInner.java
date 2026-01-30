package apimodels;

import apimodels.ChatCompletionMessageToolCall;
import apimodels.ChatCompletionRequestAssistantMessageAudio;
import apimodels.ChatCompletionRequestAssistantMessageFunctionCall;
import apimodels.ChatCompletionRequestFunctionMessage;
import apimodels.ChatCompletionRequestSystemMessage;
import apimodels.ChatCompletionRequestToolMessage;
import apimodels.ChatCompletionRequestUserMessage;
import apimodels.FineTuneChatCompletionRequestAssistantMessage;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * FineTuneChatRequestInputMessagesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class FineTuneChatRequestInputMessagesInner   {
  @JsonProperty("content")
  @NotNull

  private String content;

  /**
   * The role of the messages author, in this case `function`.
   */
  public enum RoleEnum {
    FUNCTION("function");

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
  @NotNull

  private String name;

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

  @JsonProperty("refusal")
  
  private String refusal;

  @JsonProperty("audio")
  @Valid

  private ChatCompletionRequestAssistantMessageAudio audio;

  @JsonProperty("tool_calls")
  @Valid

  private List<@Valid ChatCompletionMessageToolCall> toolCalls = null;

  @JsonProperty("function_call")
  @Valid

  private ChatCompletionRequestAssistantMessageFunctionCall functionCall;

  @JsonProperty("tool_call_id")
  @NotNull

  private String toolCallId;

  public FineTuneChatRequestInputMessagesInner content(String content) {
    this.content = content;
    return this;
  }

   /**
   * The contents of the function message.
   * @return content
  **/
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public FineTuneChatRequestInputMessagesInner role(RoleEnum role) {
    this.role = role;
    return this;
  }

   /**
   * The role of the messages author, in this case `function`.
   * @return role
  **/
  public RoleEnum getRole() {
    return role;
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }

  public FineTuneChatRequestInputMessagesInner name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the function to call.
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FineTuneChatRequestInputMessagesInner weight(WeightEnum weight) {
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

  public FineTuneChatRequestInputMessagesInner refusal(String refusal) {
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

  public FineTuneChatRequestInputMessagesInner audio(ChatCompletionRequestAssistantMessageAudio audio) {
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

  public FineTuneChatRequestInputMessagesInner toolCalls(List<@Valid ChatCompletionMessageToolCall> toolCalls) {
    this.toolCalls = toolCalls;
    return this;
  }

  public FineTuneChatRequestInputMessagesInner addToolCallsItem(ChatCompletionMessageToolCall toolCallsItem) {
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

  public FineTuneChatRequestInputMessagesInner functionCall(ChatCompletionRequestAssistantMessageFunctionCall functionCall) {
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

  public FineTuneChatRequestInputMessagesInner toolCallId(String toolCallId) {
    this.toolCallId = toolCallId;
    return this;
  }

   /**
   * Tool call that this message is responding to.
   * @return toolCallId
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

