package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ChatCompletionRequestMessageFunctionCall;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ChatCompletionResponseMessage  {
  
public enum RoleEnum {

SYSTEM(String.valueOf("system")), USER(String.valueOf("user")), ASSISTANT(String.valueOf("assistant")), FUNCTION(String.valueOf("function"));


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

  @ApiModelProperty(required = true, value = "The role of the author of this message.")
 /**
   * The role of the author of this message.
  **/
  private RoleEnum role;

  @ApiModelProperty(value = "The contents of the message.")
 /**
   * The contents of the message.
  **/
  private String content;

  @ApiModelProperty(value = "")
  private ChatCompletionRequestMessageFunctionCall functionCall;
 /**
   * The role of the author of this message.
   * @return role
  **/
  @JsonProperty("role")
  public String getRole() {
    if (role == null) {
      return null;
    }
    return role.value();
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }

  public ChatCompletionResponseMessage role(RoleEnum role) {
    this.role = role;
    return this;
  }

 /**
   * The contents of the message.
   * @return content
  **/
  @JsonProperty("content")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public ChatCompletionResponseMessage content(String content) {
    this.content = content;
    return this;
  }

 /**
   * Get functionCall
   * @return functionCall
  **/
  @JsonProperty("function_call")
  public ChatCompletionRequestMessageFunctionCall getFunctionCall() {
    return functionCall;
  }

  public void setFunctionCall(ChatCompletionRequestMessageFunctionCall functionCall) {
    this.functionCall = functionCall;
  }

  public ChatCompletionResponseMessage functionCall(ChatCompletionRequestMessageFunctionCall functionCall) {
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
    ChatCompletionResponseMessage chatCompletionResponseMessage = (ChatCompletionResponseMessage) o;
    return Objects.equals(this.role, chatCompletionResponseMessage.role) &&
        Objects.equals(this.content, chatCompletionResponseMessage.content) &&
        Objects.equals(this.functionCall, chatCompletionResponseMessage.functionCall);
  }

  @Override
  public int hashCode() {
    return Objects.hash(role, content, functionCall);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionResponseMessage {\n");
    
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

