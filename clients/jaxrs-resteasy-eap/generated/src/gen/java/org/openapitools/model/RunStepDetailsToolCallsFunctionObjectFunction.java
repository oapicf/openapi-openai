package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="The definition of the function that was called.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-01-29T14:09:29.020322047Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RunStepDetailsToolCallsFunctionObjectFunction   {
  
  private String name;
  private String arguments;
  private String output;

  /**
   * The name of the function.
   **/
  
  @ApiModelProperty(required = true, value = "The name of the function.")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The arguments passed to the function.
   **/
  
  @ApiModelProperty(required = true, value = "The arguments passed to the function.")
  @JsonProperty("arguments")
  @NotNull
  public String getArguments() {
    return arguments;
  }
  public void setArguments(String arguments) {
    this.arguments = arguments;
  }

  /**
   * The output of the function. This will be &#x60;null&#x60; if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet.
   **/
  
  @ApiModelProperty(required = true, value = "The output of the function. This will be `null` if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet.")
  @JsonProperty("output")
  @NotNull
  public String getOutput() {
    return output;
  }
  public void setOutput(String output) {
    this.output = output;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunStepDetailsToolCallsFunctionObjectFunction runStepDetailsToolCallsFunctionObjectFunction = (RunStepDetailsToolCallsFunctionObjectFunction) o;
    return Objects.equals(this.name, runStepDetailsToolCallsFunctionObjectFunction.name) &&
        Objects.equals(this.arguments, runStepDetailsToolCallsFunctionObjectFunction.arguments) &&
        Objects.equals(this.output, runStepDetailsToolCallsFunctionObjectFunction.output);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, arguments, output);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepDetailsToolCallsFunctionObjectFunction {\n");
    
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

