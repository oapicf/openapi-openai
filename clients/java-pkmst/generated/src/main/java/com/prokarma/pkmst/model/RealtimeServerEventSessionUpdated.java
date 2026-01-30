package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.RealtimeSession;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Returned when a session is updated with a &#x60;session.update&#x60; event, unless  there is an error. 
 */
@ApiModel(description = "Returned when a session is updated with a `session.update` event, unless  there is an error. ")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T14:08:20.194647079Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeServerEventSessionUpdated   {
  @JsonProperty("event_id")
  private String eventId;

  /**
   * The event type, must be `session.updated`.
   */
  public enum TypeEnum {
    SESSION_UPDATED("session.updated");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("type")
  private TypeEnum type;

  @JsonProperty("session")
  private RealtimeSession session;

  public RealtimeServerEventSessionUpdated eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * The unique ID of the server event.
   * @return eventId
   */
  @ApiModelProperty(required = true, value = "The unique ID of the server event.")
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
  @ApiModelProperty(required = true, value = "The event type, must be `session.updated`.")
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
  @ApiModelProperty(required = true, value = "")
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

