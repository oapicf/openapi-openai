package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.MessageDeltaContentTextObjectText;

@Canonical
class MessageDeltaContentTextObject {
    /* The index of the content part in the message. */
    Integer index

    enum TypeEnum {
    
        TEXT("text")
    
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

    /* Always `text`. */
    TypeEnum type
    
    MessageDeltaContentTextObjectText text
}
