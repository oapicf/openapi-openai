package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.ChatCompletionRequestMessageFunctionCall;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChatCompletionResponseMessage   {
  


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
      return value;
    }
  }

  private RoleEnum role;
  private String content;
  private ChatCompletionRequestMessageFunctionCall functionCall;

  public ChatCompletionResponseMessage () {

  }

  public ChatCompletionResponseMessage (RoleEnum role, String content, ChatCompletionRequestMessageFunctionCall functionCall) {
    this.role = role;
    this.content = content;
    this.functionCall = functionCall;
  }

    
  @JsonProperty("role")
  public RoleEnum getRole() {
    return role;
  }
  public void setRole(RoleEnum role) {
    this.role = role;
  }

    
  @JsonProperty("content")
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }

    
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
