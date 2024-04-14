package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class RunObjectLastError {

    enum CodeEnum {
    
        SERVER_ERROR("server_error"),
        
        RATE_LIMIT_EXCEEDED("rate_limit_exceeded"),
        
        INVALID_PROMPT("invalid_prompt")
    
        private final String value
    
        CodeEnum(String value) {
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

    /* One of `server_error`, `rate_limit_exceeded`, or `invalid_prompt`. */
    CodeEnum code
    /* A human-readable description of the error. */
    String message
}
