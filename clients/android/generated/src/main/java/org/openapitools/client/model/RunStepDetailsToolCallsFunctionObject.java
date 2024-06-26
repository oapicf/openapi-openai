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

import org.openapitools.client.model.RunStepDetailsToolCallsFunctionObjectFunction;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class RunStepDetailsToolCallsFunctionObject {
  
  @SerializedName("id")
  private String id = null;
  public enum TypeEnum {
     function, 
  };
  @SerializedName("type")
  private TypeEnum type = null;
  @SerializedName("function")
  private RunStepDetailsToolCallsFunctionObjectFunction function = null;

  /**
   * The ID of the tool call object.
   **/
  @ApiModelProperty(required = true, value = "The ID of the tool call object.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The type of tool call. This is always going to be `function` for this type of tool call.
   **/
  @ApiModelProperty(required = true, value = "The type of tool call. This is always going to be `function` for this type of tool call.")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public RunStepDetailsToolCallsFunctionObjectFunction getFunction() {
    return function;
  }
  public void setFunction(RunStepDetailsToolCallsFunctionObjectFunction function) {
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
    RunStepDetailsToolCallsFunctionObject runStepDetailsToolCallsFunctionObject = (RunStepDetailsToolCallsFunctionObject) o;
    return (this.id == null ? runStepDetailsToolCallsFunctionObject.id == null : this.id.equals(runStepDetailsToolCallsFunctionObject.id)) &&
        (this.type == null ? runStepDetailsToolCallsFunctionObject.type == null : this.type.equals(runStepDetailsToolCallsFunctionObject.type)) &&
        (this.function == null ? runStepDetailsToolCallsFunctionObject.function == null : this.function.equals(runStepDetailsToolCallsFunctionObject.function));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.function == null ? 0: this.function.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepDetailsToolCallsFunctionObject {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  function: ").append(function).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
