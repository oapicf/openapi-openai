package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.MessageDeltaContentImageFileObject;
import org.openapitools.model.MessageDeltaContentImageFileObjectImageFile;
import org.openapitools.model.MessageDeltaContentTextObject;
import org.openapitools.model.MessageDeltaContentTextObjectText;

@Canonical
class MessageDeltaObjectDeltaContentInner {
    /* The index of the content part in the message. */
    Integer index

    enum TypeEnum {
    
        IMAGE_FILE("image_file"),
        
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

    /* Always `image_file`. */
    TypeEnum type
    
    MessageDeltaContentImageFileObjectImageFile imageFile
    
    MessageDeltaContentTextObjectText text
}
