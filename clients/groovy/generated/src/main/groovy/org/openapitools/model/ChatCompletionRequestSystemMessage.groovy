package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class ChatCompletionRequestSystemMessage {
    /* The contents of the system message. */
    String content

    enum RoleEnum {
    
        SYSTEM("system")
    
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

    /* The role of the messages author, in this case `system`. */
    RoleEnum role
    /* An optional name for the participant. Provides the model information to differentiate between participants of the same role. */
    String name
}
