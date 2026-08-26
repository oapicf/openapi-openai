package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The expiration policy for a vector store.
 */
public class VectorStoreExpirationAfter   {


    /**
    * Anchor timestamp after which the expiration policy applies. Supported anchors: `last_active_at`.
    */
    public enum AnchorEnum {
        LAST_ACTIVE_AT("last_active_at");

        private String value;

        AnchorEnum(String value) {
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
        public static AnchorEnum fromValue(String text) {
            for (AnchorEnum b : AnchorEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private AnchorEnum anchor;
    private Integer days;

    /**
     * Default constructor.
     */
    public VectorStoreExpirationAfter() {
    // JSON-B / Jackson
    }

    /**
     * Create VectorStoreExpirationAfter.
     *
     * @param anchor Anchor timestamp after which the expiration policy applies. Supported anchors: &#x60;last_active_at&#x60;.
     * @param days The number of days after the anchor time that the vector store will expire.
     */
    public VectorStoreExpirationAfter(
        AnchorEnum anchor, 
        Integer days
    ) {
        this.anchor = anchor;
        this.days = days;
    }



    /**
     * Anchor timestamp after which the expiration policy applies. Supported anchors: `last_active_at`.
     * @return anchor
     */
    public AnchorEnum getAnchor() {
        return anchor;
    }

    public void setAnchor(AnchorEnum anchor) {
        this.anchor = anchor;
    }

    /**
     * The number of days after the anchor time that the vector store will expire.
     * minimum: 1
     * maximum: 365
     * @return days
     */
    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VectorStoreExpirationAfter {\n");
        
        sb.append("    anchor: ").append(toIndentedString(anchor)).append("\n");
        sb.append("    days: ").append(toIndentedString(days)).append("\n");
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

