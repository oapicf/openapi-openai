package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The Code Interpreter tool call definition.
 **/
@ApiModel(description = "The Code Interpreter tool call definition.")
@JsonTypeName("RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-03T11:09:06.848004747Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter   {
  private String input;
  private @Valid List<@Valid RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner> outputs = new ArrayList<>();

  /**
   * The input to the Code Interpreter tool call.
   **/
  public RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter input(String input) {
    this.input = input;
    return this;
  }

  
  @ApiModelProperty(value = "The input to the Code Interpreter tool call.")
  @JsonProperty("input")
  public String getInput() {
    return input;
  }

  @JsonProperty("input")
  public void setInput(String input) {
    this.input = input;
  }

  /**
   * The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (&#x60;logs&#x60;) or images (&#x60;image&#x60;). Each of these are represented by a different object type.
   **/
  public RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter outputs(List<@Valid RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner> outputs) {
    this.outputs = outputs;
    return this;
  }

  
  @ApiModelProperty(value = "The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (`logs`) or images (`image`). Each of these are represented by a different object type.")
  @JsonProperty("outputs")
  @Valid public List<@Valid RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner> getOutputs() {
    return outputs;
  }

  @JsonProperty("outputs")
  public void setOutputs(List<@Valid RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner> outputs) {
    this.outputs = outputs;
  }

  public RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter addOutputsItem(RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner outputsItem) {
    if (this.outputs == null) {
      this.outputs = new ArrayList<>();
    }

    this.outputs.add(outputsItem);
    return this;
  }

  public RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter removeOutputsItem(RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner outputsItem) {
    if (outputsItem != null && this.outputs != null) {
      this.outputs.remove(outputsItem);
    }

    return this;
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
    return Objects.equals(this.input, runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter.input) &&
        Objects.equals(this.outputs, runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter.outputs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(input, outputs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter {\n");
    
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

