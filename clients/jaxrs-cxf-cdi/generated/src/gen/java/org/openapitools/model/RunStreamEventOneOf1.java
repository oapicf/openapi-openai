package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RunObject;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Occurs when a [run](/docs/api-reference/runs/object) moves to a &#x60;queued&#x60; status.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Occurs when a [run](/docs/api-reference/runs/object) moves to a `queued` status.")
public class RunStreamEventOneOf1   {
  

public enum EventEnum {

    @JsonProperty("thread.run.queued") THREAD_RUN_QUEUED(String.valueOf("thread.run.queued"));


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

  private RunObject data;

  /**
   **/
  public RunStreamEventOneOf1 event(EventEnum event) {
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
  public RunStreamEventOneOf1 data(RunObject data) {
    this.data = data;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("data")
  @NotNull
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
    RunStreamEventOneOf1 runStreamEventOneOf1 = (RunStreamEventOneOf1) o;
    return Objects.equals(this.event, runStreamEventOneOf1.event) &&
        Objects.equals(this.data, runStreamEventOneOf1.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStreamEventOneOf1 {\n");
    
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

