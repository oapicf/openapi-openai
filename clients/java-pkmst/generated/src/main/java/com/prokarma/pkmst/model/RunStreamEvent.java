package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.RunObject;
import com.prokarma.pkmst.model.RunStreamEventOneOf;
import com.prokarma.pkmst.model.RunStreamEventOneOf1;
import com.prokarma.pkmst.model.RunStreamEventOneOf2;
import com.prokarma.pkmst.model.RunStreamEventOneOf3;
import com.prokarma.pkmst.model.RunStreamEventOneOf4;
import com.prokarma.pkmst.model.RunStreamEventOneOf5;
import com.prokarma.pkmst.model.RunStreamEventOneOf6;
import com.prokarma.pkmst.model.RunStreamEventOneOf7;
import com.prokarma.pkmst.model.RunStreamEventOneOf8;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * RunStreamEvent
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-03T11:07:18.723034005Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class RunStreamEvent   {
  /**
   * Gets or Sets event
   */
  public enum EventEnum {
    THREAD_RUN_EXPIRED("thread.run.expired");

    private String value;

    EventEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EventEnum fromValue(String text) {
      for (EventEnum b : EventEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("event")
  private EventEnum event;

  @JsonProperty("data")
  private RunObject data;

  public RunStreamEvent event(EventEnum event) {
    this.event = event;
    return this;
  }

  /**
   * Get event
   * @return event
   */
  @ApiModelProperty(required = true, value = "")
  public EventEnum getEvent() {
    return event;
  }

  public void setEvent(EventEnum event) {
    this.event = event;
  }

  public RunStreamEvent data(RunObject data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
   */
  @ApiModelProperty(required = true, value = "")
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
    return Objects.equals(this.event, runStreamEvent.event) &&
        Objects.equals(this.data, runStreamEvent.data);
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

