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

import java.util.*;
import org.openapitools.client.model.RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * The Code Interpreter tool call definition.
 **/
@ApiModel(description = "The Code Interpreter tool call definition.")
public class RunStepDetailsToolCallsCodeObjectCodeInterpreter {
  
  @SerializedName("input")
  private String input = null;
  @SerializedName("outputs")
  private List<RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner> outputs = null;

  /**
   * The input to the Code Interpreter tool call.
   **/
  @ApiModelProperty(required = true, value = "The input to the Code Interpreter tool call.")
  public String getInput() {
    return input;
  }
  public void setInput(String input) {
    this.input = input;
  }

  /**
   * The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (`logs`) or images (`image`). Each of these are represented by a different object type.
   **/
  @ApiModelProperty(required = true, value = "The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (`logs`) or images (`image`). Each of these are represented by a different object type.")
  public List<RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner> getOutputs() {
    return outputs;
  }
  public void setOutputs(List<RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner> outputs) {
    this.outputs = outputs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunStepDetailsToolCallsCodeObjectCodeInterpreter runStepDetailsToolCallsCodeObjectCodeInterpreter = (RunStepDetailsToolCallsCodeObjectCodeInterpreter) o;
    return (this.input == null ? runStepDetailsToolCallsCodeObjectCodeInterpreter.input == null : this.input.equals(runStepDetailsToolCallsCodeObjectCodeInterpreter.input)) &&
        (this.outputs == null ? runStepDetailsToolCallsCodeObjectCodeInterpreter.outputs == null : this.outputs.equals(runStepDetailsToolCallsCodeObjectCodeInterpreter.outputs));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.input == null ? 0: this.input.hashCode());
    result = 31 * result + (this.outputs == null ? 0: this.outputs.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepDetailsToolCallsCodeObjectCodeInterpreter {\n");
    
    sb.append("  input: ").append(input).append("\n");
    sb.append("  outputs: ").append(outputs).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
