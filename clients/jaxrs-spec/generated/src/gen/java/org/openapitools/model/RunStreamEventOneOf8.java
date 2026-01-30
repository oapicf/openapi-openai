package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RunObject;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Occurs when a [run](/docs/api-reference/runs/object) is cancelled.
 **/
@ApiModel(description = "Occurs when a [run](/docs/api-reference/runs/object) is cancelled.")
@JsonTypeName("RunStreamEvent_oneOf_8")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RunStreamEventOneOf8   {
  public enum EventEnum {

    THREAD_RUN_CANCELLED(String.valueOf("thread.run.cancelled"));


    private String value;

    EventEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static EventEnum fromString(String s) {
        for (EventEnum b : EventEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
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

  public RunStreamEventOneOf8() {
  }

  @JsonCreator
  public RunStreamEventOneOf8(
    @JsonProperty(required = true, value = "event") EventEnum event,
    @JsonProperty(required = true, value = "data") RunObject data
  ) {
    this.event = event;
    this.data = data;
  }

  /**
   **/
  public RunStreamEventOneOf8 event(EventEnum event) {
    this.event = event;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "event")
  @NotNull public EventEnum getEvent() {
    return event;
  }

  @JsonProperty(required = true, value = "event")
  public void setEvent(EventEnum event) {
    this.event = event;
  }

  /**
   **/
  public RunStreamEventOneOf8 data(RunObject data) {
    this.data = data;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "data")
  @NotNull @Valid public RunObject getData() {
    return data;
  }

  @JsonProperty(required = true, value = "data")
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
    RunStreamEventOneOf8 runStreamEventOneOf8 = (RunStreamEventOneOf8) o;
    return Objects.equals(this.event, runStreamEventOneOf8.event) &&
        Objects.equals(this.data, runStreamEventOneOf8.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStreamEventOneOf8 {\n");
    
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

