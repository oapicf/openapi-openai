package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.api.model.RunObject;
import org.openapitools.server.api.model.RunStreamEventOneOf;
import org.openapitools.server.api.model.RunStreamEventOneOf1;
import org.openapitools.server.api.model.RunStreamEventOneOf2;
import org.openapitools.server.api.model.RunStreamEventOneOf3;
import org.openapitools.server.api.model.RunStreamEventOneOf4;
import org.openapitools.server.api.model.RunStreamEventOneOf5;
import org.openapitools.server.api.model.RunStreamEventOneOf6;
import org.openapitools.server.api.model.RunStreamEventOneOf7;
import org.openapitools.server.api.model.RunStreamEventOneOf8;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RunStreamEvent   {
  


  public enum EventEnum {
    THREAD_RUN_EXPIRED("thread.run.expired");

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

  public RunStreamEvent () {

  }

  public RunStreamEvent (EventEnum event, RunObject data) {
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
    RunStreamEvent runStreamEvent = (RunStreamEvent) o;
    return Objects.equals(event, runStreamEvent.event) &&
        Objects.equals(data, runStreamEvent.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStreamEvent {\n");
    
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
