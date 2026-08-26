package org.openapitools.model;

import org.openapitools.model.RunStepDetailsToolCallsCodeObjectCodeInterpreter;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Details of the Code Interpreter tool call the run step was involved in.
 */
public class RunStepDetailsToolCallsCodeObject implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The ID of the tool call.
   */
  @JsonProperty("id")
  private String id;

  /**
   * The type of tool call. This is always going to be &#x60;code_interpreter&#x60; for this type of tool call.
   */
  @JsonProperty("type")
  private String type;

  @JsonProperty("code_interpreter")
  private RunStepDetailsToolCallsCodeObjectCodeInterpreter codeInterpreter;

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
   * The type of tool call. This is always going to be &#x60;code_interpreter&#x60; for this type of tool call.
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
   * @return codeInterpreter
   */
  public RunStepDetailsToolCallsCodeObjectCodeInterpreter getCodeInterpreter() {
    return codeInterpreter;
  }

  public void setCodeInterpreter(RunStepDetailsToolCallsCodeObjectCodeInterpreter codeInterpreter) {
    this.codeInterpreter = codeInterpreter;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunStepDetailsToolCallsCodeObject runStepDetailsToolCallsCodeObject = (RunStepDetailsToolCallsCodeObject) o;
    return Objects.equals(this.id, runStepDetailsToolCallsCodeObject.id) &&
        Objects.equals(this.type, runStepDetailsToolCallsCodeObject.type) &&
        Objects.equals(this.codeInterpreter, runStepDetailsToolCallsCodeObject.codeInterpreter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, codeInterpreter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepDetailsToolCallsCodeObject {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    codeInterpreter: ").append(toIndentedString(codeInterpreter)).append("\n");
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
