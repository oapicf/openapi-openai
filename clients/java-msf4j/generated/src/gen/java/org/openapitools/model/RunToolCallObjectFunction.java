package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The function definition.
 */
@ApiModel(description = "The function definition.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-04-14T13:38:52.193957698Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class RunToolCallObjectFunction   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("arguments")
  private String arguments;

  public RunToolCallObjectFunction name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the function.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the function.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RunToolCallObjectFunction arguments(String arguments) {
    this.arguments = arguments;
    return this;
  }

   /**
   * The arguments that the model expects you to pass to the function.
   * @return arguments
  **/
  @ApiModelProperty(required = true, value = "The arguments that the model expects you to pass to the function.")
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

