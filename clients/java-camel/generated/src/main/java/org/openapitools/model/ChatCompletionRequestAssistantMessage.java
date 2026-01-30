package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ChatCompletionMessageToolCall;
import org.openapitools.model.ChatCompletionRequestAssistantMessageAudio;
import org.openapitools.model.ChatCompletionRequestAssistantMessageContent;
import org.openapitools.model.ChatCompletionRequestAssistantMessageFunctionCall;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Messages sent by the model in response to user messages. 
 */

@Schema(name = "ChatCompletionRequestAssistantMessage", description = "Messages sent by the model in response to user messages. ")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ChatCompletionRequestAssistantMessage implements ChatCompletionRequestMessage, FineTunePreferenceRequestInputPreferredCompletionInner {

  private JsonNullable<ChatCompletionRequestAssistantMessageContent> content = JsonNullable.<ChatCompletionRequestAssistantMessageContent>undefined();

  private JsonNullable<String> refusal = JsonNullable.<String>undefined();

  /**
   * The role of the messages author, in this case `assistant`.
   */
  public enum RoleEnum {
    ASSISTANT("assistant");

    private final String value;

    RoleEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private RoleEnum role;

  private String name;

  private JsonNullable<ChatCompletionRequestAssistantMessageAudio> audio = JsonNullable.<ChatCompletionRequestAssistantMessageAudio>undefined();

  @Valid
  private List<@Valid ChatCompletionMessageToolCall> toolCalls = new ArrayList<>();

  @Deprecated
  private JsonNullable<ChatCompletionRequestAssistantMessageFunctionCall> functionCall = JsonNullable.<ChatCompletionRequestAssistantMessageFunctionCall>undefined();

  public ChatCompletionRequestAssistantMessage() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ChatCompletionRequestAssistantMessage(RoleEnum role) {
    this.role = role;
  }

  public ChatCompletionRequestAssistantMessage content(ChatCompletionRequestAssistantMessageContent content) {
    this.content = JsonNullable.of(content);
    return this;
  }

  /**
   * Get content
   * @return content
   */
  @Valid 
  @Schema(name = "content", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("content")
  public JsonNullable<ChatCompletionRequestAssistantMessageContent> getContent() {
    return content;
  }

  public void setContent(JsonNullable<ChatCompletionRequestAssistantMessageContent> content) {
    this.content = content;
  }

  public ChatCompletionRequestAssistantMessage refusal(String refusal) {
    this.refusal = JsonNullable.of(refusal);
    return this;
  }

  /**
   * The refusal message by the assistant.
   * @return refusal
   */
  
  @Schema(name = "refusal", description = "The refusal message by the assistant.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("refusal")
  public JsonNullable<String> getRefusal() {
    return refusal;
  }

  public void setRefusal(JsonNullable<String> refusal) {
    this.refusal = refusal;
  }

  public ChatCompletionRequestAssistantMessage role(RoleEnum role) {
    this.role = role;
    return this;
  }

  /**
   * The role of the messages author, in this case `assistant`.
   * @return role
   */
  @NotNull 
  @Schema(name = "role", description = "The role of the messages author, in this case `assistant`.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("role")
  public RoleEnum getRole() {
    return role;
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }

  public ChatCompletionRequestAssistantMessage name(String name) {
    this.name = name;
    return this;
  }

  /**
   * An optional name for the participant. Provides the model information to differentiate between participants of the same role.
   * @return name
   */
  
  @Schema(name = "name", description = "An optional name for the participant. Provides the model information to differentiate between participants of the same role.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ChatCompletionRequestAssistantMessage audio(ChatCompletionRequestAssistantMessageAudio audio) {
    this.audio = JsonNullable.of(audio);
    return this;
  }

  /**
   * Get audio
   * @return audio
   */
  @Valid 
  @Schema(name = "audio", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("audio")
  public JsonNullable<ChatCompletionRequestAssistantMessageAudio> getAudio() {
    return audio;
  }

  public void setAudio(JsonNullable<ChatCompletionRequestAssistantMessageAudio> audio) {
    this.audio = audio;
  }

  public ChatCompletionRequestAssistantMessage toolCalls(List<@Valid ChatCompletionMessageToolCall> toolCalls) {
    this.toolCalls = toolCalls;
    return this;
  }

  public ChatCompletionRequestAssistantMessage addToolCallsItem(ChatCompletionMessageToolCall toolCallsItem) {
    if (this.toolCalls == null) {
      this.toolCalls = new ArrayList<>();
    }
    this.toolCalls.add(toolCallsItem);
    return this;
  }

  /**
   * The tool calls generated by the model, such as function calls.
   * @return toolCalls
   */
  @Valid 
  @Schema(name = "tool_calls", description = "The tool calls generated by the model, such as function calls.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tool_calls")
  public List<@Valid ChatCompletionMessageToolCall> getToolCalls() {
    return toolCalls;
  }

  public void setToolCalls(List<@Valid ChatCompletionMessageToolCall> toolCalls) {
    this.toolCalls = toolCalls;
  }

  public ChatCompletionRequestAssistantMessage functionCall(ChatCompletionRequestAssistantMessageFunctionCall functionCall) {
    this.functionCall = JsonNullable.of(functionCall);
    return this;
  }

  /**
   * Get functionCall
   * @return functionCall
   * @deprecated
   */
  @Valid 
  @Schema(name = "function_call", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("function_call")
  @Deprecated
  public JsonNullable<ChatCompletionRequestAssistantMessageFunctionCall> getFunctionCall() {
    return functionCall;
  }

  /**
   * @deprecated
   */
  @Deprecated
  public void setFunctionCall(JsonNullable<ChatCompletionRequestAssistantMessageFunctionCall> functionCall) {
    this.functionCall = functionCall;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatCompletionRequestAssistantMessage chatCompletionRequestAssistantMessage = (ChatCompletionRequestAssistantMessage) o;
    return equalsNullable(this.content, chatCompletionRequestAssistantMessage.content) &&
        equalsNullable(this.refusal, chatCompletionRequestAssistantMessage.refusal) &&
        Objects.equals(this.role, chatCompletionRequestAssistantMessage.role) &&
        Objects.equals(this.name, chatCompletionRequestAssistantMessage.name) &&
        equalsNullable(this.audio, chatCompletionRequestAssistantMessage.audio) &&
        Objects.equals(this.toolCalls, chatCompletionRequestAssistantMessage.toolCalls) &&
        equalsNullable(this.functionCall, chatCompletionRequestAssistantMessage.functionCall);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(content), hashCodeNullable(refusal), role, name, hashCodeNullable(audio), toolCalls, hashCodeNullable(functionCall));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionRequestAssistantMessage {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    refusal: ").append(toIndentedString(refusal)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    audio: ").append(toIndentedString(audio)).append("\n");
    sb.append("    toolCalls: ").append(toIndentedString(toolCalls)).append("\n");
    sb.append("    functionCall: ").append(toIndentedString(functionCall)).append("\n");
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

