package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * The Code Interpreter tool call definition.
 */

@Schema(name = "RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter", description = "The Code Interpreter tool call definition.")
@JsonTypeName("RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-26T05:22:24.124939009Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String input;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Valid RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner> outputs = new ArrayList<>();

  public RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter input(@Nullable String input) {
    this.input = input;
    return this;
  }

  /**
   * The input to the Code Interpreter tool call.
   * @return input
   */
  
  @Schema(name = "input", description = "The input to the Code Interpreter tool call.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("input")
  public @Nullable String getInput() {
    return input;
  }

  @JsonProperty("input")
  public void setInput(@Nullable String input) {
    this.input = input;
  }

  public RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter outputs(List<@Valid RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner> outputs) {
    this.outputs = outputs;
    return this;
  }

  public RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter addOutputsItem(RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner outputsItem) {
    if (this.outputs == null) {
      this.outputs = new ArrayList<>();
    }
    this.outputs.add(outputsItem);
    return this;
  }

  /**
   * The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (`logs`) or images (`image`). Each of these are represented by a different object type.
   * @return outputs
   */
  @Valid 
  @Schema(name = "outputs", description = "The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (`logs`) or images (`image`). Each of these are represented by a different object type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("outputs")
  public List<@Valid RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner> getOutputs() {
    return outputs;
  }

  @JsonProperty("outputs")
  public void setOutputs(List<@Valid RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner> outputs) {
    this.outputs = outputs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter = (RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter) o;
    return Objects.equals(this.input, runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter.input) &&
        Objects.equals(this.outputs, runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter.outputs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(input, outputs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter {\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

