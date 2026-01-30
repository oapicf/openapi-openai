package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class MessageDeltaContentImageFileObjectImageFile {
    /* The [File](/docs/api-reference/files) ID of the image in the message content. Set `purpose=\"vision\"` when uploading the File if you need to later display the file content. */
    String fileId

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

    /* Specifies the detail level of the image if specified by the user. `low` uses fewer tokens, you can opt in to high resolution using `high`. */
    DetailEnum detail = DetailEnum.AUTO
}
