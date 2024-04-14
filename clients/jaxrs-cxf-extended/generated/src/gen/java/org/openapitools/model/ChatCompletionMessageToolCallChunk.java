package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.ChatCompletionMessageToolCallChunkFunction;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ChatCompletionMessageToolCallChunk  {
  
  @ApiModelProperty(required = true, value = "")
  private Integer index;

 /**
  * The ID of the tool call.
  */
  @ApiModelProperty(value = "The ID of the tool call.")
  private String id;

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
  @ApiModelProperty(value = "The type of the tool. Currently, only `function` is supported.")
  private TypeEnum type;

  @ApiModelProperty(value = "")
  @Valid
  private ChatCompletionMessageToolCallChunkFunction function;
 /**
  * Get index
  * @return index
  */
  @JsonProperty("index")
  @NotNull
  public Integer getIndex() {
    return index;
  }

  /**
   * Sets the <code>index</code> property.
   */
 public void setIndex(Integer index) {
    this.index = index;
  }

  /**
   * Sets the <code>index</code> property.
   */
  public ChatCompletionMessageToolCallChunk index(Integer index) {
    this.index = index;
    return this;
  }

 /**
  * The ID of the tool call.
  * @return id
  */
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public ChatCompletionMessageToolCallChunk id(String id) {
    this.id = id;
    return this;
  }

 /**
  * The type of the tool. Currently, only &#x60;function&#x60; is supported.
  * @return type
  */
  @JsonProperty("type")
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
  public ChatCompletionMessageToolCallChunk type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
  * Get function
  * @return function
  */
  @JsonProperty("function")
  public ChatCompletionMessageToolCallChunkFunction getFunction() {
    return function;
  }

  /**
   * Sets the <code>function</code> property.
   */
 public void setFunction(ChatCompletionMessageToolCallChunkFunction function) {
    this.function = function;
  }

  /**
   * Sets the <code>function</code> property.
   */
  public ChatCompletionMessageToolCallChunk function(ChatCompletionMessageToolCallChunkFunction function) {
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
    ChatCompletionMessageToolCallChunk chatCompletionMessageToolCallChunk = (ChatCompletionMessageToolCallChunk) o;
    return Objects.equals(this.index, chatCompletionMessageToolCallChunk.index) &&
        Objects.equals(this.id, chatCompletionMessageToolCallChunk.id) &&
        Objects.equals(this.type, chatCompletionMessageToolCallChunk.type) &&
        Objects.equals(this.function, chatCompletionMessageToolCallChunk.function);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, id, type, function);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionMessageToolCallChunk {\n");
    
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

