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

import org.openapitools.client.model.ThreadObject;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Occurs when a new [thread](/docs/api-reference/threads/object) is created.
 **/
@ApiModel(description = "Occurs when a new [thread](/docs/api-reference/threads/object) is created.")
public class ThreadStreamEventOneOf {
  
  public enum EventEnum {
     thread.created, 
  };
  @SerializedName("event")
  private EventEnum event = null;
  @SerializedName("data")
  private ThreadObject data = null;

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
    ThreadStreamEventOneOf threadStreamEventOneOf = (ThreadStreamEventOneOf) o;
    return (this.event == null ? threadStreamEventOneOf.event == null : this.event.equals(threadStreamEventOneOf.event)) &&
        (this.data == null ? threadStreamEventOneOf.data == null : this.data.equals(threadStreamEventOneOf.data));
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
    sb.append("class ThreadStreamEventOneOf {\n");
    
    sb.append("  event: ").append(event).append("\n");
    sb.append("  data: ").append(data).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}