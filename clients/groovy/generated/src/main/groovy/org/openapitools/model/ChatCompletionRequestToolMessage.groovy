package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class ChatCompletionRequestToolMessage {

    enum RoleEnum {
    
        TOOL("tool")
    
        private final String value
    
        RoleEnum(String value) {
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

    /* The role of the messages author, in this case `tool`. */
    RoleEnum role
    /* The contents of the tool message. */
    String content
    /* Tool call that this message is responding to. */
    String toolCallId
}
