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

import org.openapitools.client.model.ChatCompletionNamedToolChoiceFunction;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Specifies a tool the model should use. Use to force the model to call a specific function.
 **/
@ApiModel(description = "Specifies a tool the model should use. Use to force the model to call a specific function.")
public class ChatCompletionNamedToolChoice {
  
  public enum TypeEnum {
     function, 
  };
  @SerializedName("type")
  private TypeEnum type = null;
  @SerializedName("function")
  private ChatCompletionNamedToolChoiceFunction function = null;

  /**
   * The type of the tool. Currently, only `function` is supported.
   **/
  @ApiModelProperty(required = true, value = "The type of the tool. Currently, only `function` is supported.")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public ChatCompletionNamedToolChoiceFunction getFunction() {
    return function;
  }
  public void setFunction(ChatCompletionNamedToolChoiceFunction function) {
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
    ChatCompletionNamedToolChoice chatCompletionNamedToolChoice = (ChatCompletionNamedToolChoice) o;
    return (this.type == null ? chatCompletionNamedToolChoice.type == null : this.type.equals(chatCompletionNamedToolChoice.type)) &&
        (this.function == null ? chatCompletionNamedToolChoice.function == null : this.function.equals(chatCompletionNamedToolChoice.function));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.function == null ? 0: this.function.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionNamedToolChoice {\n");
    
    sb.append("  type: ").append(type).append("\n");
    sb.append("  function: ").append(function).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
