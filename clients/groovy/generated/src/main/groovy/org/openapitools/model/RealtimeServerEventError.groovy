package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RealtimeServerEventErrorError;

@Canonical
class RealtimeServerEventError {
    /* The unique ID of the server event. */
    String eventId

    enum TypeEnum {
    
        ERROR("error")
    
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

    /* The event type, must be `error`. */
    TypeEnum type
    
    RealtimeServerEventErrorError error
}
