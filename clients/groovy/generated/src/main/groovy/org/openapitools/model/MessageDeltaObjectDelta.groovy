package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.MessageDeltaObjectDeltaContentInner;

@Canonical
class MessageDeltaObjectDelta {

    enum RoleEnum {
    
        USER("user"),
        
        ASSISTANT("assistant")
    
        private final String value
    
        RoleEnum(String value) {
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

    /* The entity that produced the message. One of `user` or `assistant`. */
    RoleEnum role
    /* The content of the message in array of text and/or images. */
    List<MessageDeltaObjectDeltaContentInner> content = new ArrayList<>()
}
