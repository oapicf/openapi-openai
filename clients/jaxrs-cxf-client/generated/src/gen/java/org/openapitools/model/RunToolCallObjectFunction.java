package org.openapitools.model;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The function definition.
 */
@ApiModel(description="The function definition.")

public class RunToolCallObjectFunction  {
  
 /**
  * The name of the function.
  */
  @ApiModelProperty(required = true, value = "The name of the function.")

  private String name;

 /**
  * The arguments that the model expects you to pass to the function.
  */
  @ApiModelProperty(required = true, value = "The arguments that the model expects you to pass to the function.")

  private String arguments;
 /**
   * The name of the function.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RunToolCallObjectFunction name(String name) {
    this.name = name;
    return this;
  }

 /**
   * The arguments that the model expects you to pass to the function.
   * @return arguments
  **/
  @JsonProperty("arguments")
  public String getArguments() {
    return arguments;
  }

  public void setArguments(String arguments) {
    this.arguments = arguments;
  }

  public RunToolCallObjectFunction arguments(String arguments) {
    this.arguments = arguments;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

