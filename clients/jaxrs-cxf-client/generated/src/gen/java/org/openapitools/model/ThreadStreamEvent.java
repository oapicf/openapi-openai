package org.openapitools.model;

import org.openapitools.model.ThreadObject;
import org.openapitools.model.ThreadStreamEventOneOf;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ThreadStreamEvent  {
  
public enum EventEnum {

THREAD_CREATED(String.valueOf("thread.created"));


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
  private ThreadObject data;
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

  public ThreadStreamEvent event(EventEnum event) {
    this.event = event;
    return this;
  }

 /**
   * Get data
   * @return data
  **/
  @JsonProperty("data")
  public ThreadObject getData() {
    return data;
  }

  public void setData(ThreadObject data) {
    this.data = data;
  }

  public ThreadStreamEvent data(ThreadObject data) {
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
    ThreadStreamEvent threadStreamEvent = (ThreadStreamEvent) o;
    return Objects.equals(this.event, threadStreamEvent.event) &&
        Objects.equals(this.data, threadStreamEvent.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThreadStreamEvent {\n");
    
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

