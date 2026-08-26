package org.openapitools.model;

import org.openapitools.model.RunToolCallObjectFunction;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Tool call objects
 */
public class RunToolCallObject implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The ID of the tool call. This ID must be referenced when you submit the tool outputs in using the [Submit tool outputs to run](/docs/api-reference/runs/submitToolOutputs) endpoint.
   */
  @JsonProperty("id")
  private String id;

  /**
   * The type of tool call the output is required for. For now, this is always &#x60;function&#x60;.
   */
  @JsonProperty("type")
  private String type;

  @JsonProperty("function")
  private RunToolCallObjectFunction function;

  /**
   * The ID of the tool call. This ID must be referenced when you submit the tool outputs in using the [Submit tool outputs to run](/docs/api-reference/runs/submitToolOutputs) endpoint.
   * @return id
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The type of tool call the output is required for. For now, this is always &#x60;function&#x60;.
   * @return type
   */
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * 
   * @return function
   */
  public RunToolCallObjectFunction getFunction() {
    return function;
  }

  public void setFunction(RunToolCallObjectFunction function) {
    this.function = function;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunToolCallObject runToolCallObject = (RunToolCallObject) o;
    return Objects.equals(this.id, runToolCallObject.id) &&
        Objects.equals(this.type, runToolCallObject.type) &&
        Objects.equals(this.function, runToolCallObject.function);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, function);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunToolCallObject {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
