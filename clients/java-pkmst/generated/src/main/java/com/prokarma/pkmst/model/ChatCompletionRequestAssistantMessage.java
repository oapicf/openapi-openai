package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.ChatCompletionMessageToolCall;
import com.prokarma.pkmst.model.ChatCompletionRequestAssistantMessageAudio;
import com.prokarma.pkmst.model.ChatCompletionRequestAssistantMessageContent;
import com.prokarma.pkmst.model.ChatCompletionRequestAssistantMessageFunctionCall;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Messages sent by the model in response to user messages. 
 */
@ApiModel(description = "Messages sent by the model in response to user messages. ")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T14:08:20.194647079Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ChatCompletionRequestAssistantMessage   {
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

  public ChatCompletionRequestAssistantMessage content(ChatCompletionRequestAssistantMessageContent content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
   */
  @ApiModelProperty(value = "")
  public ChatCompletionRequestAssistantMessageContent getContent() {
    return content;
  }

  public void setContent(ChatCompletionRequestAssistantMessageContent content) {
    this.content = content;
  }

  public ChatCompletionRequestAssistantMessage refusal(String refusal) {
    this.refusal = refusal;
    return this;
  }

  /**
   * The refusal message by the assistant.
   * @return refusal
   */
  @ApiModelProperty(value = "The refusal message by the assistant.")
  public String getRefusal() {
    return refusal;
  }

  public void setRefusal(String refusal) {
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
  @ApiModelProperty(required = true, value = "The role of the messages author, in this case `assistant`.")
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
  @ApiModelProperty(value = "An optional name for the participant. Provides the model information to differentiate between participants of the same role.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ChatCompletionRequestAssistantMessage audio(ChatCompletionRequestAssistantMessageAudio audio) {
    this.audio = audio;
    return this;
  }

  /**
   * Get audio
   * @return audio
   */
  @ApiModelProperty(value = "")
  public ChatCompletionRequestAssistantMessageAudio getAudio() {
    return audio;
  }

  public void setAudio(ChatCompletionRequestAssistantMessageAudio audio) {
    this.audio = audio;
  }

  public ChatCompletionRequestAssistantMessage toolCalls(List<ChatCompletionMessageToolCall> toolCalls) {
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
  @ApiModelProperty(value = "The tool calls generated by the model, such as function calls.")
  public List<ChatCompletionMessageToolCall> getToolCalls() {
    return toolCalls;
  }

  public void setToolCalls(List<ChatCompletionMessageToolCall> toolCalls) {
    this.toolCalls = toolCalls;
  }

  public ChatCompletionRequestAssistantMessage functionCall(ChatCompletionRequestAssistantMessageFunctionCall functionCall) {
    this.functionCall = functionCall;
    return this;
  }

  /**
   * Get functionCall
   * @return functionCall
   */
  @ApiModelProperty(value = "")
  public ChatCompletionRequestAssistantMessageFunctionCall getFunctionCall() {
    return functionCall;
  }

  public void setFunctionCall(ChatCompletionRequestAssistantMessageFunctionCall functionCall) {
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
    return Objects.equals(this.content, chatCompletionRequestAssistantMessage.content) &&
        Objects.equals(this.refusal, chatCompletionRequestAssistantMessage.refusal) &&
        Objects.equals(this.role, chatCompletionRequestAssistantMessage.role) &&
        Objects.equals(this.name, chatCompletionRequestAssistantMessage.name) &&
        Objects.equals(this.audio, chatCompletionRequestAssistantMessage.audio) &&
        Objects.equals(this.toolCalls, chatCompletionRequestAssistantMessage.toolCalls) &&
        Objects.equals(this.functionCall, chatCompletionRequestAssistantMessage.functionCall);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, refusal, role, name, audio, toolCalls, functionCall);
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

