package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ChatCompletionMessageToolCall;
import org.openapitools.model.ChatCompletionRequestAssistantMessage;
import org.openapitools.model.ChatCompletionRequestAssistantMessageAudio;
import org.openapitools.model.ChatCompletionRequestAssistantMessageFunctionCall;
import org.openapitools.model.ChatCompletionRequestDeveloperMessage;
import org.openapitools.model.ChatCompletionRequestFunctionMessage;
import org.openapitools.model.ChatCompletionRequestSystemMessage;
import org.openapitools.model.ChatCompletionRequestToolMessage;
import org.openapitools.model.ChatCompletionRequestUserMessage;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("ChatCompletionRequestMessage")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ChatCompletionRequestMessage   {
  private String content;
  public enum RoleEnum {

    FUNCTION(String.valueOf("function"));


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
  private String refusal;
  private ChatCompletionRequestAssistantMessageAudio audio;
  private @Valid List<@Valid ChatCompletionMessageToolCall> toolCalls = new ArrayList<>();
  private ChatCompletionRequestAssistantMessageFunctionCall functionCall;
  private String toolCallId;

  public ChatCompletionRequestMessage() {
  }

  @JsonCreator
  public ChatCompletionRequestMessage(
    @JsonProperty(required = true, value = "content") String content,
    @JsonProperty(required = true, value = "role") RoleEnum role,
    @JsonProperty(required = true, value = "name") String name,
    @JsonProperty(required = true, value = "tool_call_id") String toolCallId
  ) {
    this.content = content;
    this.role = role;
    this.name = name;
    this.toolCallId = toolCallId;
  }

  /**
   * The contents of the function message.
   **/
  public ChatCompletionRequestMessage content(String content) {
    this.content = content;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The contents of the function message.")
  @JsonProperty(required = true, value = "content")
  @NotNull public String getContent() {
    return content;
  }

  @JsonProperty(required = true, value = "content")
  public void setContent(String content) {
    this.content = content;
  }

  /**
   * The role of the messages author, in this case &#x60;function&#x60;.
   **/
  public ChatCompletionRequestMessage role(RoleEnum role) {
    this.role = role;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The role of the messages author, in this case `function`.")
  @JsonProperty(required = true, value = "role")
  @NotNull public RoleEnum getRole() {
    return role;
  }

  @JsonProperty(required = true, value = "role")
  public void setRole(RoleEnum role) {
    this.role = role;
  }

  /**
   * The name of the function to call.
   **/
  public ChatCompletionRequestMessage name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name of the function to call.")
  @JsonProperty(required = true, value = "name")
  @NotNull public String getName() {
    return name;
  }

  @JsonProperty(required = true, value = "name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The refusal message by the assistant.
   **/
  public ChatCompletionRequestMessage refusal(String refusal) {
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
   **/
  public ChatCompletionRequestMessage audio(ChatCompletionRequestAssistantMessageAudio audio) {
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
  public ChatCompletionRequestMessage toolCalls(List<@Valid ChatCompletionMessageToolCall> toolCalls) {
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

  public ChatCompletionRequestMessage addToolCallsItem(ChatCompletionMessageToolCall toolCallsItem) {
    if (this.toolCalls == null) {
      this.toolCalls = new ArrayList<>();
    }

    this.toolCalls.add(toolCallsItem);
    return this;
  }

  public ChatCompletionRequestMessage removeToolCallsItem(ChatCompletionMessageToolCall toolCallsItem) {
    if (toolCallsItem != null && this.toolCalls != null) {
      this.toolCalls.remove(toolCallsItem);
    }

    return this;
  }
  /**
   **/
  public ChatCompletionRequestMessage functionCall(ChatCompletionRequestAssistantMessageFunctionCall functionCall) {
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
   * Tool call that this message is responding to.
   **/
  public ChatCompletionRequestMessage toolCallId(String toolCallId) {
    this.toolCallId = toolCallId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Tool call that this message is responding to.")
  @JsonProperty(required = true, value = "tool_call_id")
  @NotNull public String getToolCallId() {
    return toolCallId;
  }

  @JsonProperty(required = true, value = "tool_call_id")
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
    return Objects.equals(this.content, chatCompletionRequestMessage.content) &&
        Objects.equals(this.role, chatCompletionRequestMessage.role) &&
        Objects.equals(this.name, chatCompletionRequestMessage.name) &&
        Objects.equals(this.refusal, chatCompletionRequestMessage.refusal) &&
        Objects.equals(this.audio, chatCompletionRequestMessage.audio) &&
        Objects.equals(this.toolCalls, chatCompletionRequestMessage.toolCalls) &&
        Objects.equals(this.functionCall, chatCompletionRequestMessage.functionCall) &&
        Objects.equals(this.toolCallId, chatCompletionRequestMessage.toolCallId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, role, name, refusal, audio, toolCalls, functionCall, toolCallId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionRequestMessage {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

