package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class CreateUploadRequest {
    /* The name of the file to upload.  */
    String filename

    enum PurposeEnum {
    
        ASSISTANTS("assistants"),
        
        BATCH("batch"),
        
        FINE_TUNE("fine-tune"),
        
        VISION("vision")
    
        private final String value
    
        PurposeEnum(String value) {
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

    /* The intended purpose of the uploaded file.  See the [documentation on File purposes](/docs/api-reference/files/create#files-create-purpose).  */
    PurposeEnum purpose
    /* The number of bytes in the file you are uploading.  */
    Integer bytes
    /* The MIME type of the file.  This must fall within the supported MIME types for your file purpose. See the supported MIME types for assistants and vision.  */
    String mimeType
}
