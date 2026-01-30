package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.RealtimeSessionCreateRequest;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Send this event to update the session’s default configuration. The client may  send this event at any time to update the session configuration, and any  field may be updated at any time, except for \"voice\". The server will respond  with a `session.updated` event that shows the full effective configuration.  Only fields that are present are updated, thus the correct way to clear a  field like \"instructions\" is to pass an empty string. 
 */
@ApiModel(description="Send this event to update the session’s default configuration. The client may  send this event at any time to update the session configuration, and any  field may be updated at any time, except for \"voice\". The server will respond  with a `session.updated` event that shows the full effective configuration.  Only fields that are present are updated, thus the correct way to clear a  field like \"instructions\" is to pass an empty string. ")

public class RealtimeClientEventSessionUpdate  {
  
 /**
  * Optional client-generated ID used to identify this event.
  */
  @ApiModelProperty(value = "Optional client-generated ID used to identify this event.")
  private String eventId;

public enum TypeEnum {

    @JsonProperty("session.update") SESSION_UPDATE(String.valueOf("session.update"));

    private String value;

    TypeEnum (String v) {
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

 /**
  * The event type, must be `session.update`.
  */
  @ApiModelProperty(required = true, value = "The event type, must be `session.update`.")
  private TypeEnum type;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private RealtimeSessionCreateRequest session;
 /**
  * Optional client-generated ID used to identify this event.
  * @return eventId
  */
  @JsonProperty("event_id")
  public String getEventId() {
    return eventId;
  }

  /**
   * Sets the <code>eventId</code> property.
   */
 public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  /**
   * Sets the <code>eventId</code> property.
   */
  public RealtimeClientEventSessionUpdate eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

 /**
  * The event type, must be &#x60;session.update&#x60;.
  * @return type
  */
  @JsonProperty("type")
  @NotNull
  public String getType() {
    return type == null ? null : type.value();
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public RealtimeClientEventSessionUpdate type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
  * Get session
  * @return session
  */
  @JsonProperty("session")
  @NotNull
  public RealtimeSessionCreateRequest getSession() {
    return session;
  }

  /**
   * Sets the <code>session</code> property.
   */
 public void setSession(RealtimeSessionCreateRequest session) {
    this.session = session;
  }

  /**
   * Sets the <code>session</code> property.
   */
  public RealtimeClientEventSessionUpdate session(RealtimeSessionCreateRequest session) {
    this.session = session;
    return this;
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
    return Objects.equals(this.eventId, realtimeClientEventSessionUpdate.eventId) &&
        Objects.equals(this.type, realtimeClientEventSessionUpdate.type) &&
        Objects.equals(this.session, realtimeClientEventSessionUpdate.session);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

