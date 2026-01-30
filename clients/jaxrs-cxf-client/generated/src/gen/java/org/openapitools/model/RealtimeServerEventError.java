package org.openapitools.model;

import org.openapitools.model.RealtimeServerEventErrorError;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Returned when an error occurs, which could be a client problem or a server  problem. Most errors are recoverable and the session will stay open, we  recommend to implementors to monitor and log error messages by default. 
 */
@ApiModel(description="Returned when an error occurs, which could be a client problem or a server  problem. Most errors are recoverable and the session will stay open, we  recommend to implementors to monitor and log error messages by default. ")

public class RealtimeServerEventError  {
  
 /**
  * The unique ID of the server event.
  */
  @ApiModelProperty(required = true, value = "The unique ID of the server event.")

  private String eventId;

public enum TypeEnum {

ERROR(String.valueOf("error"));


    private String value;

    TypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
        for (TypeEnum b : TypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * The event type, must be `error`.
  */
  @ApiModelProperty(required = true, value = "The event type, must be `error`.")

  private TypeEnum type;

  @ApiModelProperty(required = true, value = "")

  private RealtimeServerEventErrorError error;
 /**
   * The unique ID of the server event.
   * @return eventId
  **/
  @JsonProperty("event_id")
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public RealtimeServerEventError eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

 /**
   * The event type, must be &#x60;error&#x60;.
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    if (type == null) {
      return null;
    }
    return type.value();
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RealtimeServerEventError type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
   * Get error
   * @return error
  **/
  @JsonProperty("error")
  public RealtimeServerEventErrorError getError() {
    return error;
  }

  public void setError(RealtimeServerEventErrorError error) {
    this.error = error;
  }

  public RealtimeServerEventError error(RealtimeServerEventErrorError error) {
    this.error = error;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealtimeServerEventError realtimeServerEventError = (RealtimeServerEventError) o;
    return Objects.equals(this.eventId, realtimeServerEventError.eventId) &&
        Objects.equals(this.type, realtimeServerEventError.type) &&
        Objects.equals(this.error, realtimeServerEventError.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, type, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeServerEventError {\n");
    
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

