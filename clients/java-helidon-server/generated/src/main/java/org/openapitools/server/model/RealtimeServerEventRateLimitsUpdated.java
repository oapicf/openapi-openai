package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.RealtimeServerEventRateLimitsUpdatedRateLimitsInner;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Emitted at the beginning of a Response to indicate the updated rate limits.  When a Response is created some tokens will be \"reserved\" for the output  tokens, the rate limits shown here reflect that reservation, which is then  adjusted accordingly once the Response is completed. 
 */
public class RealtimeServerEventRateLimitsUpdated   {

    private String eventId;

    /**
    * The event type, must be `rate_limits.updated`.
    */
    public enum TypeEnum {
        RATE_LIMITS_UPDATED("rate_limits.updated");

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
    private List<@Valid RealtimeServerEventRateLimitsUpdatedRateLimitsInner> rateLimits = new ArrayList<>();

    /**
     * Default constructor.
     */
    public RealtimeServerEventRateLimitsUpdated() {
    // JSON-B / Jackson
    }

    /**
     * Create RealtimeServerEventRateLimitsUpdated.
     *
     * @param eventId The unique ID of the server event.
     * @param type The event type, must be &#x60;rate_limits.updated&#x60;.
     * @param rateLimits List of rate limit information.
     */
    public RealtimeServerEventRateLimitsUpdated(
        String eventId, 
        TypeEnum type, 
        List<@Valid RealtimeServerEventRateLimitsUpdatedRateLimitsInner> rateLimits
    ) {
        this.eventId = eventId;
        this.type = type;
        this.rateLimits = rateLimits;
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
     * The event type, must be `rate_limits.updated`.
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    /**
     * List of rate limit information.
     * @return rateLimits
     */
    public List<@Valid RealtimeServerEventRateLimitsUpdatedRateLimitsInner> getRateLimits() {
        return rateLimits;
    }

    public void setRateLimits(List<@Valid RealtimeServerEventRateLimitsUpdatedRateLimitsInner> rateLimits) {
        this.rateLimits = rateLimits;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RealtimeServerEventRateLimitsUpdated {\n");
        
        sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    rateLimits: ").append(toIndentedString(rateLimits)).append("\n");
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

