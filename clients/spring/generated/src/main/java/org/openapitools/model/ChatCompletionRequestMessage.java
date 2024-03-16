package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.ChatCompletionRequestMessageFunctionCall;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ChatCompletionRequestMessage
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-16T01:17:43.141820780Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ChatCompletionRequestMessage {

  /**
   * The role of the messages author. One of `system`, `user`, `assistant`, or `function`.
   */
  public enum RoleEnum {
    SYSTEM("system"),
    
    USER("user"),
    
    ASSISTANT("assistant"),
    
    FUNCTION("function");

    private String value;

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

  private String content;

  private String name;

  private ChatCompletionRequestMessageFunctionCall functionCall;

  public ChatCompletionRequestMessage() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ChatCompletionRequestMessage(RoleEnum role) {
    this.role = role;
  }

  public ChatCompletionRequestMessage role(RoleEnum role) {
    this.role = role;
    return this;
  }

  /**
   * The role of the messages author. One of `system`, `user`, `assistant`, or `function`.
   * @return role
  */
  @NotNull 
  @Schema(name = "role", description = "The role of the messages author. One of `system`, `user`, `assistant`, or `function`.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("role")
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
  */
  
  @Schema(name = "content", description = "The contents of the message. `content` is required for all messages except assistant messages with function calls.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("content")
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
  */
  
  @Schema(name = "name", description = "The name of the author of this message. `name` is required if role is `function`, and it should be the name of the function whose response is in the `content`. May contain a-z, A-Z, 0-9, and underscores, with a maximum length of 64 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
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
  */
  @Valid 
  @Schema(name = "function_call", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("function_call")
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
    return Objects.equals(this.role, chatCompletionRequestMessage.role) &&
        Objects.equals(this.content, chatCompletionRequestMessage.content) &&
        Objects.equals(this.name, chatCompletionRequestMessage.name) &&
        Objects.equals(this.functionCall, chatCompletionRequestMessage.functionCall);
  }

  @Override
  public int hashCode() {
    return Objects.hash(role, content, name, functionCall);
  }

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

