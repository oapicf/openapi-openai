package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.RunToolCallObject;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Details on the tool outputs needed for this run to continue.
 **/
@ApiModel(description = "Details on the tool outputs needed for this run to continue.")
@JsonTypeName("RunObject_required_action_submit_tool_outputs")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RunObjectRequiredActionSubmitToolOutputs   {
  private @Valid List<@Valid RunToolCallObject> toolCalls = new ArrayList<>();

  public RunObjectRequiredActionSubmitToolOutputs() {
  }

  @JsonCreator
  public RunObjectRequiredActionSubmitToolOutputs(
    @JsonProperty(required = true, value = "tool_calls") List<@Valid RunToolCallObject> toolCalls
  ) {
    this.toolCalls = toolCalls;
  }

  /**
   * A list of the relevant tool calls.
   **/
  public RunObjectRequiredActionSubmitToolOutputs toolCalls(List<@Valid RunToolCallObject> toolCalls) {
    this.toolCalls = toolCalls;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of the relevant tool calls.")
  @JsonProperty(required = true, value = "tool_calls")
  @NotNull @Valid public List<@Valid RunToolCallObject> getToolCalls() {
    return toolCalls;
  }

  @JsonProperty(required = true, value = "tool_calls")
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

  public RunObjectRequiredActionSubmitToolOutputs removeToolCallsItem(RunToolCallObject toolCallsItem) {
    if (toolCallsItem != null && this.toolCalls != null) {
      this.toolCalls.remove(toolCallsItem);
    }

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

