/*
 * OpenAI API
 * APIs for sampling from and fine-tuning language models
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ChatCompletionRequestMessageFunctionCall;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * ChatCompletionResponseMessage
 */
@JsonPropertyOrder({
  ChatCompletionResponseMessage.JSON_PROPERTY_ROLE,
  ChatCompletionResponseMessage.JSON_PROPERTY_CONTENT,
  ChatCompletionResponseMessage.JSON_PROPERTY_FUNCTION_CALL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-03-16T01:13:32.134709667Z[Etc/UTC]", comments = "Generator version: 7.4.0")
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
    public static RoleEnum fromValue(String value) {
      for (RoleEnum b : RoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ROLE = "role";
  @JsonProperty(JSON_PROPERTY_ROLE)
  private RoleEnum role;

  public static final String JSON_PROPERTY_CONTENT = "content";
  @JsonProperty(JSON_PROPERTY_CONTENT)
  private String content;

  public static final String JSON_PROPERTY_FUNCTION_CALL = "function_call";
  @JsonProperty(JSON_PROPERTY_FUNCTION_CALL)
  private ChatCompletionRequestMessageFunctionCall functionCall;

  public ChatCompletionResponseMessage role(RoleEnum role) {
    this.role = role;
    return this;
  }

  /**
   * The role of the author of this message.
   * @return role
   **/
  @JsonProperty(value = "role")
  @ApiModelProperty(required = true, value = "The role of the author of this message.")
  @NotNull 
  public RoleEnum getRole() {
    return role;
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }

  public ChatCompletionResponseMessage content(String content) {
    this.content = content;
    return this;
  }

  /**
   * The contents of the message.
   * @return content
   **/
  @JsonProperty(value = "content")
  @ApiModelProperty(value = "The contents of the message.")
  
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public ChatCompletionResponseMessage functionCall(ChatCompletionRequestMessageFunctionCall functionCall) {
    this.functionCall = functionCall;
    return this;
  }

  /**
   * Get functionCall
   * @return functionCall
   **/
  @JsonProperty(value = "function_call")
  @ApiModelProperty(value = "")
  @Valid 
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

