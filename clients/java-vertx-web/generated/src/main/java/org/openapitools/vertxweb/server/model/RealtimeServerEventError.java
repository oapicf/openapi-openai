package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.RealtimeServerEventErrorError;

/**
 * Returned when an error occurs, which could be a client problem or a server  problem. Most errors are recoverable and the session will stay open, we  recommend to implementors to monitor and log error messages by default. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RealtimeServerEventError   {
  
  private String eventId;


  public enum TypeEnum {
    ERROR("error");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private TypeEnum type;
  private RealtimeServerEventErrorError error;

  public RealtimeServerEventError () {

  }

  public RealtimeServerEventError (String eventId, TypeEnum type, RealtimeServerEventErrorError error) {
    this.eventId = eventId;
    this.type = type;
    this.error = error;
  }

    
  @JsonProperty("event_id")
  public String getEventId() {
    return eventId;
  }
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

    
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

    
  @JsonProperty("error")
  public RealtimeServerEventErrorError getError() {
    return error;
  }
  public void setError(RealtimeServerEventErrorError error) {
    this.error = error;
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
    return Objects.equals(eventId, realtimeServerEventError.eventId) &&
        Objects.equals(type, realtimeServerEventError.type) &&
        Objects.equals(error, realtimeServerEventError.error);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
