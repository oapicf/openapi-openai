package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RealtimeResponseCreateParams;

@Canonical
class RealtimeClientEventResponseCreate {
    /* Optional client-generated ID used to identify this event. */
    String eventId

    enum TypeEnum {
    
        RESPONSE_CREATE("response.create")
    
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

    /* The event type, must be `response.create`. */
    TypeEnum type
    
    RealtimeResponseCreateParams response
}
