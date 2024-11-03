package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.api.model.RunStepDeltaStepDetailsToolCallsCodeObject;
import org.openapitools.server.api.model.RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter;
import org.openapitools.server.api.model.RunStepDeltaStepDetailsToolCallsFunctionObject;
import org.openapitools.server.api.model.RunStepDeltaStepDetailsToolCallsFunctionObjectFunction;
import org.openapitools.server.api.model.RunStepDeltaStepDetailsToolCallsRetrievalObject;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RunStepDeltaStepDetailsToolCallsObjectToolCallsInner   {
  
  private Integer index;
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
  private RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter codeInterpreter;
  private Object retrieval;
  private RunStepDeltaStepDetailsToolCallsFunctionObjectFunction function;

  public RunStepDeltaStepDetailsToolCallsObjectToolCallsInner () {

  }

  public RunStepDeltaStepDetailsToolCallsObjectToolCallsInner (Integer index, String id, TypeEnum type, RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter codeInterpreter, Object retrieval, RunStepDeltaStepDetailsToolCallsFunctionObjectFunction function) {
    this.index = index;
    this.id = id;
    this.type = type;
    this.codeInterpreter = codeInterpreter;
    this.retrieval = retrieval;
    this.function = function;
  }

    
  @JsonProperty("index")
  public Integer getIndex() {
    return index;
  }
  public void setIndex(Integer index) {
    this.index = index;
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
  public RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter getCodeInterpreter() {
    return codeInterpreter;
  }
  public void setCodeInterpreter(RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter codeInterpreter) {
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
  public RunStepDeltaStepDetailsToolCallsFunctionObjectFunction getFunction() {
    return function;
  }
  public void setFunction(RunStepDeltaStepDetailsToolCallsFunctionObjectFunction function) {
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
    RunStepDeltaStepDetailsToolCallsObjectToolCallsInner runStepDeltaStepDetailsToolCallsObjectToolCallsInner = (RunStepDeltaStepDetailsToolCallsObjectToolCallsInner) o;
    return Objects.equals(index, runStepDeltaStepDetailsToolCallsObjectToolCallsInner.index) &&
        Objects.equals(id, runStepDeltaStepDetailsToolCallsObjectToolCallsInner.id) &&
        Objects.equals(type, runStepDeltaStepDetailsToolCallsObjectToolCallsInner.type) &&
        Objects.equals(codeInterpreter, runStepDeltaStepDetailsToolCallsObjectToolCallsInner.codeInterpreter) &&
        Objects.equals(retrieval, runStepDeltaStepDetailsToolCallsObjectToolCallsInner.retrieval) &&
        Objects.equals(function, runStepDeltaStepDetailsToolCallsObjectToolCallsInner.function);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, id, type, codeInterpreter, retrieval, function);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepDeltaStepDetailsToolCallsObjectToolCallsInner {\n");
    
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
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
