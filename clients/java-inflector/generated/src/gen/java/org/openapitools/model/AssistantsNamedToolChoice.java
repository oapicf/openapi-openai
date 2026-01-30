package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AssistantsNamedToolChoiceFunction;



/**
 * Specifies a tool the model should use. Use to force the model to call a specific tool.
 **/

@ApiModel(description = "Specifies a tool the model should use. Use to force the model to call a specific tool.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-01-29T14:07:47.634062747Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AssistantsNamedToolChoice   {
  /**
   * The type of the tool. If type is `function`, the function name must be set
   */
  public enum TypeEnum {
    FUNCTION("function"),
    
    CODE_INTERPRETER("code_interpreter"),
    
    FILE_SEARCH("file_search");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("type")
  private TypeEnum type;

  @JsonProperty("function")
  private AssistantsNamedToolChoiceFunction function;

  /**
   * The type of the tool. If type is `function`, the function name must be set
   **/
  public AssistantsNamedToolChoice type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The type of the tool. If type is `function`, the function name must be set")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   **/
  public AssistantsNamedToolChoice function(AssistantsNamedToolChoiceFunction function) {
    this.function = function;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("function")
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
    return Objects.equals(type, assistantsNamedToolChoice.type) &&
        Objects.equals(function, assistantsNamedToolChoice.function);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

