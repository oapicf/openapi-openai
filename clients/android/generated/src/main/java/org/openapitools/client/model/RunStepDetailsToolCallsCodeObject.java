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

import org.openapitools.client.model.RunStepDetailsToolCallsCodeObjectCodeInterpreter;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Details of the Code Interpreter tool call the run step was involved in.
 **/
@ApiModel(description = "Details of the Code Interpreter tool call the run step was involved in.")
public class RunStepDetailsToolCallsCodeObject {
  
  @SerializedName("id")
  private String id = null;
  public enum TypeEnum {
     code_interpreter, 
  };
  @SerializedName("type")
  private TypeEnum type = null;
  @SerializedName("code_interpreter")
  private RunStepDetailsToolCallsCodeObjectCodeInterpreter codeInterpreter = null;

  /**
   * The ID of the tool call.
   **/
  @ApiModelProperty(required = true, value = "The ID of the tool call.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
   **/
  @ApiModelProperty(required = true, value = "The type of tool call. This is always going to be `code_interpreter` for this type of tool call.")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public RunStepDetailsToolCallsCodeObjectCodeInterpreter getCodeInterpreter() {
    return codeInterpreter;
  }
  public void setCodeInterpreter(RunStepDetailsToolCallsCodeObjectCodeInterpreter codeInterpreter) {
    this.codeInterpreter = codeInterpreter;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunStepDetailsToolCallsCodeObject runStepDetailsToolCallsCodeObject = (RunStepDetailsToolCallsCodeObject) o;
    return (this.id == null ? runStepDetailsToolCallsCodeObject.id == null : this.id.equals(runStepDetailsToolCallsCodeObject.id)) &&
        (this.type == null ? runStepDetailsToolCallsCodeObject.type == null : this.type.equals(runStepDetailsToolCallsCodeObject.type)) &&
        (this.codeInterpreter == null ? runStepDetailsToolCallsCodeObject.codeInterpreter == null : this.codeInterpreter.equals(runStepDetailsToolCallsCodeObject.codeInterpreter));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.codeInterpreter == null ? 0: this.codeInterpreter.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepDetailsToolCallsCodeObject {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  codeInterpreter: ").append(codeInterpreter).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}