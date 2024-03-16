package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ChatCompletionStreamResponseDelta;

@Canonical
class CreateChatCompletionStreamResponseChoicesInner {
    
    Integer index
    
    ChatCompletionStreamResponseDelta delta

    enum FinishReasonEnum {
    
        STOP("stop"),
        
        LENGTH("length"),
        
        FUNCTION_CALL("function_call")
    
        private final String value
    
        FinishReasonEnum(String value) {
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

    
    FinishReasonEnum finishReason
}
