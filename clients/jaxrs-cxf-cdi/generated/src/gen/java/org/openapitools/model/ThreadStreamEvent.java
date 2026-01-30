package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ThreadObject;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Occurs when a new [thread](/docs/api-reference/threads/object) is created.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Occurs when a new [thread](/docs/api-reference/threads/object) is created.")
public class ThreadStreamEvent   {
  
  private Boolean enabled;


public enum EventEnum {

    @JsonProperty("thread.created") THREAD_CREATED(String.valueOf("thread.created"));


    private String value;

    EventEnum(String v) {
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

  private EventEnum event;

  private ThreadObject data;

  /**
   * Whether to enable input audio transcription.
   **/
  public ThreadStreamEvent enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  
  @ApiModelProperty(value = "Whether to enable input audio transcription.")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  /**
   **/
  public ThreadStreamEvent event(EventEnum event) {
    this.event = event;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("event")
  @NotNull
  public EventEnum getEvent() {
    return event;
  }
  public void setEvent(EventEnum event) {
    this.event = event;
  }


  /**
   **/
  public ThreadStreamEvent data(ThreadObject data) {
    this.data = data;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("data")
  @NotNull
  public ThreadObject getData() {
    return data;
  }
  public void setData(ThreadObject data) {
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
    ThreadStreamEvent threadStreamEvent = (ThreadStreamEvent) o;
    return Objects.equals(this.enabled, threadStreamEvent.enabled) &&
        Objects.equals(this.event, threadStreamEvent.event) &&
        Objects.equals(this.data, threadStreamEvent.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, event, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThreadStreamEvent {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

