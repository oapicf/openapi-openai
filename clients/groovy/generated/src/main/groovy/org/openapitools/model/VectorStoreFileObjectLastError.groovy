package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class VectorStoreFileObjectLastError {

    enum CodeEnum {
    
        SERVER_ERROR("server_error"),
        
        UNSUPPORTED_FILE("unsupported_file"),
        
        INVALID_FILE("invalid_file")
    
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
