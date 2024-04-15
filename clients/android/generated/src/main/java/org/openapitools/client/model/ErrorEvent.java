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

import org.openapitools.client.model.Error;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Occurs when an [error](/docs/guides/error-codes/api-errors) occurs. This can happen due to an internal server error or a timeout.
 **/
@ApiModel(description = "Occurs when an [error](/docs/guides/error-codes/api-errors) occurs. This can happen due to an internal server error or a timeout.")
public class ErrorEvent {
  
  public enum EventEnum {
     error, 
  };
  @SerializedName("event")
  private EventEnum event = null;
  @SerializedName("data")
  private Error data = null;

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
  public Error getData() {
    return data;
  }
  public void setData(Error data) {
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
    ErrorEvent errorEvent = (ErrorEvent) o;
    return (this.event == null ? errorEvent.event == null : this.event.equals(errorEvent.event)) &&
        (this.data == null ? errorEvent.data == null : this.data.equals(errorEvent.data));
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
    sb.append("class ErrorEvent {\n");
    
    sb.append("  event: ").append(event).append("\n");
    sb.append("  data: ").append(data).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}