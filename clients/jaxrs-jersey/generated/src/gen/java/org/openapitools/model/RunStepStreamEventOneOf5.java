/*
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RunStepObject;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Occurs when a [run step](/docs/api-reference/runs/step-object) is cancelled.
 */
@ApiModel(description = "Occurs when a [run step](/docs/api-reference/runs/step-object) is cancelled.")
@JsonPropertyOrder({
  RunStepStreamEventOneOf5.JSON_PROPERTY_EVENT,
  RunStepStreamEventOneOf5.JSON_PROPERTY_DATA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-04-14T13:41:38.036864137Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class RunStepStreamEventOneOf5   {
  /**
   * Gets or Sets event
   */
  public enum EventEnum {
    THREAD_RUN_STEP_CANCELLED("thread.run.step.cancelled");

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
    public static EventEnum fromValue(String value) {
      for (EventEnum b : EventEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_EVENT = "event";
  @JsonProperty(JSON_PROPERTY_EVENT)
  private EventEnum event;

  public static final String JSON_PROPERTY_DATA = "data";
  @JsonProperty(JSON_PROPERTY_DATA)
  private RunStepObject data;

  public RunStepStreamEventOneOf5 event(EventEnum event) {
    this.event = event;
    return this;
  }

  /**
   * Get event
   * @return event
   **/
  @JsonProperty(value = "event")
  @ApiModelProperty(required = true, value = "")
  @NotNull 
  public EventEnum getEvent() {
    return event;
  }

  public void setEvent(EventEnum event) {
    this.event = event;
  }

  public RunStepStreamEventOneOf5 data(RunStepObject data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
   **/
  @JsonProperty(value = "data")
  @ApiModelProperty(required = true, value = "")
  @NotNull @Valid 
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
    RunStepStreamEventOneOf5 runStepStreamEventOneOf5 = (RunStepStreamEventOneOf5) o;
    return Objects.equals(this.event, runStepStreamEventOneOf5.event) &&
        Objects.equals(this.data, runStepStreamEventOneOf5.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepStreamEventOneOf5 {\n");
    
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

