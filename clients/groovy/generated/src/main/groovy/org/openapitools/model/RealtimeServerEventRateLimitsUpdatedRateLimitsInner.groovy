package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

@Canonical
class RealtimeServerEventRateLimitsUpdatedRateLimitsInner {

    enum NameEnum {
    
        REQUESTS("requests"),
        
        TOKENS("tokens")
    
        private final String value
    
        NameEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    /* The name of the rate limit (`requests`, `tokens`).  */
    NameEnum name
    /* The maximum allowed value for the rate limit. */
    Integer limit
    /* The remaining value before the limit is reached. */
    Integer remaining
    /* Seconds until the rate limit resets. */
    BigDecimal resetSeconds
}
