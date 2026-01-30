package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.RunStepObject;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Occurs when a [run step](/docs/api-reference/run-steps/step-object) moves to an &#x60;in_progress&#x60; state.
 */

@Schema(name = "RunStepStreamEvent_oneOf_1", description = "Occurs when a [run step](/docs/api-reference/run-steps/step-object) moves to an `in_progress` state.")
@JsonTypeName("RunStepStreamEvent_oneOf_1")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RunStepStreamEventOneOf1 implements RunStepStreamEvent {

  /**
   * Gets or Sets event
   */
  public enum EventEnum {
    THREAD_RUN_STEP_IN_PROGRESS("thread.run.step.in_progress");

    private final String value;

    EventEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
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

  private RunStepObject data;

  public RunStepStreamEventOneOf1() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RunStepStreamEventOneOf1(EventEnum event, RunStepObject data) {
    this.event = event;
    this.data = data;
  }

  public RunStepStreamEventOneOf1 event(EventEnum event) {
    this.event = event;
    return this;
  }

  /**
   * Get event
   * @return event
   */
  @NotNull 
  @Schema(name = "event", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("event")
  public EventEnum getEvent() {
    return event;
  }

  public void setEvent(EventEnum event) {
    this.event = event;
  }

  public RunStepStreamEventOneOf1 data(RunStepObject data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
   */
  @NotNull @Valid 
  @Schema(name = "data", requiredMode = Schema.RequiredMode.REQUIRED)
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

