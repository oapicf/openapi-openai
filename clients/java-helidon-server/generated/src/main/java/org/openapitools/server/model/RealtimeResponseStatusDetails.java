package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.RealtimeResponseStatusDetailsError;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Additional details about the status.
 */
public class RealtimeResponseStatusDetails   {


    /**
    * The type of error that caused the response to fail, corresponding  with the `status` field (`completed`, `cancelled`, `incomplete`,  `failed`). 
    */
    public enum TypeEnum {
        COMPLETED("completed"),
        CANCELLED("cancelled"),
        FAILED("failed"),
        INCOMPLETE("incomplete");

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

    /**
    * The reason the Response did not complete. For a `cancelled` Response,  one of `turn_detected` (the server VAD detected a new start of speech)  or `client_cancelled` (the client sent a cancel event). For an  `incomplete` Response, one of `max_output_tokens` or `content_filter`  (the server-side safety filter activated and cut off the response). 
    */
    public enum ReasonEnum {
        TURN_DETECTED("turn_detected"),
        CLIENT_CANCELLED("client_cancelled"),
        MAX_OUTPUT_TOKENS("max_output_tokens"),
        CONTENT_FILTER("content_filter");

        private String value;

        ReasonEnum(String value) {
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
        public static ReasonEnum fromValue(String text) {
            for (ReasonEnum b : ReasonEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private ReasonEnum reason;
    private RealtimeResponseStatusDetailsError error;

    /**
     * Default constructor.
     */
    public RealtimeResponseStatusDetails() {
    // JSON-B / Jackson
    }

    /**
     * Create RealtimeResponseStatusDetails.
     *
     * @param type The type of error that caused the response to fail, corresponding  with the &#x60;status&#x60; field (&#x60;completed&#x60;, &#x60;cancelled&#x60;, &#x60;incomplete&#x60;,  &#x60;failed&#x60;). 
     * @param reason The reason the Response did not complete. For a &#x60;cancelled&#x60; Response,  one of &#x60;turn_detected&#x60; (the server VAD detected a new start of speech)  or &#x60;client_cancelled&#x60; (the client sent a cancel event). For an  &#x60;incomplete&#x60; Response, one of &#x60;max_output_tokens&#x60; or &#x60;content_filter&#x60;  (the server-side safety filter activated and cut off the response). 
     * @param error error
     */
    public RealtimeResponseStatusDetails(
        TypeEnum type, 
        ReasonEnum reason, 
        RealtimeResponseStatusDetailsError error
    ) {
        this.type = type;
        this.reason = reason;
        this.error = error;
    }



    /**
     * The type of error that caused the response to fail, corresponding  with the `status` field (`completed`, `cancelled`, `incomplete`,  `failed`). 
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    /**
     * The reason the Response did not complete. For a `cancelled` Response,  one of `turn_detected` (the server VAD detected a new start of speech)  or `client_cancelled` (the client sent a cancel event). For an  `incomplete` Response, one of `max_output_tokens` or `content_filter`  (the server-side safety filter activated and cut off the response). 
     * @return reason
     */
    public ReasonEnum getReason() {
        return reason;
    }

    public void setReason(ReasonEnum reason) {
        this.reason = reason;
    }

    /**
     * Get error
     * @return error
     */
    public RealtimeResponseStatusDetailsError getError() {
        return error;
    }

    public void setError(RealtimeResponseStatusDetailsError error) {
        this.error = error;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RealtimeResponseStatusDetails {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

