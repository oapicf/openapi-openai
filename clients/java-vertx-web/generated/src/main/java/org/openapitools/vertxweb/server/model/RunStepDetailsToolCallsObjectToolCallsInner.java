package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.RunStepDetailsToolCallsCodeObject;
import org.openapitools.vertxweb.server.model.RunStepDetailsToolCallsCodeObjectCodeInterpreter;
import org.openapitools.vertxweb.server.model.RunStepDetailsToolCallsFunctionObject;
import org.openapitools.vertxweb.server.model.RunStepDetailsToolCallsFunctionObjectFunction;
import org.openapitools.vertxweb.server.model.RunStepDetailsToolCallsRetrievalObject;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RunStepDetailsToolCallsObjectToolCallsInner   {
  
  private String id;


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
  private RunStepDetailsToolCallsCodeObjectCodeInterpreter codeInterpreter;
  private Object retrieval;
  private RunStepDetailsToolCallsFunctionObjectFunction function;

  public RunStepDetailsToolCallsObjectToolCallsInner () {

  }

  public RunStepDetailsToolCallsObjectToolCallsInner (String id, TypeEnum type, RunStepDetailsToolCallsCodeObjectCodeInterpreter codeInterpreter, Object retrieval, RunStepDetailsToolCallsFunctionObjectFunction function) {
    this.id = id;
    this.type = type;
    this.codeInterpreter = codeInterpreter;
    this.retrieval = retrieval;
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

    
  @JsonProperty("code_interpreter")
  public RunStepDetailsToolCallsCodeObjectCodeInterpreter getCodeInterpreter() {
    return codeInterpreter;
  }
  public void setCodeInterpreter(RunStepDetailsToolCallsCodeObjectCodeInterpreter codeInterpreter) {
    this.codeInterpreter = codeInterpreter;
  }

    
  @JsonProperty("retrieval")
  public Object getRetrieval() {
    return retrieval;
  }
  public void setRetrieval(Object retrieval) {
    this.retrieval = retrieval;
  }

    
  @JsonProperty("function")
  public RunStepDetailsToolCallsFunctionObjectFunction getFunction() {
    return function;
  }
  public void setFunction(RunStepDetailsToolCallsFunctionObjectFunction function) {
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
    RunStepDetailsToolCallsObjectToolCallsInner runStepDetailsToolCallsObjectToolCallsInner = (RunStepDetailsToolCallsObjectToolCallsInner) o;
    return Objects.equals(id, runStepDetailsToolCallsObjectToolCallsInner.id) &&
        Objects.equals(type, runStepDetailsToolCallsObjectToolCallsInner.type) &&
        Objects.equals(codeInterpreter, runStepDetailsToolCallsObjectToolCallsInner.codeInterpreter) &&
        Objects.equals(retrieval, runStepDetailsToolCallsObjectToolCallsInner.retrieval) &&
        Objects.equals(function, runStepDetailsToolCallsObjectToolCallsInner.function);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, codeInterpreter, retrieval, function);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepDetailsToolCallsObjectToolCallsInner {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    codeInterpreter: ").append(toIndentedString(codeInterpreter)).append("\n");
    sb.append("    retrieval: ").append(toIndentedString(retrieval)).append("\n");
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
