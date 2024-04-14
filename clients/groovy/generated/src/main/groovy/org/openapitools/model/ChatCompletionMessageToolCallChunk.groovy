package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ChatCompletionMessageToolCallChunkFunction;

@Canonical
class ChatCompletionMessageToolCallChunk {
    
    Integer index
    /* The ID of the tool call. */
    String id

    enum TypeEnum {
    
        FUNCTION("function")
    
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

    /* The type of the tool. Currently, only `function` is supported. */
    TypeEnum type
    
    ChatCompletionMessageToolCallChunkFunction function
}
