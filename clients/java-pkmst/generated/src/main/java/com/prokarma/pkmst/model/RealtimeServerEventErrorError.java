package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Details of the error.
 */
@ApiModel(description = "Details of the error.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T14:08:20.194647079Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeServerEventErrorError   {
  @JsonProperty("type")
  private String type;

  @JsonProperty("code")
  private String code;

  @JsonProperty("message")
  private String message;

  @JsonProperty("param")
  private String param;

  @JsonProperty("event_id")
  private String eventId;

  public RealtimeServerEventErrorError type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of error (e.g., \"invalid_request_error\", \"server_error\"). 
   * @return type
   */
  @ApiModelProperty(required = true, value = "The type of error (e.g., \"invalid_request_error\", \"server_error\"). ")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public RealtimeServerEventErrorError code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Error code, if any.
   * @return code
   */
  @ApiModelProperty(value = "Error code, if any.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public RealtimeServerEventErrorError message(String message) {
    this.message = message;
    return this;
  }

  /**
   * A human-readable error message.
   * @return message
   */
  @ApiModelProperty(required = true, value = "A human-readable error message.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public RealtimeServerEventErrorError param(String param) {
    this.param = param;
    return this;
  }

  /**
   * Parameter related to the error, if any.
   * @return param
   */
  @ApiModelProperty(value = "Parameter related to the error, if any.")
  public String getParam() {
    return param;
  }

  public void setParam(String param) {
    this.param = param;
  }

  public RealtimeServerEventErrorError eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * The event_id of the client event that caused the error, if applicable. 
   * @return eventId
   */
  @ApiModelProperty(value = "The event_id of the client event that caused the error, if applicable. ")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

