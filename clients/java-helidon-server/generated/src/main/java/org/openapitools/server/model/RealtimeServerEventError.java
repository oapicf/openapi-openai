package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.RealtimeServerEventErrorError;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Returned when an error occurs, which could be a client problem or a server  problem. Most errors are recoverable and the session will stay open, we  recommend to implementors to monitor and log error messages by default. 
 */
public class RealtimeServerEventError   {

    private String eventId;

    /**
    * The event type, must be `error`.
    */
    public enum TypeEnum {
        ERROR("error");

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
    private RealtimeServerEventErrorError error;

    /**
     * Default constructor.
     */
    public RealtimeServerEventError() {
    // JSON-B / Jackson
    }

    /**
     * Create RealtimeServerEventError.
     *
     * @param eventId The unique ID of the server event.
     * @param type The event type, must be &#x60;error&#x60;.
     * @param error error
     */
    public RealtimeServerEventError(
        String eventId, 
        TypeEnum type, 
        RealtimeServerEventErrorError error
    ) {
        this.eventId = eventId;
        this.type = type;
        this.error = error;
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
     * The event type, must be `error`.
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    /**
     * Get error
     * @return error
     */
    public RealtimeServerEventErrorError getError() {
        return error;
    }

    public void setError(RealtimeServerEventErrorError error) {
        this.error = error;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RealtimeServerEventError {\n");
        
        sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

