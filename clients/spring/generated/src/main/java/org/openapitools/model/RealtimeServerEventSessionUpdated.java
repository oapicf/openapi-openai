package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.RealtimeSession;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Returned when a session is updated with a &#x60;session.update&#x60; event, unless  there is an error. 
 */

@Schema(name = "RealtimeServerEventSessionUpdated", description = "Returned when a session is updated with a `session.update` event, unless  there is an error. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T14:17:25.623752677Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeServerEventSessionUpdated {

  private String eventId;

  /**
   * The event type, must be `session.updated`.
   */
  public enum TypeEnum {
    SESSION_UPDATED("session.updated");

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

  private RealtimeSession session;

  public RealtimeServerEventSessionUpdated() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RealtimeServerEventSessionUpdated(String eventId, TypeEnum type, RealtimeSession session) {
    this.eventId = eventId;
    this.type = type;
    this.session = session;
  }

  public RealtimeServerEventSessionUpdated eventId(String eventId) {
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

  public RealtimeServerEventSessionUpdated type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The event type, must be `session.updated`.
   * @return type
   */
  @NotNull 
  @Schema(name = "type", description = "The event type, must be `session.updated`.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RealtimeServerEventSessionUpdated session(RealtimeSession session) {
    this.session = session;
    return this;
  }

  /**
   * Get session
   * @return session
   */
  @NotNull @Valid 
  @Schema(name = "session", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("session")
  public RealtimeSession getSession() {
    return session;
  }

  public void setSession(RealtimeSession session) {
    this.session = session;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealtimeServerEventSessionUpdated realtimeServerEventSessionUpdated = (RealtimeServerEventSessionUpdated) o;
    return Objects.equals(this.eventId, realtimeServerEventSessionUpdated.eventId) &&
        Objects.equals(this.type, realtimeServerEventSessionUpdated.type) &&
        Objects.equals(this.session, realtimeServerEventSessionUpdated.session);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, type, session);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeServerEventSessionUpdated {\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    session: ").append(toIndentedString(session)).append("\n");
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

