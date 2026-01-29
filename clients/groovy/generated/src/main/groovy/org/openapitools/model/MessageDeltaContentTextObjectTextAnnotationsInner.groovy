package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.MessageDeltaContentTextAnnotationsFileCitationObject;
import org.openapitools.model.MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation;
import org.openapitools.model.MessageDeltaContentTextAnnotationsFilePathObject;
import org.openapitools.model.MessageDeltaContentTextAnnotationsFilePathObjectFilePath;

@Canonical
class MessageDeltaContentTextObjectTextAnnotationsInner {
    /* The index of the annotation in the text content part. */
    Integer index

    enum TypeEnum {
    
        FILE_CITATION("file_citation"),
        
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

    /* Always `file_citation`. */
    TypeEnum type
    /* The text in the message content that needs to be replaced. */
    String text
    
    MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation fileCitation
    
    Integer startIndex
    
    Integer endIndex
    
    MessageDeltaContentTextAnnotationsFilePathObjectFilePath filePath
}
