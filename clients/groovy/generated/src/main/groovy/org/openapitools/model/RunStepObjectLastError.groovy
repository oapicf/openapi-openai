package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class RunStepObjectLastError {

    enum CodeEnum {
    
        SERVER_ERROR("server_error"),
        
        RATE_LIMIT_EXCEEDED("rate_limit_exceeded")
    
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

    /* One of `server_error` or `rate_limit_exceeded`. */
    CodeEnum code
    /* A human-readable description of the error. */
    String message
}
