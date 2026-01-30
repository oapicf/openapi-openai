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
 * Returned when a Session is created. Emitted automatically when a new  connection is established as the first server event. This event will contain  the default Session configuration. 
 */

@Schema(name = "RealtimeServerEventSessionCreated", description = "Returned when a Session is created. Emitted automatically when a new  connection is established as the first server event. This event will contain  the default Session configuration. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T14:17:25.623752677Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeServerEventSessionCreated {

  private String eventId;

  /**
   * The event type, must be `session.created`.
   */
  public enum TypeEnum {
    SESSION_CREATED("session.created");

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

  public RealtimeServerEventSessionCreated() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RealtimeServerEventSessionCreated(String eventId, TypeEnum type, RealtimeSession session) {
    this.eventId = eventId;
    this.type = type;
    this.session = session;
  }

  public RealtimeServerEventSessionCreated eventId(String eventId) {
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

  public RealtimeServerEventSessionCreated type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The event type, must be `session.created`.
   * @return type
   */
  @NotNull 
  @Schema(name = "type", description = "The event type, must be `session.created`.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RealtimeServerEventSessionCreated session(RealtimeSession session) {
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
    RealtimeServerEventSessionCreated realtimeServerEventSessionCreated = (RealtimeServerEventSessionCreated) o;
    return Objects.equals(this.eventId, realtimeServerEventSessionCreated.eventId) &&
        Objects.equals(this.type, realtimeServerEventSessionCreated.type) &&
        Objects.equals(this.session, realtimeServerEventSessionCreated.session);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, type, session);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeServerEventSessionCreated {\n");
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

