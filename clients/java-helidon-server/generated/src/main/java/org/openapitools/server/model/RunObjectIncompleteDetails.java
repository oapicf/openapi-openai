package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Details on why the run is incomplete. Will be `null` if the run is not incomplete.
 */
public class RunObjectIncompleteDetails   {


    /**
    * The reason why the run is incomplete. This will point to which specific token limit was reached over the course of the run.
    */
    public enum ReasonEnum {
        MAX_COMPLETION_TOKENS("max_completion_tokens"),
        MAX_PROMPT_TOKENS("max_prompt_tokens");

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
    public RunObjectIncompleteDetails() {
    // JSON-B / Jackson
    }

    /**
     * Create RunObjectIncompleteDetails.
     *
     * @param reason The reason why the run is incomplete. This will point to which specific token limit was reached over the course of the run.
     */
    public RunObjectIncompleteDetails(
        ReasonEnum reason
    ) {
        this.reason = reason;
    }



    /**
     * The reason why the run is incomplete. This will point to which specific token limit was reached over the course of the run.
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
        sb.append("class RunObjectIncompleteDetails {\n");
        
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

