package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.ChatCompletionRequestMessageFunctionCall;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ChatCompletionRequestMessage  {
  
public enum RoleEnum {

    @JsonProperty("system") SYSTEM(String.valueOf("system")),
    @JsonProperty("user") USER(String.valueOf("user")),
    @JsonProperty("assistant") ASSISTANT(String.valueOf("assistant")),
    @JsonProperty("function") FUNCTION(String.valueOf("function"));

    private String value;

    RoleEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static RoleEnum fromValue(String value) {
        for (RoleEnum b : RoleEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * The role of the messages author. One of `system`, `user`, `assistant`, or `function`.
  */
  @ApiModelProperty(required = true, value = "The role of the messages author. One of `system`, `user`, `assistant`, or `function`.")
  private RoleEnum role;

 /**
  * The contents of the message. `content` is required for all messages except assistant messages with function calls.
  */
  @ApiModelProperty(value = "The contents of the message. `content` is required for all messages except assistant messages with function calls.")
  private String content;

 /**
  * The name of the author of this message. `name` is required if role is `function`, and it should be the name of the function whose response is in the `content`. May contain a-z, A-Z, 0-9, and underscores, with a maximum length of 64 characters.
  */
  @ApiModelProperty(value = "The name of the author of this message. `name` is required if role is `function`, and it should be the name of the function whose response is in the `content`. May contain a-z, A-Z, 0-9, and underscores, with a maximum length of 64 characters.")
  private String name;

  @ApiModelProperty(value = "")
  @Valid
  private ChatCompletionRequestMessageFunctionCall functionCall;
 /**
  * The role of the messages author. One of &#x60;system&#x60;, &#x60;user&#x60;, &#x60;assistant&#x60;, or &#x60;function&#x60;.
  * @return role
  */
  @JsonProperty("role")
  @NotNull
  public String getRole() {
    return role == null ? null : role.value();
  }

  /**
   * Sets the <code>role</code> property.
   */
 public void setRole(RoleEnum role) {
    this.role = role;
  }

  /**
   * Sets the <code>role</code> property.
   */
  public ChatCompletionRequestMessage role(RoleEnum role) {
    this.role = role;
    return this;
  }

 /**
  * The contents of the message. &#x60;content&#x60; is required for all messages except assistant messages with function calls.
  * @return content
  */
  @JsonProperty("content")
  public String getContent() {
    return content;
  }

  /**
   * Sets the <code>content</code> property.
   */
 public void setContent(String content) {
    this.content = content;
  }

  /**
   * Sets the <code>content</code> property.
   */
  public ChatCompletionRequestMessage content(String content) {
    this.content = content;
    return this;
  }

 /**
  * The name of the author of this message. &#x60;name&#x60; is required if role is &#x60;function&#x60;, and it should be the name of the function whose response is in the &#x60;content&#x60;. May contain a-z, A-Z, 0-9, and underscores, with a maximum length of 64 characters.
  * @return name
  */
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public ChatCompletionRequestMessage name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Get functionCall
  * @return functionCall
  */
  @JsonProperty("function_call")
  public ChatCompletionRequestMessageFunctionCall getFunctionCall() {
    return functionCall;
  }

  /**
   * Sets the <code>functionCall</code> property.
   */
 public void setFunctionCall(ChatCompletionRequestMessageFunctionCall functionCall) {
    this.functionCall = functionCall;
  }

  /**
   * Sets the <code>functionCall</code> property.
   */
  public ChatCompletionRequestMessage functionCall(ChatCompletionRequestMessageFunctionCall functionCall) {
    this.functionCall = functionCall;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

