package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details of the error.
 */

@Schema(name = "RealtimeServerEventError_error", description = "Details of the error.")
@JsonTypeName("RealtimeServerEventError_error")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T14:17:25.623752677Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeServerEventErrorError {

  private String type;

  private JsonNullable<String> code = JsonNullable.<String>undefined();

  private String message;

  private JsonNullable<String> param = JsonNullable.<String>undefined();

  private JsonNullable<String> eventId = JsonNullable.<String>undefined();

  public RealtimeServerEventErrorError() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RealtimeServerEventErrorError(String type, String message) {
    this.type = type;
    this.message = message;
  }

  public RealtimeServerEventErrorError type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of error (e.g., \"invalid_request_error\", \"server_error\"). 
   * @return type
   */
  @NotNull 
  @Schema(name = "type", description = "The type of error (e.g., \"invalid_request_error\", \"server_error\"). ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public RealtimeServerEventErrorError code(String code) {
    this.code = JsonNullable.of(code);
    return this;
  }

  /**
   * Error code, if any.
   * @return code
   */
  
  @Schema(name = "code", description = "Error code, if any.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("code")
  public JsonNullable<String> getCode() {
    return code;
  }

  public void setCode(JsonNullable<String> code) {
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
  @NotNull 
  @Schema(name = "message", description = "A human-readable error message.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public RealtimeServerEventErrorError param(String param) {
    this.param = JsonNullable.of(param);
    return this;
  }

  /**
   * Parameter related to the error, if any.
   * @return param
   */
  
  @Schema(name = "param", description = "Parameter related to the error, if any.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("param")
  public JsonNullable<String> getParam() {
    return param;
  }

  public void setParam(JsonNullable<String> param) {
    this.param = param;
  }

  public RealtimeServerEventErrorError eventId(String eventId) {
    this.eventId = JsonNullable.of(eventId);
    return this;
  }

  /**
   * The event_id of the client event that caused the error, if applicable. 
   * @return eventId
   */
  
  @Schema(name = "event_id", description = "The event_id of the client event that caused the error, if applicable. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("event_id")
  public JsonNullable<String> getEventId() {
    return eventId;
  }

  public void setEventId(JsonNullable<String> eventId) {
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
        equalsNullable(this.code, realtimeServerEventErrorError.code) &&
        Objects.equals(this.message, realtimeServerEventErrorError.message) &&
        equalsNullable(this.param, realtimeServerEventErrorError.param) &&
        equalsNullable(this.eventId, realtimeServerEventErrorError.eventId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, hashCodeNullable(code), message, hashCodeNullable(param), hashCodeNullable(eventId));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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

