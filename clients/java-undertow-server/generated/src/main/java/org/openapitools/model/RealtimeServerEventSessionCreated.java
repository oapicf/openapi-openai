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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RealtimeSession;



/**
 * Returned when a Session is created. Emitted automatically when a new  connection is established as the first server event. This event will contain  the default Session configuration. 
 */

@ApiModel(description = "Returned when a Session is created. Emitted automatically when a new  connection is established as the first server event. This event will contain  the default Session configuration. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-01-29T14:08:32.184840743Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeServerEventSessionCreated   {
  
  private String eventId;


  public enum TypeEnum {
    SESSION_CREATED("session.created");

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

  /**
   * The unique ID of the server event.
   */
  public RealtimeServerEventSessionCreated eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The unique ID of the server event.")
  @JsonProperty("event_id")
  public String getEventId() {
    return eventId;
  }
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  /**
   * The event type, must be `session.created`.
   */
  public RealtimeServerEventSessionCreated type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The event type, must be `session.created`.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   */
  public RealtimeServerEventSessionCreated session(RealtimeSession session) {
    this.session = session;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
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
    return Objects.equals(eventId, realtimeServerEventSessionCreated.eventId) &&
        Objects.equals(type, realtimeServerEventSessionCreated.type) &&
        Objects.equals(session, realtimeServerEventSessionCreated.session);
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

