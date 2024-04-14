package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class MessageFileObject {
    /* The identifier, which can be referenced in API endpoints. */
    String id

    enum ObjectEnum {
    
        THREAD_MESSAGE_FILE("thread.message.file")
    
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

    /* The object type, which is always `thread.message.file`. */
    ObjectEnum _object
    /* The Unix timestamp (in seconds) for when the message file was created. */
    Integer createdAt
    /* The ID of the [message](/docs/api-reference/messages) that the [File](/docs/api-reference/files) is attached to. */
    String messageId
}
