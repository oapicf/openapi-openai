package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.RunToolCallObject;

/**
 * Details on the tool outputs needed for this run to continue.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RunObjectRequiredActionSubmitToolOutputs   {
  
  private List<RunToolCallObject> toolCalls = new ArrayList<>();

  public RunObjectRequiredActionSubmitToolOutputs () {

  }

  public RunObjectRequiredActionSubmitToolOutputs (List<RunToolCallObject> toolCalls) {
    this.toolCalls = toolCalls;
  }

    
  @JsonProperty("tool_calls")
  public List<RunToolCallObject> getToolCalls() {
    return toolCalls;
  }
  public void setToolCalls(List<RunToolCallObject> toolCalls) {
    this.toolCalls = toolCalls;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunObjectRequiredActionSubmitToolOutputs runObjectRequiredActionSubmitToolOutputs = (RunObjectRequiredActionSubmitToolOutputs) o;
    return Objects.equals(toolCalls, runObjectRequiredActionSubmitToolOutputs.toolCalls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toolCalls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunObjectRequiredActionSubmitToolOutputs {\n");
    
    sb.append("    toolCalls: ").append(toIndentedString(toolCalls)).append("\n");
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
