package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class RealtimeClientEventResponseCancel {
    /* Optional client-generated ID used to identify this event. */
    String eventId

    enum TypeEnum {
    
        RESPONSE_CANCEL("response.cancel")
    
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

    /* The event type, must be `response.cancel`. */
    TypeEnum type
    /* A specific response ID to cancel - if not provided, will cancel an  in-progress response in the default conversation.  */
    String responseId
}
