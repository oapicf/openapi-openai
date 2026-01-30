package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AssistantsNamedToolChoice;
import org.openapitools.model.AssistantsNamedToolChoiceFunction;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Controls which (if any) tool is called by the model. &#x60;none&#x60; means the model will not call any tools and instead generates a message. &#x60;auto&#x60; is the default value and means the model can pick between generating a message or calling one or more tools. &#x60;required&#x60; means the model must call one or more tools before responding to the user. Specifying a particular tool like &#x60;{\&quot;type\&quot;: \&quot;file_search\&quot;}&#x60; or &#x60;{\&quot;type\&quot;: \&quot;function\&quot;, \&quot;function\&quot;: {\&quot;name\&quot;: \&quot;my_function\&quot;}}&#x60; forces the model to call that tool. 
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Controls which (if any) tool is called by the model. `none` means the model will not call any tools and instead generates a message. `auto` is the default value and means the model can pick between generating a message or calling one or more tools. `required` means the model must call one or more tools before responding to the user. Specifying a particular tool like `{\"type\": \"file_search\"}` or `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}` forces the model to call that tool. ")
public class AssistantsApiToolChoiceOption   {
  

public enum TypeEnum {

    @JsonProperty("function") FUNCTION(String.valueOf("function")), @JsonProperty("code_interpreter") CODE_INTERPRETER(String.valueOf("code_interpreter")), @JsonProperty("file_search") FILE_SEARCH(String.valueOf("file_search"));


    private String value;

    TypeEnum(String v) {
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

  private TypeEnum type;

  private AssistantsNamedToolChoiceFunction function;

  /**
   * The type of the tool. If type is &#x60;function&#x60;, the function name must be set
   **/
  public AssistantsApiToolChoiceOption type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The type of the tool. If type is `function`, the function name must be set")
  @JsonProperty("type")
  @NotNull
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   **/
  public AssistantsApiToolChoiceOption function(AssistantsNamedToolChoiceFunction function) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

