package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.MessageContentTextAnnotationsFileCitationObject;
import org.openapitools.model.MessageContentTextAnnotationsFileCitationObjectFileCitation;
import org.openapitools.model.MessageContentTextAnnotationsFilePathObject;
import org.openapitools.model.MessageContentTextAnnotationsFilePathObjectFilePath;

@Canonical
class MessageContentTextObjectTextAnnotationsInner {

    enum TypeEnum {
    
        CITATION("file_citation"),
        
        PATH("file_path")
    
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
    
    MessageContentTextAnnotationsFileCitationObjectFileCitation fileCitation
    
    Integer startIndex
    
    Integer endIndex
    
    MessageContentTextAnnotationsFilePathObjectFilePath filePath
}
