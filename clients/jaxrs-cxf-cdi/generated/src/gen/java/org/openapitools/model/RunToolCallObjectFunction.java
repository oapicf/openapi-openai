package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The function definition.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "The function definition.")
public class RunToolCallObjectFunction   {
  
  private String name;

  private String arguments;

  /**
   * The name of the function.
   **/
  public RunToolCallObjectFunction name(String name) {
    this.name = name;
    return this;
  }

  
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
   * The arguments that the model expects you to pass to the function.
   **/
  public RunToolCallObjectFunction arguments(String arguments) {
    this.arguments = arguments;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The arguments that the model expects you to pass to the function.")
  @JsonProperty("arguments")
  @NotNull
  public String getArguments() {
    return arguments;
  }
  public void setArguments(String arguments) {
    this.arguments = arguments;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunToolCallObjectFunction runToolCallObjectFunction = (RunToolCallObjectFunction) o;
    return Objects.equals(this.name, runToolCallObjectFunction.name) &&
        Objects.equals(this.arguments, runToolCallObjectFunction.arguments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, arguments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunToolCallObjectFunction {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
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

