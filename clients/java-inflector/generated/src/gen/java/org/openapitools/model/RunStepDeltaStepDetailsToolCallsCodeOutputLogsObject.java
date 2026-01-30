package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Text output from the Code Interpreter tool call as part of a run step.
 **/

@ApiModel(description = "Text output from the Code Interpreter tool call as part of a run step.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-01-29T14:07:47.634062747Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject   {
  @JsonProperty("index")
  private Integer index;

  /**
   * Always `logs`.
   */
  public enum TypeEnum {
    LOGS("logs");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("type")
  private TypeEnum type;

  @JsonProperty("logs")
  private String logs;

  /**
   * The index of the output in the outputs array.
   **/
  public RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject index(Integer index) {
    this.index = index;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The index of the output in the outputs array.")
  @JsonProperty("index")
  public Integer getIndex() {
    return index;
  }
  public void setIndex(Integer index) {
    this.index = index;
  }

  /**
   * Always `logs`.
   **/
  public RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Always `logs`.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * The text output from the Code Interpreter tool call.
   **/
  public RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject logs(String logs) {
    this.logs = logs;
    return this;
  }

  
  @ApiModelProperty(value = "The text output from the Code Interpreter tool call.")
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
    return Objects.equals(index, runStepDeltaStepDetailsToolCallsCodeOutputLogsObject.index) &&
        Objects.equals(type, runStepDeltaStepDetailsToolCallsCodeOutputLogsObject.type) &&
        Objects.equals(logs, runStepDeltaStepDetailsToolCallsCodeOutputLogsObject.logs);
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

