package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ChatCompletionRequestMessageFunctionCall;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class ChatCompletionStreamResponseDelta   {
  

public enum RoleEnum {

    @JsonProperty("system") SYSTEM(String.valueOf("system")), @JsonProperty("user") USER(String.valueOf("user")), @JsonProperty("assistant") ASSISTANT(String.valueOf("assistant")), @JsonProperty("function") FUNCTION(String.valueOf("function"));


    private String value;

    RoleEnum(String v) {
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

  private RoleEnum role;

  private String content;

  private ChatCompletionRequestMessageFunctionCall functionCall;

  /**
   * The role of the author of this message.
   **/
  public ChatCompletionStreamResponseDelta role(RoleEnum role) {
    this.role = role;
    return this;
  }

  
  @ApiModelProperty(value = "The role of the author of this message.")
  @JsonProperty("role")
  public RoleEnum getRole() {
    return role;
  }
  public void setRole(RoleEnum role) {
    this.role = role;
  }


  /**
   * The contents of the chunk message.
   **/
  public ChatCompletionStreamResponseDelta content(String content) {
    this.content = content;
    return this;
  }

  
  @ApiModelProperty(value = "The contents of the chunk message.")
  @JsonProperty("content")
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }


  /**
   **/
  public ChatCompletionStreamResponseDelta functionCall(ChatCompletionRequestMessageFunctionCall functionCall) {
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
    ChatCompletionStreamResponseDelta chatCompletionStreamResponseDelta = (ChatCompletionStreamResponseDelta) o;
    return Objects.equals(this.role, chatCompletionStreamResponseDelta.role) &&
        Objects.equals(this.content, chatCompletionStreamResponseDelta.content) &&
        Objects.equals(this.functionCall, chatCompletionStreamResponseDelta.functionCall);
  }

  @Override
  public int hashCode() {
    return Objects.hash(role, content, functionCall);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionStreamResponseDelta {\n");
    
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

