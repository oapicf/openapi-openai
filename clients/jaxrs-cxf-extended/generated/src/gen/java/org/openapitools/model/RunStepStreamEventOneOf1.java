package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.RunStepObject;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Occurs when a [run step](/docs/api-reference/runs/step-object) moves to an `in_progress` state.
 */
@ApiModel(description="Occurs when a [run step](/docs/api-reference/runs/step-object) moves to an `in_progress` state.")

public class RunStepStreamEventOneOf1  {
  
public enum EventEnum {

    @JsonProperty("thread.run.step.in_progress") THREAD_RUN_STEP_IN_PROGRESS(String.valueOf("thread.run.step.in_progress"));

    private String value;

    EventEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static EventEnum fromValue(String value) {
        for (EventEnum b : EventEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(required = true, value = "")
  private EventEnum event;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private RunStepObject data;
 /**
  * Get event
  * @return event
  */
  @JsonProperty("event")
  @NotNull
  public String getEvent() {
    return event == null ? null : event.value();
  }

  /**
   * Sets the <code>event</code> property.
   */
 public void setEvent(EventEnum event) {
    this.event = event;
  }

  /**
   * Sets the <code>event</code> property.
   */
  public RunStepStreamEventOneOf1 event(EventEnum event) {
    this.event = event;
    return this;
  }

 /**
  * Get data
  * @return data
  */
  @JsonProperty("data")
  @NotNull
  public RunStepObject getData() {
    return data;
  }

  /**
   * Sets the <code>data</code> property.
   */
 public void setData(RunStepObject data) {
    this.data = data;
  }

  /**
   * Sets the <code>data</code> property.
   */
  public RunStepStreamEventOneOf1 data(RunStepObject data) {
    this.data = data;
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
    RunStepStreamEventOneOf1 runStepStreamEventOneOf1 = (RunStepStreamEventOneOf1) o;
    return Objects.equals(this.event, runStepStreamEventOneOf1.event) &&
        Objects.equals(this.data, runStepStreamEventOneOf1.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepStreamEventOneOf1 {\n");
    
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

