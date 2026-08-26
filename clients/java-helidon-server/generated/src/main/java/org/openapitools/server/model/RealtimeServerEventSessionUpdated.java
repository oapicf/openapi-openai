package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.RealtimeSession;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Returned when a session is updated with a `session.update` event, unless  there is an error. 
 */
public class RealtimeServerEventSessionUpdated   {

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
    public RealtimeServerEventSessionUpdated() {
    // JSON-B / Jackson
    }

    /**
     * Create RealtimeServerEventSessionUpdated.
     *
     * @param eventId The unique ID of the server event.
     * @param type The event type, must be &#x60;session.updated&#x60;.
     * @param session session
     */
    public RealtimeServerEventSessionUpdated(
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
     * The event type, must be `session.updated`.
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
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

