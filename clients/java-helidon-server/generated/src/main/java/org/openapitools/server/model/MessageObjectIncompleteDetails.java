package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * On an incomplete message, details about why the message is incomplete.
 */
public class MessageObjectIncompleteDetails   {


    /**
    * The reason the message is incomplete.
    */
    public enum ReasonEnum {
        CONTENT_FILTER("content_filter"),
        MAX_TOKENS("max_tokens"),
        RUN_CANCELLED("run_cancelled"),
        RUN_EXPIRED("run_expired"),
        RUN_FAILED("run_failed");

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

    /**
     * Default constructor.
     */
    public MessageObjectIncompleteDetails() {
    // JSON-B / Jackson
    }

    /**
     * Create MessageObjectIncompleteDetails.
     *
     * @param reason The reason the message is incomplete.
     */
    public MessageObjectIncompleteDetails(
        ReasonEnum reason
    ) {
        this.reason = reason;
    }



    /**
     * The reason the message is incomplete.
     * @return reason
     */
    public ReasonEnum getReason() {
        return reason;
    }

    public void setReason(ReasonEnum reason) {
        this.reason = reason;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MessageObjectIncompleteDetails {\n");
        
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

