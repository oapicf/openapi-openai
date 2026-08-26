package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.RealtimeSession;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Returned when a Session is created. Emitted automatically when a new  connection is established as the first server event. This event will contain  the default Session configuration. 
 */
public class RealtimeServerEventSessionCreated   {

    private String eventId;

    /**
    * The event type, must be `session.created`.
    */
    public enum TypeEnum {
        SESSION_CREATED("session.created");

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
    private RealtimeSession session;

    /**
     * Default constructor.
     */
    public RealtimeServerEventSessionCreated() {
    // JSON-B / Jackson
    }

    /**
     * Create RealtimeServerEventSessionCreated.
     *
     * @param eventId The unique ID of the server event.
     * @param type The event type, must be &#x60;session.created&#x60;.
     * @param session session
     */
    public RealtimeServerEventSessionCreated(
        String eventId, 
        TypeEnum type, 
        RealtimeSession session
    ) {
        this.eventId = eventId;
        this.type = type;
        this.session = session;
    }



    /**
     * The unique ID of the server event.
     * @return eventId
     */
    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    /**
     * The event type, must be `session.created`.
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
    public RealtimeSession getSession() {
        return session;
    }

    public void setSession(RealtimeSession session) {
        this.session = session;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

