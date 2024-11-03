package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.MessageDeltaObjectDelta;

@Canonical
class MessageDeltaObject {
    /* The identifier of the message, which can be referenced in API endpoints. */
    String id

    enum ObjectEnum {
    
        THREAD_MESSAGE_DELTA("thread.message.delta")
    
        private final String value
    
        ObjectEnum(String value) {
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

    /* The object type, which is always `thread.message.delta`. */
    ObjectEnum _object
    
    MessageDeltaObjectDelta delta
}
