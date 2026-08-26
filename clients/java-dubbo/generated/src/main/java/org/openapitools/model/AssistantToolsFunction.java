package org.openapitools.model;

import org.openapitools.model.FunctionObject;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class AssistantToolsFunction implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The type of tool being defined: &#x60;function&#x60;
   */
  @JsonProperty("type")
  private String type;

  @JsonProperty("function")
  private FunctionObject function;

  /**
   * The type of tool being defined: &#x60;function&#x60;
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
  public FunctionObject getFunction() {
    return function;
  }

  public void setFunction(FunctionObject function) {
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
    AssistantToolsFunction assistantToolsFunction = (AssistantToolsFunction) o;
    return Objects.equals(this.type, assistantToolsFunction.type) &&
        Objects.equals(this.function, assistantToolsFunction.function);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, function);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssistantToolsFunction {\n");
    
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
