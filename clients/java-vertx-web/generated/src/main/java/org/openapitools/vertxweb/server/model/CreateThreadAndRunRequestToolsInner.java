package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.AssistantToolsCode;
import org.openapitools.vertxweb.server.model.AssistantToolsFunction;
import org.openapitools.vertxweb.server.model.AssistantToolsRetrieval;
import org.openapitools.vertxweb.server.model.FunctionObject;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateThreadAndRunRequestToolsInner   {
  


  public enum TypeEnum {
    CODE_INTERPRETER("code_interpreter"),
    RETRIEVAL("retrieval"),
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
  private FunctionObject function;

  public CreateThreadAndRunRequestToolsInner () {

  }

  public CreateThreadAndRunRequestToolsInner (TypeEnum type, FunctionObject function) {
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
  public FunctionObject getFunction() {
    return function;
  }
  public void setFunction(FunctionObject function) {
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
    CreateThreadAndRunRequestToolsInner createThreadAndRunRequestToolsInner = (CreateThreadAndRunRequestToolsInner) o;
    return Objects.equals(type, createThreadAndRunRequestToolsInner.type) &&
        Objects.equals(function, createThreadAndRunRequestToolsInner.function);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, function);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateThreadAndRunRequestToolsInner {\n");
    
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
