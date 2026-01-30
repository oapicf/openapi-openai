package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RealtimeSession;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Returned when a session is updated with a &#x60;session.update&#x60; event, unless  there is an error. 
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Returned when a session is updated with a `session.update` event, unless  there is an error. ")
public class RealtimeServerEventSessionUpdated   {
  
  private String eventId;


public enum TypeEnum {

    @JsonProperty("session.updated") SESSION_UPDATED(String.valueOf("session.updated"));


    private String value;

    TypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

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

  /**
   * The unique ID of the server event.
   **/
  public RealtimeServerEventSessionUpdated eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The unique ID of the server event.")
  @JsonProperty("event_id")
  @NotNull
  public String getEventId() {
    return eventId;
  }
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }


  /**
   * The event type, must be &#x60;session.updated&#x60;.
   **/
  public RealtimeServerEventSessionUpdated type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The event type, must be `session.updated`.")
  @JsonProperty("type")
  @NotNull
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   **/
  public RealtimeServerEventSessionUpdated session(RealtimeSession session) {
    this.session = session;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("session")
  @NotNull
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

