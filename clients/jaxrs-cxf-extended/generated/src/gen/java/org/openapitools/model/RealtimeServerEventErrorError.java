package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Details of the error.
 */
@ApiModel(description="Details of the error.")

public class RealtimeServerEventErrorError  {
  
 /**
  * The type of error (e.g., \"invalid_request_error\", \"server_error\"). 
  */
  @ApiModelProperty(required = true, value = "The type of error (e.g., \"invalid_request_error\", \"server_error\"). ")
  private String type;

 /**
  * Error code, if any.
  */
  @ApiModelProperty(value = "Error code, if any.")
  private String code;

 /**
  * A human-readable error message.
  */
  @ApiModelProperty(required = true, value = "A human-readable error message.")
  private String message;

 /**
  * Parameter related to the error, if any.
  */
  @ApiModelProperty(value = "Parameter related to the error, if any.")
  private String param;

 /**
  * The event_id of the client event that caused the error, if applicable. 
  */
  @ApiModelProperty(value = "The event_id of the client event that caused the error, if applicable. ")
  private String eventId;
 /**
  * The type of error (e.g., \&quot;invalid_request_error\&quot;, \&quot;server_error\&quot;). 
  * @return type
  */
  @JsonProperty("type")
  @NotNull
  public String getType() {
    return type;
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(String type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public RealtimeServerEventErrorError type(String type) {
    this.type = type;
    return this;
  }

 /**
  * Error code, if any.
  * @return code
  */
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  /**
   * Sets the <code>code</code> property.
   */
 public void setCode(String code) {
    this.code = code;
  }

  /**
   * Sets the <code>code</code> property.
   */
  public RealtimeServerEventErrorError code(String code) {
    this.code = code;
    return this;
  }

 /**
  * A human-readable error message.
  * @return message
  */
  @JsonProperty("message")
  @NotNull
  public String getMessage() {
    return message;
  }

  /**
   * Sets the <code>message</code> property.
   */
 public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Sets the <code>message</code> property.
   */
  public RealtimeServerEventErrorError message(String message) {
    this.message = message;
    return this;
  }

 /**
  * Parameter related to the error, if any.
  * @return param
  */
  @JsonProperty("param")
  public String getParam() {
    return param;
  }

  /**
   * Sets the <code>param</code> property.
   */
 public void setParam(String param) {
    this.param = param;
  }

  /**
   * Sets the <code>param</code> property.
   */
  public RealtimeServerEventErrorError param(String param) {
    this.param = param;
    return this;
  }

 /**
  * The event_id of the client event that caused the error, if applicable. 
  * @return eventId
  */
  @JsonProperty("event_id")
  public String getEventId() {
    return eventId;
  }

  /**
   * Sets the <code>eventId</code> property.
   */
 public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  /**
   * Sets the <code>eventId</code> property.
   */
  public RealtimeServerEventErrorError eventId(String eventId) {
    this.eventId = eventId;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

