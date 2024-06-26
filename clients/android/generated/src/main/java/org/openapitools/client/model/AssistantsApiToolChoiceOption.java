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

import org.openapitools.client.model.AssistantsApiNamedToolChoice;
import org.openapitools.client.model.ChatCompletionNamedToolChoiceFunction;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Controls which (if any) tool is called by the model. &#x60;none&#x60; means the model will not call any tools and instead generates a message. &#x60;auto&#x60; is the default value and means the model can pick between generating a message or calling a tool. Specifying a particular tool like &#x60;{\&quot;type\&quot;: \&quot;TOOL_TYPE\&quot;}&#x60; or &#x60;{\&quot;type\&quot;: \&quot;function\&quot;, \&quot;function\&quot;: {\&quot;name\&quot;: \&quot;my_function\&quot;}}&#x60; forces the model to call that tool. 
 **/
@ApiModel(description = "Controls which (if any) tool is called by the model. `none` means the model will not call any tools and instead generates a message. `auto` is the default value and means the model can pick between generating a message or calling a tool. Specifying a particular tool like `{\"type\": \"TOOL_TYPE\"}` or `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}` forces the model to call that tool. ")
public class AssistantsApiToolChoiceOption {
  
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
    AssistantsApiToolChoiceOption assistantsApiToolChoiceOption = (AssistantsApiToolChoiceOption) o;
    return (this.type == null ? assistantsApiToolChoiceOption.type == null : this.type.equals(assistantsApiToolChoiceOption.type)) &&
        (this.function == null ? assistantsApiToolChoiceOption.function == null : this.function.equals(assistantsApiToolChoiceOption.function));
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
    sb.append("class AssistantsApiToolChoiceOption {\n");
    
    sb.append("  type: ").append(type).append("\n");
    sb.append("  function: ").append(function).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
