package apimodels;

import apimodels.ChatCompletionMessageToolCallChunk;
import apimodels.ChatCompletionStreamResponseDeltaFunctionCall;
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
 * A chat completion delta generated by streamed model responses.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-04-14T13:39:27.767845477Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ChatCompletionStreamResponseDelta   {
  @JsonProperty("content")
  
  private String content;

  @JsonProperty("function_call")
  @Valid

  private ChatCompletionStreamResponseDeltaFunctionCall functionCall;

  @JsonProperty("tool_calls")
  @Valid

  private List<@Valid ChatCompletionMessageToolCallChunk> toolCalls = null;

  /**
   * The role of the author of this message.
   */
  public enum RoleEnum {
    SYSTEM("system"),
    
    USER("user"),
    
    ASSISTANT("assistant"),
    
    TOOL("tool");

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
  
  private RoleEnum role;

  public ChatCompletionStreamResponseDelta content(String content) {
    this.content = content;
    return this;
  }

   /**
   * The contents of the chunk message.
   * @return content
  **/
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public ChatCompletionStreamResponseDelta functionCall(ChatCompletionStreamResponseDeltaFunctionCall functionCall) {
    this.functionCall = functionCall;
    return this;
  }

   /**
   * Get functionCall
   * @return functionCall
  **/
  public ChatCompletionStreamResponseDeltaFunctionCall getFunctionCall() {
    return functionCall;
  }

  public void setFunctionCall(ChatCompletionStreamResponseDeltaFunctionCall functionCall) {
    this.functionCall = functionCall;
  }

  public ChatCompletionStreamResponseDelta toolCalls(List<@Valid ChatCompletionMessageToolCallChunk> toolCalls) {
    this.toolCalls = toolCalls;
    return this;
  }

  public ChatCompletionStreamResponseDelta addToolCallsItem(ChatCompletionMessageToolCallChunk toolCallsItem) {
    if (this.toolCalls == null) {
      this.toolCalls = new ArrayList<>();
    }
    this.toolCalls.add(toolCallsItem);
    return this;
  }

   /**
   * Get toolCalls
   * @return toolCalls
  **/
  public List<@Valid ChatCompletionMessageToolCallChunk> getToolCalls() {
    return toolCalls;
  }

  public void setToolCalls(List<@Valid ChatCompletionMessageToolCallChunk> toolCalls) {
    this.toolCalls = toolCalls;
  }

  public ChatCompletionStreamResponseDelta role(RoleEnum role) {
    this.role = role;
    return this;
  }

   /**
   * The role of the author of this message.
   * @return role
  **/
  public RoleEnum getRole() {
    return role;
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatCompletionStreamResponseDelta chatCompletionStreamResponseDelta = (ChatCompletionStreamResponseDelta) o;
    return Objects.equals(content, chatCompletionStreamResponseDelta.content) &&
        Objects.equals(functionCall, chatCompletionStreamResponseDelta.functionCall) &&
        Objects.equals(toolCalls, chatCompletionStreamResponseDelta.toolCalls) &&
        Objects.equals(role, chatCompletionStreamResponseDelta.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, functionCall, toolCalls, role);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionStreamResponseDelta {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    functionCall: ").append(toIndentedString(functionCall)).append("\n");
    sb.append("    toolCalls: ").append(toIndentedString(toolCalls)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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
