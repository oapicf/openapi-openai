package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.MessageDeltaContentImageUrlObjectImageUrl;

@Canonical
class MessageDeltaContentImageUrlObject {
    /* The index of the content part in the message. */
    Integer index

    enum TypeEnum {
    
        IMAGE_URL("image_url")
    
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

    /* Always `image_url`. */
    TypeEnum type
    
    MessageDeltaContentImageUrlObjectImageUrl imageUrl
}
