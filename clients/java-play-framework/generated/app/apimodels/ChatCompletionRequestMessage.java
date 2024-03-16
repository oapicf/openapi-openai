package apimodels;

import apimodels.ChatCompletionRequestMessageFunctionCall;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ChatCompletionRequestMessage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-16T01:12:54.315235707Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ChatCompletionRequestMessage   {
  /**
   * The role of the messages author. One of `system`, `user`, `assistant`, or `function`.
   */
  public enum RoleEnum {
    SYSTEM("system"),
    
    USER("user"),
    
    ASSISTANT("assistant"),
    
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

  @JsonProperty("content")
  
  private String content;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("function_call")
  @Valid

  private ChatCompletionRequestMessageFunctionCall functionCall;

  public ChatCompletionRequestMessage role(RoleEnum role) {
    this.role = role;
    return this;
  }

   /**
   * The role of the messages author. One of `system`, `user`, `assistant`, or `function`.
   * @return role
  **/
  public RoleEnum getRole() {
    return role;
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }

  public ChatCompletionRequestMessage content(String content) {
    this.content = content;
    return this;
  }

   /**
   * The contents of the message. `content` is required for all messages except assistant messages with function calls.
   * @return content
  **/
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public ChatCompletionRequestMessage name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the author of this message. `name` is required if role is `function`, and it should be the name of the function whose response is in the `content`. May contain a-z, A-Z, 0-9, and underscores, with a maximum length of 64 characters.
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ChatCompletionRequestMessage functionCall(ChatCompletionRequestMessageFunctionCall functionCall) {
    this.functionCall = functionCall;
    return this;
  }

   /**
   * Get functionCall
   * @return functionCall
  **/
  public ChatCompletionRequestMessageFunctionCall getFunctionCall() {
    return functionCall;
  }

  public void setFunctionCall(ChatCompletionRequestMessageFunctionCall functionCall) {
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
    ChatCompletionRequestMessage chatCompletionRequestMessage = (ChatCompletionRequestMessage) o;
    return Objects.equals(role, chatCompletionRequestMessage.role) &&
        Objects.equals(content, chatCompletionRequestMessage.content) &&
        Objects.equals(name, chatCompletionRequestMessage.name) &&
        Objects.equals(functionCall, chatCompletionRequestMessage.functionCall);
  }

  @Override
  public int hashCode() {
    return Objects.hash(role, content, name, functionCall);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionRequestMessage {\n");
    
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

