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

import org.openapitools.client.model.RunToolCallObjectFunction;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Tool call objects
 **/
@ApiModel(description = "Tool call objects")
public class RunToolCallObject {
  
  @SerializedName("id")
  private String id = null;
  public enum TypeEnum {
     function, 
  };
  @SerializedName("type")
  private TypeEnum type = null;
  @SerializedName("function")
  private RunToolCallObjectFunction function = null;

  /**
   * The ID of the tool call. This ID must be referenced when you submit the tool outputs in using the [Submit tool outputs to run](/docs/api-reference/runs/submitToolOutputs) endpoint.
   **/
  @ApiModelProperty(required = true, value = "The ID of the tool call. This ID must be referenced when you submit the tool outputs in using the [Submit tool outputs to run](/docs/api-reference/runs/submitToolOutputs) endpoint.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The type of tool call the output is required for. For now, this is always `function`.
   **/
  @ApiModelProperty(required = true, value = "The type of tool call the output is required for. For now, this is always `function`.")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public RunToolCallObjectFunction getFunction() {
    return function;
  }
  public void setFunction(RunToolCallObjectFunction function) {
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
    RunToolCallObject runToolCallObject = (RunToolCallObject) o;
    return (this.id == null ? runToolCallObject.id == null : this.id.equals(runToolCallObject.id)) &&
        (this.type == null ? runToolCallObject.type == null : this.type.equals(runToolCallObject.type)) &&
        (this.function == null ? runToolCallObject.function == null : this.function.equals(runToolCallObject.function));
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
    sb.append("class RunToolCallObject {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  function: ").append(function).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
