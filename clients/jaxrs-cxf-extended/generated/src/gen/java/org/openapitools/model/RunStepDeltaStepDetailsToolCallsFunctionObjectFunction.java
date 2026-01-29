package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The definition of the function that was called.
 */
@ApiModel(description="The definition of the function that was called.")

public class RunStepDeltaStepDetailsToolCallsFunctionObjectFunction  {
  
 /**
  * The name of the function.
  */
  @ApiModelProperty(value = "The name of the function.")
  private String name;

 /**
  * The arguments passed to the function.
  */
  @ApiModelProperty(value = "The arguments passed to the function.")
  private String arguments;

 /**
  * The output of the function. This will be `null` if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet.
  */
  @ApiModelProperty(value = "The output of the function. This will be `null` if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet.")
  private String output;
 /**
  * The name of the function.
  * @return name
  */
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public RunStepDeltaStepDetailsToolCallsFunctionObjectFunction name(String name) {
    this.name = name;
    return this;
  }

 /**
  * The arguments passed to the function.
  * @return arguments
  */
  @JsonProperty("arguments")
  public String getArguments() {
    return arguments;
  }

  /**
   * Sets the <code>arguments</code> property.
   */
 public void setArguments(String arguments) {
    this.arguments = arguments;
  }

  /**
   * Sets the <code>arguments</code> property.
   */
  public RunStepDeltaStepDetailsToolCallsFunctionObjectFunction arguments(String arguments) {
    this.arguments = arguments;
    return this;
  }

 /**
  * The output of the function. This will be &#x60;null&#x60; if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet.
  * @return output
  */
  @JsonProperty("output")
  public String getOutput() {
    return output;
  }

  /**
   * Sets the <code>output</code> property.
   */
 public void setOutput(String output) {
    this.output = output;
  }

  /**
   * Sets the <code>output</code> property.
   */
  public RunStepDeltaStepDetailsToolCallsFunctionObjectFunction output(String output) {
    this.output = output;
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
    RunStepDeltaStepDetailsToolCallsFunctionObjectFunction runStepDeltaStepDetailsToolCallsFunctionObjectFunction = (RunStepDeltaStepDetailsToolCallsFunctionObjectFunction) o;
    return Objects.equals(this.name, runStepDeltaStepDetailsToolCallsFunctionObjectFunction.name) &&
        Objects.equals(this.arguments, runStepDeltaStepDetailsToolCallsFunctionObjectFunction.arguments) &&
        Objects.equals(this.output, runStepDeltaStepDetailsToolCallsFunctionObjectFunction.output);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, arguments, output);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepDeltaStepDetailsToolCallsFunctionObjectFunction {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

