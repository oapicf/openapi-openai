package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.ChatCompletionNamedToolChoiceFunction;

/**
 * Specifies a tool the model should use. Use to force the model to call a specific tool.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AssistantsApiNamedToolChoice   {
  


  public enum TypeEnum {
    FUNCTION("function"),
    CODE_INTERPRETER("code_interpreter"),
    RETRIEVAL("retrieval");

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

  public AssistantsApiNamedToolChoice () {

  }

  public AssistantsApiNamedToolChoice (TypeEnum type, ChatCompletionNamedToolChoiceFunction function) {
    this.type = type;
    this.function = function;
  }

    
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

    
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
    AssistantsApiNamedToolChoice assistantsApiNamedToolChoice = (AssistantsApiNamedToolChoice) o;
    return Objects.equals(type, assistantsApiNamedToolChoice.type) &&
        Objects.equals(function, assistantsApiNamedToolChoice.function);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, function);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssistantsApiNamedToolChoice {\n");
    
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
