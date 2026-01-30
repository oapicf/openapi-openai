package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RealtimeSession;

@Canonical
class RealtimeServerEventSessionUpdated {
    /* The unique ID of the server event. */
    String eventId

    enum TypeEnum {
    
        SESSION_UPDATED("session.updated")
    
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

    /* The event type, must be `session.updated`. */
    TypeEnum type
    
    RealtimeSession session
}
