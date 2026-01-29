package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class DeleteAssistantFileResponse {
    
    String id
    
    Boolean deleted

    enum ObjectEnum {
    
        ASSISTANT_FILE_DELETED("assistant.file.deleted")
    
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

    
    ObjectEnum _object
}
