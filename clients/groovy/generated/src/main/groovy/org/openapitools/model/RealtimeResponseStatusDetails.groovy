package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RealtimeResponseStatusDetailsError;

@Canonical
class RealtimeResponseStatusDetails {

    enum TypeEnum {
    
        COMPLETED("completed"),
        
        CANCELLED("cancelled"),
        
        FAILED("failed"),
        
        INCOMPLETE("incomplete")
    
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

    /* The type of error that caused the response to fail, corresponding  with the `status` field (`completed`, `cancelled`, `incomplete`,  `failed`).  */
    TypeEnum type

    enum ReasonEnum {
    
        TURN_DETECTED("turn_detected"),
        
        CLIENT_CANCELLED("client_cancelled"),
        
        MAX_OUTPUT_TOKENS("max_output_tokens"),
        
        CONTENT_FILTER("content_filter")
    
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

    /* The reason the Response did not complete. For a `cancelled` Response,  one of `turn_detected` (the server VAD detected a new start of speech)  or `client_cancelled` (the client sent a cancel event). For an  `incomplete` Response, one of `max_output_tokens` or `content_filter`  (the server-side safety filter activated and cut off the response).  */
    ReasonEnum reason
    
    RealtimeResponseStatusDetailsError error
}
