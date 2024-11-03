package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.MessageContentTextAnnotationsFileCitationObjectFileCitation;

@Canonical
class MessageContentTextAnnotationsFileCitationObject {

    enum TypeEnum {
    
        FILE_CITATION("file_citation")
    
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
}
