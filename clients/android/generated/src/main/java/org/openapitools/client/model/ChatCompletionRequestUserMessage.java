/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.ChatCompletionRequestUserMessageContent;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ChatCompletionRequestUserMessage {
  
  @SerializedName("content")
  private ChatCompletionRequestUserMessageContent content = null;
  public enum RoleEnum {
     user, 
  };
  @SerializedName("role")
  private RoleEnum role = null;
  @SerializedName("name")
  private String name = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public ChatCompletionRequestUserMessageContent getContent() {
    return content;
  }
  public void setContent(ChatCompletionRequestUserMessageContent content) {
    this.content = content;
  }

  /**
   * The role of the messages author, in this case `user`.
   **/
  @ApiModelProperty(required = true, value = "The role of the messages author, in this case `user`.")
  public RoleEnum getRole() {
    return role;
  }
  public void setRole(RoleEnum role) {
    this.role = role;
  }

  /**
   * An optional name for the participant. Provides the model information to differentiate between participants of the same role.
   **/
  @ApiModelProperty(value = "An optional name for the participant. Provides the model information to differentiate between participants of the same role.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatCompletionRequestUserMessage chatCompletionRequestUserMessage = (ChatCompletionRequestUserMessage) o;
    return (this.content == null ? chatCompletionRequestUserMessage.content == null : this.content.equals(chatCompletionRequestUserMessage.content)) &&
        (this.role == null ? chatCompletionRequestUserMessage.role == null : this.role.equals(chatCompletionRequestUserMessage.role)) &&
        (this.name == null ? chatCompletionRequestUserMessage.name == null : this.name.equals(chatCompletionRequestUserMessage.name));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.content == null ? 0: this.content.hashCode());
    result = 31 * result + (this.role == null ? 0: this.role.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionRequestUserMessage {\n");
    
    sb.append("  content: ").append(content).append("\n");
    sb.append("  role: ").append(role).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}