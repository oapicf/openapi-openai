package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ChatCompletionNamedToolChoice;
import org.openapitools.model.ChatCompletionNamedToolChoiceFunction;

/**
 * Controls which (if any) function is called by the model. &#x60;none&#x60; means the model will not call a function and instead generates a message. &#x60;auto&#x60; means the model can pick between generating a message or calling a function. Specifying a particular function via &#x60;{\&quot;type\&quot;: \&quot;function\&quot;, \&quot;function\&quot;: {\&quot;name\&quot;: \&quot;my_function\&quot;}}&#x60; forces the model to call that function.  &#x60;none&#x60; is the default when no functions are present. &#x60;auto&#x60; is the default if functions are present. 
 */
@ApiModel(description = "Controls which (if any) function is called by the model. `none` means the model will not call a function and instead generates a message. `auto` means the model can pick between generating a message or calling a function. Specifying a particular function via `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}` forces the model to call that function.  `none` is the default when no functions are present. `auto` is the default if functions are present. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-11-03T11:07:10.127704480Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ChatCompletionToolChoiceOption   {
  /**
   * The type of the tool. Currently, only `function` is supported.
   */
  public enum TypeEnum {
    FUNCTION("function");

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
  private ChatCompletionNamedToolChoiceFunction function;

  public ChatCompletionToolChoiceOption type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the tool. Currently, only `function` is supported.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of the tool. Currently, only `function` is supported.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ChatCompletionToolChoiceOption function(ChatCompletionNamedToolChoiceFunction function) {
    this.function = function;
    return this;
  }

   /**
   * Get function
   * @return function
  **/
  @ApiModelProperty(required = true, value = "")
  public ChatCompletionNamedToolChoiceFunction getFunction() {
    return function;
  }

  public void setFunction(ChatCompletionNamedToolChoiceFunction function) {
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

