package apimodels;

import apimodels.ChatCompletionMessageToolCall;
import apimodels.ChatCompletionRequestAssistantMessage;
import apimodels.ChatCompletionRequestAssistantMessageFunctionCall;
import apimodels.ChatCompletionRequestFunctionMessage;
import apimodels.ChatCompletionRequestSystemMessage;
import apimodels.ChatCompletionRequestToolMessage;
import apimodels.ChatCompletionRequestUserMessage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ChatCompletionRequestMessage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-03T11:07:27.411323426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ChatCompletionRequestMessage   {
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

  @JsonProperty("tool_calls")
  @Valid

  private List<@Valid ChatCompletionMessageToolCall> toolCalls = null;

  @JsonProperty("function_call")
  @Valid

  private ChatCompletionRequestAssistantMessageFunctionCall functionCall;

  @JsonProperty("tool_call_id")
  @NotNull

  private String toolCallId;

  public ChatCompletionRequestMessage content(String content) {
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

  public ChatCompletionRequestMessage role(RoleEnum role) {
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

  public ChatCompletionRequestMessage name(String name) {
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

  public ChatCompletionRequestMessage toolCalls(List<@Valid ChatCompletionMessageToolCall> toolCalls) {
    this.toolCalls = toolCalls;
    return this;
  }

  public ChatCompletionRequestMessage addToolCallsItem(ChatCompletionMessageToolCall toolCallsItem) {
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

  public ChatCompletionRequestMessage functionCall(ChatCompletionRequestAssistantMessageFunctionCall functionCall) {
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

  public ChatCompletionRequestMessage toolCallId(String toolCallId) {
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
    ChatCompletionRequestMessage chatCompletionRequestMessage = (ChatCompletionRequestMessage) o;
    return Objects.equals(content, chatCompletionRequestMessage.content) &&
        Objects.equals(role, chatCompletionRequestMessage.role) &&
        Objects.equals(name, chatCompletionRequestMessage.name) &&
        Objects.equals(toolCalls, chatCompletionRequestMessage.toolCalls) &&
        Objects.equals(functionCall, chatCompletionRequestMessage.functionCall) &&
        Objects.equals(toolCallId, chatCompletionRequestMessage.toolCallId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, role, name, toolCalls, functionCall, toolCallId);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionRequestMessage {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

