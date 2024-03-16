package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ChatCompletionRequestMessageFunctionCall;

@Canonical
class ChatCompletionRequestMessage {

    enum RoleEnum {
    
        SYSTEM("system"),
        
        USER("user"),
        
        ASSISTANT("assistant"),
        
        FUNCTION("function")
    
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

    /* The role of the messages author. One of `system`, `user`, `assistant`, or `function`. */
    RoleEnum role
    /* The contents of the message. `content` is required for all messages except assistant messages with function calls. */
    String content
    /* The name of the author of this message. `name` is required if role is `function`, and it should be the name of the function whose response is in the `content`. May contain a-z, A-Z, 0-9, and underscores, with a maximum length of 64 characters. */
    String name
    
    ChatCompletionRequestMessageFunctionCall functionCall
}
