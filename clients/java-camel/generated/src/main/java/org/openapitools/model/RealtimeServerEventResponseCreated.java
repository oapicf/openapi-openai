package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.RealtimeResponse;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Returned when a new Response is created. The first event of response creation, where the response is in an initial state of &#x60;in_progress&#x60;. 
 */

@Schema(name = "RealtimeServerEventResponseCreated", description = "Returned when a new Response is created. The first event of response creation, where the response is in an initial state of `in_progress`. ")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeServerEventResponseCreated {

  private String eventId;

  /**
   * The event type, must be `response.created`.
   */
  public enum TypeEnum {
    RESPONSE_CREATED("response.created");

    private final String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypeEnum type;

  private RealtimeResponse response;

  public RealtimeServerEventResponseCreated() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RealtimeServerEventResponseCreated(String eventId, TypeEnum type, RealtimeResponse response) {
    this.eventId = eventId;
    this.type = type;
    this.response = response;
  }

  public RealtimeServerEventResponseCreated eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * The unique ID of the server event.
   * @return eventId
   */
  @NotNull 
  @Schema(name = "event_id", description = "The unique ID of the server event.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("event_id")
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public RealtimeServerEventResponseCreated type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The event type, must be `response.created`.
   * @return type
   */
  @NotNull 
  @Schema(name = "type", description = "The event type, must be `response.created`.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RealtimeServerEventResponseCreated response(RealtimeResponse response) {
    this.response = response;
    return this;
  }

  /**
   * Get response
   * @return response
   */
  @NotNull @Valid 
  @Schema(name = "response", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("response")
  public RealtimeResponse getResponse() {
    return response;
  }

  public void setResponse(RealtimeResponse response) {
    this.response = response;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealtimeServerEventResponseCreated realtimeServerEventResponseCreated = (RealtimeServerEventResponseCreated) o;
    return Objects.equals(this.eventId, realtimeServerEventResponseCreated.eventId) &&
        Objects.equals(this.type, realtimeServerEventResponseCreated.type) &&
        Objects.equals(this.response, realtimeServerEventResponseCreated.response);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, type, response);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeServerEventResponseCreated {\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
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

