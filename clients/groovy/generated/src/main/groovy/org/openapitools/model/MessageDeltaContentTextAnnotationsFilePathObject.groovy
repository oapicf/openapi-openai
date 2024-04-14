package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.MessageDeltaContentTextAnnotationsFilePathObjectFilePath;

@Canonical
class MessageDeltaContentTextAnnotationsFilePathObject {
    /* The index of the annotation in the text content part. */
    Integer index

    enum TypeEnum {
    
        FILE_PATH("file_path")
    
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

    /* Always `file_path`. */
    TypeEnum type
    /* The text in the message content that needs to be replaced. */
    String text
    
    MessageDeltaContentTextAnnotationsFilePathObjectFilePath filePath
    
    Integer startIndex
    
    Integer endIndex
}
