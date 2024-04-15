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
 * Specifies a tool the model should use. Use to force the model to call a specific tool.
 **/
@ApiModel(description = "Specifies a tool the model should use. Use to force the model to call a specific tool.")
public class AssistantsApiNamedToolChoice {
  
  public enum TypeEnum {
     function,  code_interpreter,  retrieval, 
  };
  @SerializedName("type")
  private TypeEnum type = null;
  @SerializedName("function")
  private ChatCompletionNamedToolChoiceFunction function = null;

  /**
   * The type of the tool. If type is `function`, the function name must be set
   **/
  @ApiModelProperty(required = true, value = "The type of the tool. If type is `function`, the function name must be set")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   **/
  @ApiModelProperty(value = "")
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
    AssistantsApiNamedToolChoice assistantsApiNamedToolChoice = (AssistantsApiNamedToolChoice) o;
    return (this.type == null ? assistantsApiNamedToolChoice.type == null : this.type.equals(assistantsApiNamedToolChoice.type)) &&
        (this.function == null ? assistantsApiNamedToolChoice.function == null : this.function.equals(assistantsApiNamedToolChoice.function));
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
    sb.append("class AssistantsApiNamedToolChoice {\n");
    
    sb.append("  type: ").append(type).append("\n");
    sb.append("  function: ").append(function).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}