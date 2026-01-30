package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;

@Canonical
class ChatCompletionRequestMessageContentPartImageImageUrl {
    /* Either a URL of the image or the base64 encoded image data. */
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

    /* Specifies the detail level of the image. Learn more in the [Vision guide](/docs/guides/vision#low-or-high-fidelity-image-understanding). */
    DetailEnum detail = DetailEnum.AUTO
}
