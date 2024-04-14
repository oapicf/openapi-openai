package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ChatCompletionRequestUserMessageContent;

@Canonical
class ChatCompletionRequestUserMessage {
    
    ChatCompletionRequestUserMessageContent content

    enum RoleEnum {
    
        USER("user")
    
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

    /* The role of the messages author, in this case `user`. */
    RoleEnum role
    /* An optional name for the participant. Provides the model information to differentiate between participants of the same role. */
    String name
}
