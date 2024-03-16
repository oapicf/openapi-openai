package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ChatCompletionRequestMessageFunctionCall;

@Canonical
class ChatCompletionStreamResponseDelta {

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

    /* The role of the author of this message. */
    RoleEnum role
    /* The contents of the chunk message. */
    String content
    
    ChatCompletionRequestMessageFunctionCall functionCall
}
