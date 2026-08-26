package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.RealtimeSessionCreateRequest;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Send this event to update the session’s default configuration. The client may  send this event at any time to update the session configuration, and any  field may be updated at any time, except for \"voice\". The server will respond  with a `session.updated` event that shows the full effective configuration.  Only fields that are present are updated, thus the correct way to clear a  field like \"instructions\" is to pass an empty string. 
 */
public class RealtimeClientEventSessionUpdate   {

    private String eventId;

    /**
    * The event type, must be `session.update`.
    */
    public enum TypeEnum {
        SESSION_UPDATE("session.update");

        private String value;

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
        public static TypeEnum fromValue(String text) {
            for (TypeEnum b : TypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private TypeEnum type;
    private RealtimeSessionCreateRequest session;

    /**
     * Default constructor.
     */
    public RealtimeClientEventSessionUpdate() {
    // JSON-B / Jackson
    }

    /**
     * Create RealtimeClientEventSessionUpdate.
     *
     * @param eventId Optional client-generated ID used to identify this event.
     * @param type The event type, must be &#x60;session.update&#x60;.
     * @param session session
     */
    public RealtimeClientEventSessionUpdate(
        String eventId, 
        TypeEnum type, 
        RealtimeSessionCreateRequest session
    ) {
        this.eventId = eventId;
        this.type = type;
        this.session = session;
    }



    /**
     * Optional client-generated ID used to identify this event.
     * @return eventId
     */
    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    /**
     * The event type, must be `session.update`.
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    /**
     * Get session
     * @return session
     */
    public RealtimeSessionCreateRequest getSession() {
        return session;
    }

    public void setSession(RealtimeSessionCreateRequest session) {
        this.session = session;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

