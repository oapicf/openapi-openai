/*
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * OpenAPI document version: 2.0.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * The function definition.
 */

@ApiModel(description = "The function definition.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-11-03T11:07:37.417352657Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class RunToolCallObjectFunction   {
  
  private String name;
  private String arguments;

  /**
   * The name of the function.
   */
  public RunToolCallObjectFunction name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name of the function.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The arguments that the model expects you to pass to the function.
   */
  public RunToolCallObjectFunction arguments(String arguments) {
    this.arguments = arguments;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The arguments that the model expects you to pass to the function.")
  @JsonProperty("arguments")
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
    return Objects.equals(name, runToolCallObjectFunction.name) &&
        Objects.equals(arguments, runToolCallObjectFunction.arguments);
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

