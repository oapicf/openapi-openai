/*
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * OpenAPI document version: 2.0.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ChatCompletionNamedToolChoiceFunction;



/**
 * Specifies a tool the model should use. Use to force the model to call a specific function.
 */

@ApiModel(description = "Specifies a tool the model should use. Use to force the model to call a specific function.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-11-03T11:07:37.417352657Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ChatCompletionNamedToolChoice   {
  


  public enum TypeEnum {
    FUNCTION("function");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private TypeEnum type;
  private ChatCompletionNamedToolChoiceFunction function;

  /**
   * The type of the tool. Currently, only `function` is supported.
   */
  public ChatCompletionNamedToolChoice type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The type of the tool. Currently, only `function` is supported.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   */
  public ChatCompletionNamedToolChoice function(ChatCompletionNamedToolChoiceFunction function) {
    this.function = function;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("function")
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
    ChatCompletionNamedToolChoice chatCompletionNamedToolChoice = (ChatCompletionNamedToolChoice) o;
    return Objects.equals(type, chatCompletionNamedToolChoice.type) &&
        Objects.equals(function, chatCompletionNamedToolChoice.function);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

