package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.RealtimeSession;

/**
 * Returned when a session is updated with a &#x60;session.update&#x60; event, unless  there is an error. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RealtimeServerEventSessionUpdated   {
  
  private String eventId;


  public enum TypeEnum {
    SESSION_UPDATED("session.updated");

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
  private RealtimeSession session;

  public RealtimeServerEventSessionUpdated () {

  }

  public RealtimeServerEventSessionUpdated (String eventId, TypeEnum type, RealtimeSession session) {
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
    return Objects.equals(eventId, realtimeServerEventSessionUpdated.eventId) &&
        Objects.equals(type, realtimeServerEventSessionUpdated.type) &&
        Objects.equals(session, realtimeServerEventSessionUpdated.session);
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
