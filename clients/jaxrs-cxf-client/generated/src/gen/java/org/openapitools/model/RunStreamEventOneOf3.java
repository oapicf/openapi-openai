package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.RunObject;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Occurs when a [run](/docs/api-reference/runs/object) moves to a `requires_action` status.
 **/
@ApiModel(description="Occurs when a [run](/docs/api-reference/runs/object) moves to a `requires_action` status.")

public class RunStreamEventOneOf3  {
  
public enum EventEnum {

THREAD_RUN_REQUIRES_ACTION(String.valueOf("thread.run.requires_action"));


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
  private RunObject data;
 /**
   * Get event
   * @return event
  **/
  @JsonProperty("event")
  public String getEvent() {
    if (event == null) {
      return null;
    }
    return event.value();
  }

  public void setEvent(EventEnum event) {
    this.event = event;
  }

  public RunStreamEventOneOf3 event(EventEnum event) {
    this.event = event;
    return this;
  }

 /**
   * Get data
   * @return data
  **/
  @JsonProperty("data")
  public RunObject getData() {
    return data;
  }

  public void setData(RunObject data) {
    this.data = data;
  }

  public RunStreamEventOneOf3 data(RunObject data) {
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
    RunStreamEventOneOf3 runStreamEventOneOf3 = (RunStreamEventOneOf3) o;
    return Objects.equals(this.event, runStreamEventOneOf3.event) &&
        Objects.equals(this.data, runStreamEventOneOf3.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStreamEventOneOf3 {\n");
    
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

