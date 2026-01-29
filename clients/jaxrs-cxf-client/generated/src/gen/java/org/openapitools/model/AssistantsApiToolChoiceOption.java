package org.openapitools.model;

import org.openapitools.model.AssistantsApiNamedToolChoice;
import org.openapitools.model.ChatCompletionNamedToolChoiceFunction;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Controls which (if any) tool is called by the model. `none` means the model will not call any tools and instead generates a message. `auto` is the default value and means the model can pick between generating a message or calling a tool. Specifying a particular tool like `{\"type\": \"TOOL_TYPE\"}` or `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}` forces the model to call that tool. 
 */
@ApiModel(description="Controls which (if any) tool is called by the model. `none` means the model will not call any tools and instead generates a message. `auto` is the default value and means the model can pick between generating a message or calling a tool. Specifying a particular tool like `{\"type\": \"TOOL_TYPE\"}` or `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}` forces the model to call that tool. ")

public class AssistantsApiToolChoiceOption  {
  
public enum TypeEnum {

FUNCTION(String.valueOf("function")), CODE_INTERPRETER(String.valueOf("code_interpreter")), RETRIEVAL(String.valueOf("retrieval"));


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

  private ChatCompletionNamedToolChoiceFunction function;
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

  public AssistantsApiToolChoiceOption type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
   * Get function
   * @return function
  **/
  @JsonProperty("function")
  public ChatCompletionNamedToolChoiceFunction getFunction() {
    return function;
  }

  public void setFunction(ChatCompletionNamedToolChoiceFunction function) {
    this.function = function;
  }

  public AssistantsApiToolChoiceOption function(ChatCompletionNamedToolChoiceFunction function) {
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
    AssistantsApiToolChoiceOption assistantsApiToolChoiceOption = (AssistantsApiToolChoiceOption) o;
    return Objects.equals(this.type, assistantsApiToolChoiceOption.type) &&
        Objects.equals(this.function, assistantsApiToolChoiceOption.function);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, function);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssistantsApiToolChoiceOption {\n");
    
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

