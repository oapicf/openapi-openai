package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Details of the error.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RealtimeServerEventErrorError   {
  
  private String type;
  private String code;
  private String message;
  private String param;
  private String eventId;

  public RealtimeServerEventErrorError () {

  }

  public RealtimeServerEventErrorError (String type, String code, String message, String param, String eventId) {
    this.type = type;
    this.code = code;
    this.message = message;
    this.param = param;
    this.eventId = eventId;
  }

    
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

    
  @JsonProperty("code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

    
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

    
  @JsonProperty("param")
  public String getParam() {
    return param;
  }
  public void setParam(String param) {
    this.param = param;
  }

    
  @JsonProperty("event_id")
  public String getEventId() {
    return eventId;
  }
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealtimeServerEventErrorError realtimeServerEventErrorError = (RealtimeServerEventErrorError) o;
    return Objects.equals(type, realtimeServerEventErrorError.type) &&
        Objects.equals(code, realtimeServerEventErrorError.code) &&
        Objects.equals(message, realtimeServerEventErrorError.message) &&
        Objects.equals(param, realtimeServerEventErrorError.param) &&
        Objects.equals(eventId, realtimeServerEventErrorError.eventId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, code, message, param, eventId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeServerEventErrorError {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    param: ").append(toIndentedString(param)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
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
