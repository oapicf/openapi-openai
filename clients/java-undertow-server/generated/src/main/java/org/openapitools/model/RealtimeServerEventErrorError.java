/*
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * OpenAPI document version: 2.3.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;



/**
 * Details of the error.
 */

@ApiModel(description = "Details of the error.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-01-29T14:08:32.184840743Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeServerEventErrorError   {
  
  private String type;
  private String code;
  private String message;
  private String param;
  private String eventId;

  /**
   * The type of error (e.g., \"invalid_request_error\", \"server_error\"). 
   */
  public RealtimeServerEventErrorError type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The type of error (e.g., \"invalid_request_error\", \"server_error\"). ")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Error code, if any.
   */
  public RealtimeServerEventErrorError code(String code) {
    this.code = code;
    return this;
  }

  
  @ApiModelProperty(value = "Error code, if any.")
  @JsonProperty("code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  /**
   * A human-readable error message.
   */
  public RealtimeServerEventErrorError message(String message) {
    this.message = message;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A human-readable error message.")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Parameter related to the error, if any.
   */
  public RealtimeServerEventErrorError param(String param) {
    this.param = param;
    return this;
  }

  
  @ApiModelProperty(value = "Parameter related to the error, if any.")
  @JsonProperty("param")
  public String getParam() {
    return param;
  }
  public void setParam(String param) {
    this.param = param;
  }

  /**
   * The event_id of the client event that caused the error, if applicable. 
   */
  public RealtimeServerEventErrorError eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  
  @ApiModelProperty(value = "The event_id of the client event that caused the error, if applicable. ")
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

