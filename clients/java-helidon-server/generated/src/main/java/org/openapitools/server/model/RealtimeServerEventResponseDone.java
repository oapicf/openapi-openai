package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.RealtimeResponse;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Returned when a Response is done streaming. Always emitted, no matter the  final state. The Response object included in the `response.done` event will  include all output Items in the Response but will omit the raw audio data. 
 */
public class RealtimeServerEventResponseDone   {

    private String eventId;

    /**
    * The event type, must be `response.done`.
    */
    public enum TypeEnum {
        RESPONSE_DONE("response.done");

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
    public RealtimeServerEventResponseDone() {
    // JSON-B / Jackson
    }

    /**
     * Create RealtimeServerEventResponseDone.
     *
     * @param eventId The unique ID of the server event.
     * @param type The event type, must be &#x60;response.done&#x60;.
     * @param response response
     */
    public RealtimeServerEventResponseDone(
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
     * The event type, must be `response.done`.
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
        sb.append("class RealtimeServerEventResponseDone {\n");
        
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

