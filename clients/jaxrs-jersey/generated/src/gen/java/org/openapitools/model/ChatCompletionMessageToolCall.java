/*
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ChatCompletionMessageToolCallFunction;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * ChatCompletionMessageToolCall
 */
@JsonPropertyOrder({
  ChatCompletionMessageToolCall.JSON_PROPERTY_ID,
  ChatCompletionMessageToolCall.JSON_PROPERTY_TYPE,
  ChatCompletionMessageToolCall.JSON_PROPERTY_FUNCTION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-11-03T11:08:40.472203335Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ChatCompletionMessageToolCall   {
  public static final String JSON_PROPERTY_ID = "id";
  @JsonProperty(JSON_PROPERTY_ID)
  private String id;

  /**
   * The type of the tool. Currently, only &#x60;function&#x60; is supported.
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  @JsonProperty(JSON_PROPERTY_TYPE)
  private TypeEnum type;

  public static final String JSON_PROPERTY_FUNCTION = "function";
  @JsonProperty(JSON_PROPERTY_FUNCTION)
  private ChatCompletionMessageToolCallFunction function;

  public ChatCompletionMessageToolCall id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the tool call.
   * @return id
   **/
  @JsonProperty(value = "id")
  @ApiModelProperty(required = true, value = "The ID of the tool call.")
  @NotNull 
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ChatCompletionMessageToolCall type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the tool. Currently, only &#x60;function&#x60; is supported.
   * @return type
   **/
  @JsonProperty(value = "type")
  @ApiModelProperty(required = true, value = "The type of the tool. Currently, only `function` is supported.")
  @NotNull 
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ChatCompletionMessageToolCall function(ChatCompletionMessageToolCallFunction function) {
    this.function = function;
    return this;
  }

  /**
   * Get function
   * @return function
   **/
  @JsonProperty(value = "function")
  @ApiModelProperty(required = true, value = "")
  @NotNull @Valid 
  public ChatCompletionMessageToolCallFunction getFunction() {
    return function;
  }

  public void setFunction(ChatCompletionMessageToolCallFunction function) {
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
    ChatCompletionMessageToolCall chatCompletionMessageToolCall = (ChatCompletionMessageToolCall) o;
    return Objects.equals(this.id, chatCompletionMessageToolCall.id) &&
        Objects.equals(this.type, chatCompletionMessageToolCall.type) &&
        Objects.equals(this.function, chatCompletionMessageToolCall.function);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, function);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionMessageToolCall {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

