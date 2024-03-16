/**
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

package org.openapitools.client.model;

import org.openapitools.client.model.ChatCompletionRequestMessageFunctionCall;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ChatCompletionStreamResponseDelta {
  
  public enum RoleEnum {
     system,  user,  assistant,  function, 
  };
  @SerializedName("role")
  private RoleEnum role = null;
  @SerializedName("content")
  private String content = null;
  @SerializedName("function_call")
  private ChatCompletionRequestMessageFunctionCall functionCall = null;

  /**
   * The role of the author of this message.
   **/
  @ApiModelProperty(value = "The role of the author of this message.")
  public RoleEnum getRole() {
    return role;
  }
  public void setRole(RoleEnum role) {
    this.role = role;
  }

  /**
   * The contents of the chunk message.
   **/
  @ApiModelProperty(value = "The contents of the chunk message.")
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }

  /**
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
    ChatCompletionStreamResponseDelta chatCompletionStreamResponseDelta = (ChatCompletionStreamResponseDelta) o;
    return (this.role == null ? chatCompletionStreamResponseDelta.role == null : this.role.equals(chatCompletionStreamResponseDelta.role)) &&
        (this.content == null ? chatCompletionStreamResponseDelta.content == null : this.content.equals(chatCompletionStreamResponseDelta.content)) &&
        (this.functionCall == null ? chatCompletionStreamResponseDelta.functionCall == null : this.functionCall.equals(chatCompletionStreamResponseDelta.functionCall));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.role == null ? 0: this.role.hashCode());
    result = 31 * result + (this.content == null ? 0: this.content.hashCode());
    result = 31 * result + (this.functionCall == null ? 0: this.functionCall.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionStreamResponseDelta {\n");
    
    sb.append("  role: ").append(role).append("\n");
    sb.append("  content: ").append(content).append("\n");
    sb.append("  functionCall: ").append(functionCall).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
