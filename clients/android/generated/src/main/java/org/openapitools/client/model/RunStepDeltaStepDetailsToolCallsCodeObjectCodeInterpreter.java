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
import org.openapitools.client.model.RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * The Code Interpreter tool call definition.
 **/
@ApiModel(description = "The Code Interpreter tool call definition.")
public class RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter {
  
  @SerializedName("input")
  private String input = null;
  @SerializedName("outputs")
  private List<RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner> outputs = null;

  /**
   * The input to the Code Interpreter tool call.
   **/
  @ApiModelProperty(value = "The input to the Code Interpreter tool call.")
  public String getInput() {
    return input;
  }
  public void setInput(String input) {
    this.input = input;
  }

  /**
   * The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (`logs`) or images (`image`). Each of these are represented by a different object type.
   **/
  @ApiModelProperty(value = "The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (`logs`) or images (`image`). Each of these are represented by a different object type.")
  public List<RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner> getOutputs() {
    return outputs;
  }
  public void setOutputs(List<RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner> outputs) {
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
    RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter = (RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter) o;
    return (this.input == null ? runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter.input == null : this.input.equals(runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter.input)) &&
        (this.outputs == null ? runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter.outputs == null : this.outputs.equals(runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter.outputs));
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
    sb.append("class RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter {\n");
    
    sb.append("  input: ").append(input).append("\n");
    sb.append("  outputs: ").append(outputs).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
