package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ChatCompletionRequestMessageFunctionCall;

/**
 * ChatCompletionRequestMessage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-03-16T01:12:44.741883350Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ChatCompletionRequestMessage   {
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

  @JsonProperty("content")
  private String content;

  @JsonProperty("name")
  private String name;

  @JsonProperty("function_call")
  private ChatCompletionRequestMessageFunctionCall functionCall;

  public ChatCompletionRequestMessage role(RoleEnum role) {
    this.role = role;
    return this;
  }

   /**
   * The role of the messages author. One of `system`, `user`, `assistant`, or `function`.
   * @return role
  **/
  @ApiModelProperty(required = true, value = "The role of the messages author. One of `system`, `user`, `assistant`, or `function`.")
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
  @ApiModelProperty(value = "The contents of the message. `content` is required for all messages except assistant messages with function calls.")
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
  @ApiModelProperty(value = "The name of the author of this message. `name` is required if role is `function`, and it should be the name of the function whose response is in the `content`. May contain a-z, A-Z, 0-9, and underscores, with a maximum length of 64 characters.")
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
  @ApiModelProperty(value = "")
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

