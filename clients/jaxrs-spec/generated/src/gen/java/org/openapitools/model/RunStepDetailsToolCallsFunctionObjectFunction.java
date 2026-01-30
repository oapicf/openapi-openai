package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * The definition of the function that was called.
 **/
@ApiModel(description = "The definition of the function that was called.")
@JsonTypeName("RunStepDetailsToolCallsFunctionObject_function")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RunStepDetailsToolCallsFunctionObjectFunction   {
  private String name;
  private String arguments;
  private String output;

  public RunStepDetailsToolCallsFunctionObjectFunction() {
  }

  @JsonCreator
  public RunStepDetailsToolCallsFunctionObjectFunction(
    @JsonProperty(required = true, value = "name") String name,
    @JsonProperty(required = true, value = "arguments") String arguments,
    @JsonProperty(required = true, value = "output") String output
  ) {
    this.name = name;
    this.arguments = arguments;
    this.output = output;
  }

  /**
   * The name of the function.
   **/
  public RunStepDetailsToolCallsFunctionObjectFunction name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name of the function.")
  @JsonProperty(required = true, value = "name")
  @NotNull public String getName() {
    return name;
  }

  @JsonProperty(required = true, value = "name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The arguments passed to the function.
   **/
  public RunStepDetailsToolCallsFunctionObjectFunction arguments(String arguments) {
    this.arguments = arguments;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The arguments passed to the function.")
  @JsonProperty(required = true, value = "arguments")
  @NotNull public String getArguments() {
    return arguments;
  }

  @JsonProperty(required = true, value = "arguments")
  public void setArguments(String arguments) {
    this.arguments = arguments;
  }

  /**
   * The output of the function. This will be &#x60;null&#x60; if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet.
   **/
  public RunStepDetailsToolCallsFunctionObjectFunction output(String output) {
    this.output = output;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The output of the function. This will be `null` if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet.")
  @JsonProperty(required = true, value = "output")
  @NotNull public String getOutput() {
    return output;
  }

  @JsonProperty(required = true, value = "output")
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

