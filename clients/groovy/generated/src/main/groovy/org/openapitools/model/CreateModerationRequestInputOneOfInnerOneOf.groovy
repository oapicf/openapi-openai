package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CreateModerationRequestInputOneOfInnerOneOfImageUrl;

@Canonical
class CreateModerationRequestInputOneOfInnerOneOf {

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
    
    CreateModerationRequestInputOneOfInnerOneOfImageUrl imageUrl
}
