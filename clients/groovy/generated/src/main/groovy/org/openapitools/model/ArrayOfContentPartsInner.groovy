package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.MessageContentImageFileObject;
import org.openapitools.model.MessageContentImageFileObjectImageFile;
import org.openapitools.model.MessageContentImageUrlObject;
import org.openapitools.model.MessageContentImageUrlObjectImageUrl;
import org.openapitools.model.MessageRequestContentTextObject;

@Canonical
class ArrayOfContentPartsInner {

    enum TypeEnum {
    
        IMAGE_FILE("image_file"),
        
        IMAGE_URL("image_url"),
        
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
    
    MessageContentImageFileObjectImageFile imageFile
    
    MessageContentImageUrlObjectImageUrl imageUrl
    /* Text content to be sent to the model */
    String text
}
