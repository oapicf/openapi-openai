package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.RunStepObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Occurs when a [run step](/docs/api-reference/runs/step-object) fails.
 */
@ApiModel(description = "Occurs when a [run step](/docs/api-reference/runs/step-object) fails.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-03T11:07:18.723034005Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class RunStepStreamEventOneOf4   {
  /**
   * Gets or Sets event
   */
  public enum EventEnum {
    THREAD_RUN_STEP_FAILED("thread.run.step.failed");

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
  private RunStepObject data;

  public RunStepStreamEventOneOf4 event(EventEnum event) {
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

  public RunStepStreamEventOneOf4 data(RunStepObject data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
   */
  @ApiModelProperty(required = true, value = "")
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
    RunStepStreamEventOneOf4 runStepStreamEventOneOf4 = (RunStepStreamEventOneOf4) o;
    return Objects.equals(this.event, runStepStreamEventOneOf4.event) &&
        Objects.equals(this.data, runStepStreamEventOneOf4.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepStreamEventOneOf4 {\n");
    
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

