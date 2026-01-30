package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class UploadPart {
    /* The upload Part unique identifier, which can be referenced in API endpoints. */
    String id
    /* The Unix timestamp (in seconds) for when the Part was created. */
    Integer createdAt
    /* The ID of the Upload object that this Part was added to. */
    String uploadId

    enum ObjectEnum {
    
        UPLOAD_PART("upload.part")
    
        private final String value
    
        ObjectEnum(String value) {
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

    /* The object type, which is always `upload.part`. */
    ObjectEnum _object
}
