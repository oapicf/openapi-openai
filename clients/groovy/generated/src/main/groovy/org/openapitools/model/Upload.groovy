package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OpenAIFile;

@Canonical
class Upload {
    /* The Upload unique identifier, which can be referenced in API endpoints. */
    String id
    /* The Unix timestamp (in seconds) for when the Upload was created. */
    Integer createdAt
    /* The name of the file to be uploaded. */
    String filename
    /* The intended number of bytes to be uploaded. */
    Integer bytes
    /* The intended purpose of the file. [Please refer here](/docs/api-reference/files/object#files/object-purpose) for acceptable values. */
    String purpose

    enum StatusEnum {
    
        PENDING("pending"),
        
        COMPLETED("completed"),
        
        CANCELLED("cancelled"),
        
        EXPIRED("expired")
    
        private final String value
    
        StatusEnum(String value) {
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

    /* The status of the Upload. */
    StatusEnum status
    /* The Unix timestamp (in seconds) for when the Upload was created. */
    Integer expiresAt

    enum ObjectEnum {
    
        UPLOAD("upload")
    
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

    /* The object type, which is always \"upload\". */
    ObjectEnum _object
    
    OpenAIFile _file
}
