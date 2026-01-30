package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.MessageContentImageFileObject;
import org.openapitools.model.MessageContentImageFileObjectImageFile;
import org.openapitools.model.MessageContentImageUrlObject;
import org.openapitools.model.MessageContentImageUrlObjectImageUrl;
import org.openapitools.model.MessageContentRefusalObject;
import org.openapitools.model.MessageContentTextObject;
import org.openapitools.model.MessageContentTextObjectText;

@Canonical
class MessageObjectContentInner {

    enum TypeEnum {
    
        IMAGE_FILE("image_file"),
        
        IMAGE_URL("image_url"),
        
        TEXT("text"),
        
        REFUSAL("refusal")
    
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
    
    MessageContentImageFileObjectImageFile imageFile
    
    MessageContentImageUrlObjectImageUrl imageUrl
    
    MessageContentTextObjectText text
    
    String refusal
}
