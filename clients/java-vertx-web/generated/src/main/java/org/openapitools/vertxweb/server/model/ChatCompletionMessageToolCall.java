package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.ChatCompletionMessageToolCallFunction;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChatCompletionMessageToolCall   {
  
  private String id;


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
  private ChatCompletionMessageToolCallFunction function;

  public ChatCompletionMessageToolCall () {

  }

  public ChatCompletionMessageToolCall (String id, TypeEnum type, ChatCompletionMessageToolCallFunction function) {
    this.id = id;
    this.type = type;
    this.function = function;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

    
  @JsonProperty("function")
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
    return Objects.equals(id, chatCompletionMessageToolCall.id) &&
        Objects.equals(type, chatCompletionMessageToolCall.type) &&
        Objects.equals(function, chatCompletionMessageToolCall.function);
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
