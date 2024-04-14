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

import org.openapitools.client.model.ChatCompletionResponseMessage;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CreateChatCompletionResponseChoicesInner {
  
  @SerializedName("index")
  private Integer index = null;
  @SerializedName("message")
  private ChatCompletionResponseMessage message = null;
  public enum FinishReasonEnum {
     stop,  length,  function_call, 
  };
  @SerializedName("finish_reason")
  private FinishReasonEnum finishReason = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getIndex() {
    return index;
  }
  public void setIndex(Integer index) {
    this.index = index;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ChatCompletionResponseMessage getMessage() {
    return message;
  }
  public void setMessage(ChatCompletionResponseMessage message) {
    this.message = message;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public FinishReasonEnum getFinishReason() {
    return finishReason;
  }
  public void setFinishReason(FinishReasonEnum finishReason) {
    this.finishReason = finishReason;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateChatCompletionResponseChoicesInner createChatCompletionResponseChoicesInner = (CreateChatCompletionResponseChoicesInner) o;
    return (this.index == null ? createChatCompletionResponseChoicesInner.index == null : this.index.equals(createChatCompletionResponseChoicesInner.index)) &&
        (this.message == null ? createChatCompletionResponseChoicesInner.message == null : this.message.equals(createChatCompletionResponseChoicesInner.message)) &&
        (this.finishReason == null ? createChatCompletionResponseChoicesInner.finishReason == null : this.finishReason.equals(createChatCompletionResponseChoicesInner.finishReason));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.index == null ? 0: this.index.hashCode());
    result = 31 * result + (this.message == null ? 0: this.message.hashCode());
    result = 31 * result + (this.finishReason == null ? 0: this.finishReason.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateChatCompletionResponseChoicesInner {\n");
    
    sb.append("  index: ").append(index).append("\n");
    sb.append("  message: ").append(message).append("\n");
    sb.append("  finishReason: ").append(finishReason).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}