package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AssistantsNamedToolChoiceFunction;
import org.openapitools.model.ChatCompletionNamedToolChoice;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Controls which (if any) tool is called by the model. &#x60;none&#x60; means the model will not call any tool and instead generates a message. &#x60;auto&#x60; means the model can pick between generating a message or calling one or more tools. &#x60;required&#x60; means the model must call one or more tools. Specifying a particular tool via &#x60;{\&quot;type\&quot;: \&quot;function\&quot;, \&quot;function\&quot;: {\&quot;name\&quot;: \&quot;my_function\&quot;}}&#x60; forces the model to call that tool.  &#x60;none&#x60; is the default when no tools are present. &#x60;auto&#x60; is the default if tools are present. 
 **/
@ApiModel(description = "Controls which (if any) tool is called by the model. `none` means the model will not call any tool and instead generates a message. `auto` means the model can pick between generating a message or calling one or more tools. `required` means the model must call one or more tools. Specifying a particular tool via `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}` forces the model to call that tool.  `none` is the default when no tools are present. `auto` is the default if tools are present. ")
@JsonTypeName("ChatCompletionToolChoiceOption")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ChatCompletionToolChoiceOption   {
  public enum TypeEnum {

    FUNCTION(String.valueOf("function"));


    private String value;

    TypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static TypeEnum fromString(String s) {
        for (TypeEnum b : TypeEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
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

  public ChatCompletionToolChoiceOption() {
  }

  @JsonCreator
  public ChatCompletionToolChoiceOption(
    @JsonProperty(required = true, value = "type") TypeEnum type,
    @JsonProperty(required = true, value = "function") AssistantsNamedToolChoiceFunction function
  ) {
    this.type = type;
    this.function = function;
  }

  /**
   * The type of the tool. Currently, only &#x60;function&#x60; is supported.
   **/
  public ChatCompletionToolChoiceOption type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The type of the tool. Currently, only `function` is supported.")
  @JsonProperty(required = true, value = "type")
  @NotNull public TypeEnum getType() {
    return type;
  }

  @JsonProperty(required = true, value = "type")
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   **/
  public ChatCompletionToolChoiceOption function(AssistantsNamedToolChoiceFunction function) {
    this.function = function;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "function")
  @NotNull @Valid public AssistantsNamedToolChoiceFunction getFunction() {
    return function;
  }

  @JsonProperty(required = true, value = "function")
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
    ChatCompletionToolChoiceOption chatCompletionToolChoiceOption = (ChatCompletionToolChoiceOption) o;
    return Objects.equals(this.type, chatCompletionToolChoiceOption.type) &&
        Objects.equals(this.function, chatCompletionToolChoiceOption.function);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, function);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionToolChoiceOption {\n");
    
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

