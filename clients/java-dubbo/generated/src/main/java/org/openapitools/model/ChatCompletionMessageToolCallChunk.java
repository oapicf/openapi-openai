package org.openapitools.model;

import org.openapitools.model.ChatCompletionMessageToolCallChunkFunction;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ChatCompletionMessageToolCallChunk implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("index")
  private Integer index;

  /**
   * The ID of the tool call.
   */
  @JsonProperty("id")
  private String id;

  /**
   * The type of the tool. Currently, only &#x60;function&#x60; is supported.
   */
  @JsonProperty("type")
  private String type;

  @JsonProperty("function")
  private ChatCompletionMessageToolCallChunkFunction function;

  /**
   * 
   * @return index
   */
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  /**
   * The ID of the tool call.
   * @return id
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The type of the tool. Currently, only &#x60;function&#x60; is supported.
   * @return type
   */
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * 
   * @return function
   */
  public ChatCompletionMessageToolCallChunkFunction getFunction() {
    return function;
  }

  public void setFunction(ChatCompletionMessageToolCallChunkFunction function) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
