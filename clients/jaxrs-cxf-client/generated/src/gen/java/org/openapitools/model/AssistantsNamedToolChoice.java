package org.openapitools.model;

import org.openapitools.model.AssistantsNamedToolChoiceFunction;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specifies a tool the model should use. Use to force the model to call a specific tool.
 */
@ApiModel(description="Specifies a tool the model should use. Use to force the model to call a specific tool.")

public class AssistantsNamedToolChoice  {
  
public enum TypeEnum {

FUNCTION(String.valueOf("function")), CODE_INTERPRETER(String.valueOf("code_interpreter")), FILE_SEARCH(String.valueOf("file_search"));


    private String value;

    TypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
        for (TypeEnum b : TypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * The type of the tool. If type is `function`, the function name must be set
  */
  @ApiModelProperty(required = true, value = "The type of the tool. If type is `function`, the function name must be set")

  private TypeEnum type;

  @ApiModelProperty(value = "")

  private AssistantsNamedToolChoiceFunction function;
 /**
   * The type of the tool. If type is &#x60;function&#x60;, the function name must be set
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    if (type == null) {
      return null;
    }
    return type.value();
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public AssistantsNamedToolChoice type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
   * Get function
   * @return function
  **/
  @JsonProperty("function")
  public AssistantsNamedToolChoiceFunction getFunction() {
    return function;
  }

  public void setFunction(AssistantsNamedToolChoiceFunction function) {
    this.function = function;
  }

  public AssistantsNamedToolChoice function(AssistantsNamedToolChoiceFunction function) {
    this.function = function;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

