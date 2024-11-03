package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.RunObject;

/**
 * Occurs when a [run](/docs/api-reference/runs/object) is completed.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RunStreamEventOneOf4   {
  


  public enum EventEnum {
    THREAD_RUN_COMPLETED("thread.run.completed");

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
  private RunObject data;

  public RunStreamEventOneOf4 () {

  }

  public RunStreamEventOneOf4 (EventEnum event, RunObject data) {
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
  public RunObject getData() {
    return data;
  }
  public void setData(RunObject data) {
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
    RunStreamEventOneOf4 runStreamEventOneOf4 = (RunStreamEventOneOf4) o;
    return Objects.equals(event, runStreamEventOneOf4.event) &&
        Objects.equals(data, runStreamEventOneOf4.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStreamEventOneOf4 {\n");
    
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
