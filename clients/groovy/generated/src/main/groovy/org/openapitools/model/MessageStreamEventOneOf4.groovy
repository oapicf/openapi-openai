package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.MessageObject;

@Canonical
class MessageStreamEventOneOf4 {

    enum EventEnum {
    
        THREAD_MESSAGE_INCOMPLETE("thread.message.incomplete")
    
        private final String value
    
        EventEnum(String value) {
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

    
    EventEnum event
    
    MessageObject data
}
