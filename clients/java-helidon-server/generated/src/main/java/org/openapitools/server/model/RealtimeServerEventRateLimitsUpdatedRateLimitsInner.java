package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class RealtimeServerEventRateLimitsUpdatedRateLimitsInner   {


    /**
    * The name of the rate limit (`requests`, `tokens`). 
    */
    public enum NameEnum {
        REQUESTS("requests"),
        TOKENS("tokens");

        private String value;

        NameEnum(String value) {
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
        public static NameEnum fromValue(String text) {
            for (NameEnum b : NameEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private NameEnum name;
    private Integer limit;
    private Integer remaining;
    private BigDecimal resetSeconds;

    /**
     * Default constructor.
     */
    public RealtimeServerEventRateLimitsUpdatedRateLimitsInner() {
    // JSON-B / Jackson
    }

    /**
     * Create RealtimeServerEventRateLimitsUpdatedRateLimitsInner.
     *
     * @param name The name of the rate limit (&#x60;requests&#x60;, &#x60;tokens&#x60;). 
     * @param limit The maximum allowed value for the rate limit.
     * @param remaining The remaining value before the limit is reached.
     * @param resetSeconds Seconds until the rate limit resets.
     */
    public RealtimeServerEventRateLimitsUpdatedRateLimitsInner(
        NameEnum name, 
        Integer limit, 
        Integer remaining, 
        BigDecimal resetSeconds
    ) {
        this.name = name;
        this.limit = limit;
        this.remaining = remaining;
        this.resetSeconds = resetSeconds;
    }



    /**
     * The name of the rate limit (`requests`, `tokens`). 
     * @return name
     */
    public NameEnum getName() {
        return name;
    }

    public void setName(NameEnum name) {
        this.name = name;
    }

    /**
     * The maximum allowed value for the rate limit.
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * The remaining value before the limit is reached.
     * @return remaining
     */
    public Integer getRemaining() {
        return remaining;
    }

    public void setRemaining(Integer remaining) {
        this.remaining = remaining;
    }

    /**
     * Seconds until the rate limit resets.
     * @return resetSeconds
     */
    public BigDecimal getResetSeconds() {
        return resetSeconds;
    }

    public void setResetSeconds(BigDecimal resetSeconds) {
        this.resetSeconds = resetSeconds;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RealtimeServerEventRateLimitsUpdatedRateLimitsInner {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    remaining: ").append(toIndentedString(remaining)).append("\n");
        sb.append("    resetSeconds: ").append(toIndentedString(resetSeconds)).append("\n");
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

