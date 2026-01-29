package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.ChatCompletionNamedToolChoiceFunction;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Specifies a tool the model should use. Use to force the model to call a specific function.
 */
@ApiModel(description="Specifies a tool the model should use. Use to force the model to call a specific function.")

public class ChatCompletionNamedToolChoice  {
  
public enum TypeEnum {

    @JsonProperty("function") FUNCTION(String.valueOf("function"));

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
  * The type of the tool. Currently, only `function` is supported.
  */
  @ApiModelProperty(required = true, value = "The type of the tool. Currently, only `function` is supported.")
  private TypeEnum type;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private ChatCompletionNamedToolChoiceFunction function;
 /**
  * The type of the tool. Currently, only &#x60;function&#x60; is supported.
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
  public ChatCompletionNamedToolChoice type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
  * Get function
  * @return function
  */
  @JsonProperty("function")
  @NotNull
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
  public ChatCompletionNamedToolChoice function(ChatCompletionNamedToolChoiceFunction function) {
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
    ChatCompletionNamedToolChoice chatCompletionNamedToolChoice = (ChatCompletionNamedToolChoice) o;
    return Objects.equals(this.type, chatCompletionNamedToolChoice.type) &&
        Objects.equals(this.function, chatCompletionNamedToolChoice.function);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, function);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionNamedToolChoice {\n");
    
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

