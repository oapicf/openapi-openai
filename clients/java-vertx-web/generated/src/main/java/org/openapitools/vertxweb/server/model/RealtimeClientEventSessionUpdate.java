package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.RealtimeSessionCreateRequest;

/**
 * Send this event to update the session’s default configuration. The client may  send this event at any time to update the session configuration, and any  field may be updated at any time, except for \&quot;voice\&quot;. The server will respond  with a &#x60;session.updated&#x60; event that shows the full effective configuration.  Only fields that are present are updated, thus the correct way to clear a  field like \&quot;instructions\&quot; is to pass an empty string. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RealtimeClientEventSessionUpdate   {
  
  private String eventId;


  public enum TypeEnum {
    SESSION_UPDATE("session.update");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private TypeEnum type;
  private RealtimeSessionCreateRequest session;

  public RealtimeClientEventSessionUpdate () {

  }

  public RealtimeClientEventSessionUpdate (String eventId, TypeEnum type, RealtimeSessionCreateRequest session) {
    this.eventId = eventId;
    this.type = type;
    this.session = session;
  }

    
  @JsonProperty("event_id")
  public String getEventId() {
    return eventId;
  }
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

    
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

    
  @JsonProperty("session")
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
