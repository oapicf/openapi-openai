package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ChatCompletionRequestMessageContentPartImageImageUrl;

@Canonical
class ChatCompletionRequestMessageContentPartImage {

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

    /* The type of the content part. */
    TypeEnum type
    
    ChatCompletionRequestMessageContentPartImageImageUrl imageUrl
}
