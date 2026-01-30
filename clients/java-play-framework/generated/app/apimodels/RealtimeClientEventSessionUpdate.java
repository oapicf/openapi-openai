package apimodels;

import apimodels.RealtimeSessionCreateRequest;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Send this event to update the session’s default configuration. The client may  send this event at any time to update the session configuration, and any  field may be updated at any time, except for \&quot;voice\&quot;. The server will respond  with a &#x60;session.updated&#x60; event that shows the full effective configuration.  Only fields that are present are updated, thus the correct way to clear a  field like \&quot;instructions\&quot; is to pass an empty string. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class RealtimeClientEventSessionUpdate   {
  @JsonProperty("event_id")
  
  private String eventId;

  /**
   * The event type, must be `session.update`.
   */
  public enum TypeEnum {
    SESSION_UPDATE("session.update");

    private final String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
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

  @JsonProperty("type")
  @NotNull

  private TypeEnum type;

  @JsonProperty("session")
  @NotNull
@Valid

  private RealtimeSessionCreateRequest session;

  public RealtimeClientEventSessionUpdate eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

   /**
   * Optional client-generated ID used to identify this event.
   * @return eventId
  **/
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public RealtimeClientEventSessionUpdate type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The event type, must be `session.update`.
   * @return type
  **/
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RealtimeClientEventSessionUpdate session(RealtimeSessionCreateRequest session) {
    this.session = session;
    return this;
  }

   /**
   * Get session
   * @return session
  **/
  public RealtimeSessionCreateRequest getSession() {
    return session;
  }

  public void setSession(RealtimeSessionCreateRequest session) {
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
    RealtimeClientEventSessionUpdate realtimeClientEventSessionUpdate = (RealtimeClientEventSessionUpdate) o;
    return Objects.equals(eventId, realtimeClientEventSessionUpdate.eventId) &&
        Objects.equals(type, realtimeClientEventSessionUpdate.type) &&
        Objects.equals(session, realtimeClientEventSessionUpdate.session);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, type, session);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeClientEventSessionUpdate {\n");
    
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

