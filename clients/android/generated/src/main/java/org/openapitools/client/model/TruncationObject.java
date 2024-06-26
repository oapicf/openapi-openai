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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class TruncationObject {
  
  public enum TypeEnum {
     auto,  last_messages, 
  };
  @SerializedName("type")
  private TypeEnum type = null;
  @SerializedName("last_messages")
  private Integer lastMessages = null;

  /**
   * The truncation strategy to use for the thread. The default is `auto`. If set to `last_messages`, the thread will be truncated to the n most recent messages in the thread. When set to `auto`, messages in the middle of the thread will be dropped to fit the context length of the model, `max_prompt_tokens`.
   **/
  @ApiModelProperty(value = "The truncation strategy to use for the thread. The default is `auto`. If set to `last_messages`, the thread will be truncated to the n most recent messages in the thread. When set to `auto`, messages in the middle of the thread will be dropped to fit the context length of the model, `max_prompt_tokens`.")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * The number of most recent messages from the thread when constructing the context for the run.
   * minimum: 1
   **/
  @ApiModelProperty(value = "The number of most recent messages from the thread when constructing the context for the run.")
  public Integer getLastMessages() {
    return lastMessages;
  }
  public void setLastMessages(Integer lastMessages) {
    this.lastMessages = lastMessages;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TruncationObject truncationObject = (TruncationObject) o;
    return (this.type == null ? truncationObject.type == null : this.type.equals(truncationObject.type)) &&
        (this.lastMessages == null ? truncationObject.lastMessages == null : this.lastMessages.equals(truncationObject.lastMessages));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.lastMessages == null ? 0: this.lastMessages.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TruncationObject {\n");
    
    sb.append("  type: ").append(type).append("\n");
    sb.append("  lastMessages: ").append(lastMessages).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
