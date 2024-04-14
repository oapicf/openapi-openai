package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Text output from the Code Interpreter tool call as part of a run step.
 */
@ApiModel(description="Text output from the Code Interpreter tool call as part of a run step.")

public class RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject  {
  
 /**
  * The index of the output in the outputs array.
  */
  @ApiModelProperty(required = true, value = "The index of the output in the outputs array.")
  private Integer index;

public enum TypeEnum {

    @JsonProperty("logs") LOGS(String.valueOf("logs"));

    private String value;

    TypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
        for (TypeEnum b : TypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * Always `logs`.
  */
  @ApiModelProperty(required = true, value = "Always `logs`.")
  private TypeEnum type;

 /**
  * The text output from the Code Interpreter tool call.
  */
  @ApiModelProperty(value = "The text output from the Code Interpreter tool call.")
  private String logs;
 /**
  * The index of the output in the outputs array.
  * @return index
  */
  @JsonProperty("index")
  @NotNull
  public Integer getIndex() {
    return index;
  }

  /**
   * Sets the <code>index</code> property.
   */
 public void setIndex(Integer index) {
    this.index = index;
  }

  /**
   * Sets the <code>index</code> property.
   */
  public RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject index(Integer index) {
    this.index = index;
    return this;
  }

 /**
  * Always &#x60;logs&#x60;.
  * @return type
  */
  @JsonProperty("type")
  @NotNull
  public String getType() {
    return type == null ? null : type.value();
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
  * The text output from the Code Interpreter tool call.
  * @return logs
  */
  @JsonProperty("logs")
  public String getLogs() {
    return logs;
  }

  /**
   * Sets the <code>logs</code> property.
   */
 public void setLogs(String logs) {
    this.logs = logs;
  }

  /**
   * Sets the <code>logs</code> property.
   */
  public RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject logs(String logs) {
    this.logs = logs;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

