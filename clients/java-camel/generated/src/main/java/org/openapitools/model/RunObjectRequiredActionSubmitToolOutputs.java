package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.RunToolCallObject;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details on the tool outputs needed for this run to continue.
 */

@Schema(name = "RunObject_required_action_submit_tool_outputs", description = "Details on the tool outputs needed for this run to continue.")
@JsonTypeName("RunObject_required_action_submit_tool_outputs")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-04-14T13:40:33.442815767Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class RunObjectRequiredActionSubmitToolOutputs {

  @Valid
  private List<@Valid RunToolCallObject> toolCalls = new ArrayList<>();

  public RunObjectRequiredActionSubmitToolOutputs() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RunObjectRequiredActionSubmitToolOutputs(List<@Valid RunToolCallObject> toolCalls) {
    this.toolCalls = toolCalls;
  }

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
  */
  @NotNull @Valid 
  @Schema(name = "tool_calls", description = "A list of the relevant tool calls.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("tool_calls")
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

