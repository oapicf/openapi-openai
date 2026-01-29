package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Text output from the Code Interpreter tool call as part of a run step.
 */

@Schema(name = "RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject", description = "Text output from the Code Interpreter tool call as part of a run step.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T10:45:13.353144236Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject implements RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner {

  private Integer index;

  /**
   * Always `logs`.
   */
  public enum TypeEnum {
    LOGS("logs");

    private final String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypeEnum type;

  private String logs;

  public RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject(Integer index, TypeEnum type) {
    this.index = index;
    this.type = type;
  }

  public RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject index(Integer index) {
    this.index = index;
    return this;
  }

  /**
   * The index of the output in the outputs array.
   * @return index
   */
  @NotNull 
  @Schema(name = "index", description = "The index of the output in the outputs array.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("index")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Always `logs`.
   * @return type
   */
  @NotNull 
  @Schema(name = "type", description = "Always `logs`.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject logs(String logs) {
    this.logs = logs;
    return this;
  }

  /**
   * The text output from the Code Interpreter tool call.
   * @return logs
   */
  
  @Schema(name = "logs", description = "The text output from the Code Interpreter tool call.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("logs")
  public String getLogs() {
    return logs;
  }

  public void setLogs(String logs) {
    this.logs = logs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject runStepDeltaStepDetailsToolCallsCodeOutputLogsObject = (RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject) o;
    return Objects.equals(this.index, runStepDeltaStepDetailsToolCallsCodeOutputLogsObject.index) &&
        Objects.equals(this.type, runStepDeltaStepDetailsToolCallsCodeOutputLogsObject.type) &&
        Objects.equals(this.logs, runStepDeltaStepDetailsToolCallsCodeOutputLogsObject.logs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, type, logs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject {\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
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

