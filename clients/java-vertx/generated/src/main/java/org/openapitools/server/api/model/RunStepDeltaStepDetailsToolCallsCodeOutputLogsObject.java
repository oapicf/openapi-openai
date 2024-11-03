package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Text output from the Code Interpreter tool call as part of a run step.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject   {
  
  private Integer index;


  public enum TypeEnum {
    LOGS("logs");

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
  private String logs;

  public RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject () {

  }

  public RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject (Integer index, TypeEnum type, String logs) {
    this.index = index;
    this.type = type;
    this.logs = logs;
  }

    
  @JsonProperty("index")
  public Integer getIndex() {
    return index;
  }
  public void setIndex(Integer index) {
    this.index = index;
  }

    
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

    
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
