package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.ChatCompletionNamedToolChoiceFunction;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Specifies a tool the model should use. Use to force the model to call a specific tool.
 */
@ApiModel(description="Specifies a tool the model should use. Use to force the model to call a specific tool.")

public class AssistantsApiNamedToolChoice  {
  
public enum TypeEnum {

    @JsonProperty("function") FUNCTION(String.valueOf("function")),
    @JsonProperty("code_interpreter") CODE_INTERPRETER(String.valueOf("code_interpreter")),
    @JsonProperty("retrieval") RETRIEVAL(String.valueOf("retrieval"));

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
  @Valid
  private ChatCompletionNamedToolChoiceFunction function;
 /**
  * The type of the tool. If type is &#x60;function&#x60;, the function name must be set
  * @return type
  */
  @JsonProperty("type")
  @NotNull
  public String getType() {
    return type == null ? null : type.value();
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public AssistantsApiNamedToolChoice type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
  * Get function
  * @return function
  */
  @JsonProperty("function")
  public ChatCompletionNamedToolChoiceFunction getFunction() {
    return function;
  }

  /**
   * Sets the <code>function</code> property.
   */
 public void setFunction(ChatCompletionNamedToolChoiceFunction function) {
    this.function = function;
  }

  /**
   * Sets the <code>function</code> property.
   */
  public AssistantsApiNamedToolChoice function(ChatCompletionNamedToolChoiceFunction function) {
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
    AssistantsApiNamedToolChoice assistantsApiNamedToolChoice = (AssistantsApiNamedToolChoice) o;
    return Objects.equals(this.type, assistantsApiNamedToolChoice.type) &&
        Objects.equals(this.function, assistantsApiNamedToolChoice.function);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, function);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssistantsApiNamedToolChoice {\n");
    
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

