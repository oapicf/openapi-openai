package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.RealtimeServerEventRateLimitsUpdatedRateLimitsInner;

@Canonical
class RealtimeServerEventRateLimitsUpdated {
    /* The unique ID of the server event. */
    String eventId

    enum TypeEnum {
    
        RATE_LIMITS_UPDATED("rate_limits.updated")
    
        private final String value
    
        TypeEnum(String value) {
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

    /* The event type, must be `rate_limits.updated`. */
    TypeEnum type
    /* List of rate limit information. */
    List<RealtimeServerEventRateLimitsUpdatedRateLimitsInner> rateLimits = new ArrayList<>()
}
