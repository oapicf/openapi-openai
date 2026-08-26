package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Details of the error.
 */
public class RealtimeServerEventErrorError implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The type of error (e.g., \&quot;invalid_request_error\&quot;, \&quot;server_error\&quot;). 
   */
  @JsonProperty("type")
  private String type;

  /**
   * Error code, if any.
   */
  @JsonProperty("code")
  private String code;

  /**
   * A human-readable error message.
   */
  @JsonProperty("message")
  private String message;

  /**
   * Parameter related to the error, if any.
   */
  @JsonProperty("param")
  private String param;

  /**
   * The event_id of the client event that caused the error, if applicable. 
   */
  @JsonProperty("event_id")
  private String eventId;

  /**
   * The type of error (e.g., \&quot;invalid_request_error\&quot;, \&quot;server_error\&quot;). 
   * @return type
   */
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * Error code, if any.
   * @return code
   */
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  /**
   * A human-readable error message.
   * @return message
   */
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Parameter related to the error, if any.
   * @return param
   */
  public String getParam() {
    return param;
  }

  public void setParam(String param) {
    this.param = param;
  }

  /**
   * The event_id of the client event that caused the error, if applicable. 
   * @return eventId
   */
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
    return Objects.equals(this.type, realtimeServerEventErrorError.type) &&
        Objects.equals(this.code, realtimeServerEventErrorError.code) &&
        Objects.equals(this.message, realtimeServerEventErrorError.message) &&
        Objects.equals(this.param, realtimeServerEventErrorError.param) &&
        Objects.equals(this.eventId, realtimeServerEventErrorError.eventId);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
