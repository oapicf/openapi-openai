package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.RealtimeResponse;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Returned when a new Response is created. The first event of response creation, where the response is in an initial state of `in_progress`. 
 */
public class RealtimeServerEventResponseCreated   {

    private String eventId;

    /**
    * The event type, must be `response.created`.
    */
    public enum TypeEnum {
        RESPONSE_CREATED("response.created");

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
    private RealtimeResponse response;

    /**
     * Default constructor.
     */
    public RealtimeServerEventResponseCreated() {
    // JSON-B / Jackson
    }

    /**
     * Create RealtimeServerEventResponseCreated.
     *
     * @param eventId The unique ID of the server event.
     * @param type The event type, must be &#x60;response.created&#x60;.
     * @param response response
     */
    public RealtimeServerEventResponseCreated(
        String eventId, 
        TypeEnum type, 
        RealtimeResponse response
    ) {
        this.eventId = eventId;
        this.type = type;
        this.response = response;
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
     * The event type, must be `response.created`.
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    /**
     * Get response
     * @return response
     */
    public RealtimeResponse getResponse() {
        return response;
    }

    public void setResponse(RealtimeResponse response) {
        this.response = response;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RealtimeServerEventResponseCreated {\n");
        
        sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    response: ").append(toIndentedString(response)).append("\n");
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

