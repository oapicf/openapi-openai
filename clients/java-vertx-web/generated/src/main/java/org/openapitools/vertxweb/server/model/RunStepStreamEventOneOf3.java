package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.RunStepObject;

/**
 * Occurs when a [run step](/docs/api-reference/runs/step-object) is completed.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RunStepStreamEventOneOf3   {
  


  public enum EventEnum {
    THREAD_RUN_STEP_COMPLETED("thread.run.step.completed");

    private String value;

    EventEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private EventEnum event;
  private RunStepObject data;

  public RunStepStreamEventOneOf3 () {

  }

  public RunStepStreamEventOneOf3 (EventEnum event, RunStepObject data) {
    this.event = event;
    this.data = data;
  }

    
  @JsonProperty("event")
  public EventEnum getEvent() {
    return event;
  }
  public void setEvent(EventEnum event) {
    this.event = event;
  }

    
  @JsonProperty("data")
  public RunStepObject getData() {
    return data;
  }
  public void setData(RunStepObject data) {
    this.data = data;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunStepStreamEventOneOf3 runStepStreamEventOneOf3 = (RunStepStreamEventOneOf3) o;
    return Objects.equals(event, runStepStreamEventOneOf3.event) &&
        Objects.equals(data, runStepStreamEventOneOf3.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepStreamEventOneOf3 {\n");
    
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
