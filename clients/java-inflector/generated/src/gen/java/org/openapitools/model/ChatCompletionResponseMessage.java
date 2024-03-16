package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ChatCompletionRequestMessageFunctionCall;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-03-16T01:12:27.532392463Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ChatCompletionResponseMessage   {
  /**
   * The role of the author of this message.
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

  @JsonProperty("function_call")
  private ChatCompletionRequestMessageFunctionCall functionCall;

  /**
   * The role of the author of this message.
   **/
  public ChatCompletionResponseMessage role(RoleEnum role) {
    this.role = role;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The role of the author of this message.")
  @JsonProperty("role")
  public RoleEnum getRole() {
    return role;
  }
  public void setRole(RoleEnum role) {
    this.role = role;
  }

  /**
   * The contents of the message.
   **/
  public ChatCompletionResponseMessage content(String content) {
    this.content = content;
    return this;
  }

  
  @ApiModelProperty(value = "The contents of the message.")
  @JsonProperty("content")
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }

  /**
   **/
  public ChatCompletionResponseMessage functionCall(ChatCompletionRequestMessageFunctionCall functionCall) {
    this.functionCall = functionCall;
    return this;
  }

  
  @ApiModelProperty(value = "")
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
    ChatCompletionResponseMessage chatCompletionResponseMessage = (ChatCompletionResponseMessage) o;
    return Objects.equals(role, chatCompletionResponseMessage.role) &&
        Objects.equals(content, chatCompletionResponseMessage.content) &&
        Objects.equals(functionCall, chatCompletionResponseMessage.functionCall);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

