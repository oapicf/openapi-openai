package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;

@Canonical
class MessageContentImageUrlObjectImageUrl {
    /* The external URL of the image, must be a supported image types: jpeg, jpg, png, gif, webp. */
    URI url

    enum DetailEnum {
    
        AUTO("auto"),
        
        LOW("low"),
        
        HIGH("high")
    
        private final String value
    
        DetailEnum(String value) {
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

    /* Specifies the detail level of the image. `low` uses fewer tokens, you can opt in to high resolution using `high`. Default value is `auto` */
    DetailEnum detail = DetailEnum.AUTO
}
