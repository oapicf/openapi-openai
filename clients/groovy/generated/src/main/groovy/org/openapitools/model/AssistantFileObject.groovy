package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class AssistantFileObject {
    /* The identifier, which can be referenced in API endpoints. */
    String id

    enum ObjectEnum {
    
        ASSISTANT_FILE("assistant.file")
    
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

    /* The object type, which is always `assistant.file`. */
    ObjectEnum _object
    /* The Unix timestamp (in seconds) for when the assistant file was created. */
    Integer createdAt
    /* The assistant ID that the file is attached to. */
    String assistantId
}
