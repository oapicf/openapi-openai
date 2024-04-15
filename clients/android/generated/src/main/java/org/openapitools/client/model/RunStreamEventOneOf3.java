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

import org.openapitools.client.model.RunObject;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Occurs when a [run](/docs/api-reference/runs/object) moves to a &#x60;requires_action&#x60; status.
 **/
@ApiModel(description = "Occurs when a [run](/docs/api-reference/runs/object) moves to a `requires_action` status.")
public class RunStreamEventOneOf3 {
  
  public enum EventEnum {
     thread.run.requires_action, 
  };
  @SerializedName("event")
  private EventEnum event = null;
  @SerializedName("data")
  private RunObject data = null;

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
    RunStreamEventOneOf3 runStreamEventOneOf3 = (RunStreamEventOneOf3) o;
    return (this.event == null ? runStreamEventOneOf3.event == null : this.event.equals(runStreamEventOneOf3.event)) &&
        (this.data == null ? runStreamEventOneOf3.data == null : this.data.equals(runStreamEventOneOf3.data));
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
    sb.append("class RunStreamEventOneOf3 {\n");
    
    sb.append("  event: ").append(event).append("\n");
    sb.append("  data: ").append(data).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}