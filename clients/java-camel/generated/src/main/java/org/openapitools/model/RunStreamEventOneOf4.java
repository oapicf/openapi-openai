package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.RunObject;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Occurs when a [run](/docs/api-reference/runs/object) is completed.
 */

@Schema(name = "RunStreamEvent_oneOf_4", description = "Occurs when a [run](/docs/api-reference/runs/object) is completed.")
@JsonTypeName("RunStreamEvent_oneOf_4")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-11-03T11:08:01.261160233Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class RunStreamEventOneOf4 implements RunStreamEvent {

  /**
   * Gets or Sets event
   */
  public enum EventEnum {
    THREAD_RUN_COMPLETED("thread.run.completed");

    private String value;

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

  private RunObject data;

  public RunStreamEventOneOf4() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RunStreamEventOneOf4(EventEnum event, RunObject data) {
    this.event = event;
    this.data = data;
  }

  public RunStreamEventOneOf4 event(EventEnum event) {
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

  public RunStreamEventOneOf4 data(RunObject data) {
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
    return Objects.equals(this.event, runStreamEventOneOf4.event) &&
        Objects.equals(this.data, runStreamEventOneOf4.data);
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

