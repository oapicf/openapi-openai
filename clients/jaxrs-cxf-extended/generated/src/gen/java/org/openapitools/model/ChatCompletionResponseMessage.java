package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ChatCompletionRequestMessageFunctionCall;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ChatCompletionResponseMessage  {
  
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
  * The role of the author of this message.
  */
  @ApiModelProperty(required = true, value = "The role of the author of this message.")
  private RoleEnum role;

 /**
  * The contents of the message.
  */
  @ApiModelProperty(value = "The contents of the message.")
  private String content;

  @ApiModelProperty(value = "")
  @Valid
  private ChatCompletionRequestMessageFunctionCall functionCall;
 /**
  * The role of the author of this message.
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
  public ChatCompletionResponseMessage role(RoleEnum role) {
    this.role = role;
    return this;
  }

 /**
  * The contents of the message.
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
  public ChatCompletionResponseMessage content(String content) {
    this.content = content;
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

