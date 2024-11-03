package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class MessageObjectIncompleteDetails {

    enum ReasonEnum {
    
        CONTENT_FILTER("content_filter"),
        
        MAX_TOKENS("max_tokens"),
        
        RUN_CANCELLED("run_cancelled"),
        
        RUN_EXPIRED("run_expired"),
        
        RUN_FAILED("run_failed")
    
        private final String value
    
        ReasonEnum(String value) {
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

    /* The reason the message is incomplete. */
    ReasonEnum reason
}
