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

import org.openapitools.client.model.ChatCompletionMessageToolCallChunkFunction;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ChatCompletionMessageToolCallChunk {
  
  @SerializedName("index")
  private Integer index = null;
  @SerializedName("id")
  private String id = null;
  public enum TypeEnum {
     function, 
  };
  @SerializedName("type")
  private TypeEnum type = null;
  @SerializedName("function")
  private ChatCompletionMessageToolCallChunkFunction function = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getIndex() {
    return index;
  }
  public void setIndex(Integer index) {
    this.index = index;
  }

  /**
   * The ID of the tool call.
   **/
  @ApiModelProperty(value = "The ID of the tool call.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The type of the tool. Currently, only `function` is supported.
   **/
  @ApiModelProperty(value = "The type of the tool. Currently, only `function` is supported.")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ChatCompletionMessageToolCallChunkFunction getFunction() {
    return function;
  }
  public void setFunction(ChatCompletionMessageToolCallChunkFunction function) {
    this.function = function;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatCompletionMessageToolCallChunk chatCompletionMessageToolCallChunk = (ChatCompletionMessageToolCallChunk) o;
    return (this.index == null ? chatCompletionMessageToolCallChunk.index == null : this.index.equals(chatCompletionMessageToolCallChunk.index)) &&
        (this.id == null ? chatCompletionMessageToolCallChunk.id == null : this.id.equals(chatCompletionMessageToolCallChunk.id)) &&
        (this.type == null ? chatCompletionMessageToolCallChunk.type == null : this.type.equals(chatCompletionMessageToolCallChunk.type)) &&
        (this.function == null ? chatCompletionMessageToolCallChunk.function == null : this.function.equals(chatCompletionMessageToolCallChunk.function));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.index == null ? 0: this.index.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.function == null ? 0: this.function.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionMessageToolCallChunk {\n");
    
    sb.append("  index: ").append(index).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  function: ").append(function).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
