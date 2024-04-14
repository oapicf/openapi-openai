package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ChatCompletionMessageToolCallChunk;
import org.openapitools.model.ChatCompletionStreamResponseDeltaFunctionCall;

@Canonical
class ChatCompletionStreamResponseDelta {
    /* The contents of the chunk message. */
    String content
    
    ChatCompletionStreamResponseDeltaFunctionCall functionCall
    
    List<ChatCompletionMessageToolCallChunk> toolCalls

    enum RoleEnum {
    
        SYSTEM("system"),
        
        USER("user"),
        
        ASSISTANT("assistant"),
        
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

    /* The role of the author of this message. */
    RoleEnum role
}
