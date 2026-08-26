package org.openapitools.model;

import org.openapitools.model.AssistantsNamedToolChoiceFunction;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Specifies a tool the model should use. Use to force the model to call a specific tool.
 */
public class AssistantsNamedToolChoice implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The type of the tool. If type is &#x60;function&#x60;, the function name must be set
   */
  @JsonProperty("type")
  private String type;

  @JsonProperty("function")
  private AssistantsNamedToolChoiceFunction function;

  /**
   * The type of the tool. If type is &#x60;function&#x60;, the function name must be set
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
  public AssistantsNamedToolChoiceFunction getFunction() {
    return function;
  }

  public void setFunction(AssistantsNamedToolChoiceFunction function) {
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
    AssistantsNamedToolChoice assistantsNamedToolChoice = (AssistantsNamedToolChoice) o;
    return Objects.equals(this.type, assistantsNamedToolChoice.type) &&
        Objects.equals(this.function, assistantsNamedToolChoice.function);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, function);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssistantsNamedToolChoice {\n");
    
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
