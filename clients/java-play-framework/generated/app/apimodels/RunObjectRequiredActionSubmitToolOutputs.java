package apimodels;

import apimodels.RunToolCallObject;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Details on the tool outputs needed for this run to continue.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-03T11:07:27.411323426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class RunObjectRequiredActionSubmitToolOutputs   {
  @JsonProperty("tool_calls")
  @NotNull
@Valid

  private List<@Valid RunToolCallObject> toolCalls = new ArrayList<>();

  public RunObjectRequiredActionSubmitToolOutputs toolCalls(List<@Valid RunToolCallObject> toolCalls) {
    this.toolCalls = toolCalls;
    return this;
  }

  public RunObjectRequiredActionSubmitToolOutputs addToolCallsItem(RunToolCallObject toolCallsItem) {
    if (this.toolCalls == null) {
      this.toolCalls = new ArrayList<>();
    }
    this.toolCalls.add(toolCallsItem);
    return this;
  }

   /**
   * A list of the relevant tool calls.
   * @return toolCalls
  **/
  public List<@Valid RunToolCallObject> getToolCalls() {
    return toolCalls;
  }

  public void setToolCalls(List<@Valid RunToolCallObject> toolCalls) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

