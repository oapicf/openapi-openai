package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.RunToolCallObject;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Details on the tool outputs needed for this run to continue.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Details on the tool outputs needed for this run to continue.")
public class RunObjectRequiredActionSubmitToolOutputs   {
  
  private List<@Valid RunToolCallObject> toolCalls = new ArrayList<>();

  /**
   * A list of the relevant tool calls.
   **/
  public RunObjectRequiredActionSubmitToolOutputs toolCalls(List<@Valid RunToolCallObject> toolCalls) {
    this.toolCalls = toolCalls;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of the relevant tool calls.")
  @JsonProperty("tool_calls")
  @NotNull
  public List<@Valid RunToolCallObject> getToolCalls() {
    return toolCalls;
  }
  public void setToolCalls(List<@Valid RunToolCallObject> toolCalls) {
    this.toolCalls = toolCalls;
  }

  public RunObjectRequiredActionSubmitToolOutputs addToolCallsItem(RunToolCallObject toolCallsItem) {
    if (this.toolCalls == null) {
      this.toolCalls = new ArrayList<>();
    }
    this.toolCalls.add(toolCallsItem);
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
    RunObjectRequiredActionSubmitToolOutputs runObjectRequiredActionSubmitToolOutputs = (RunObjectRequiredActionSubmitToolOutputs) o;
    return Objects.equals(this.toolCalls, runObjectRequiredActionSubmitToolOutputs.toolCalls);
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

