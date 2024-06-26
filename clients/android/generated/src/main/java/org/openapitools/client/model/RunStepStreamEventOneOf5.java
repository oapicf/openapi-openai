/**
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

package org.openapitools.client.model;

import org.openapitools.client.model.RunStepObject;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Occurs when a [run step](/docs/api-reference/runs/step-object) is cancelled.
 **/
@ApiModel(description = "Occurs when a [run step](/docs/api-reference/runs/step-object) is cancelled.")
public class RunStepStreamEventOneOf5 {
  
  public enum EventEnum {
     thread.run.step.cancelled, 
  };
  @SerializedName("event")
  private EventEnum event = null;
  @SerializedName("data")
  private RunStepObject data = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public EventEnum getEvent() {
    return event;
  }
  public void setEvent(EventEnum event) {
    this.event = event;
  }

  /**
   **/
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
    RunStepStreamEventOneOf5 runStepStreamEventOneOf5 = (RunStepStreamEventOneOf5) o;
    return (this.event == null ? runStepStreamEventOneOf5.event == null : this.event.equals(runStepStreamEventOneOf5.event)) &&
        (this.data == null ? runStepStreamEventOneOf5.data == null : this.data.equals(runStepStreamEventOneOf5.data));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.event == null ? 0: this.event.hashCode());
    result = 31 * result + (this.data == null ? 0: this.data.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepStreamEventOneOf5 {\n");
    
    sb.append("  event: ").append(event).append("\n");
    sb.append("  data: ").append(data).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
