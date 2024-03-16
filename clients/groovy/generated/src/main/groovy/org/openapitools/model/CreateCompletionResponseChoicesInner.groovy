package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CreateCompletionResponseChoicesInnerLogprobs;

@Canonical
class CreateCompletionResponseChoicesInner {
    
    String text
    
    Integer index
    
    CreateCompletionResponseChoicesInnerLogprobs logprobs

    enum FinishReasonEnum {
    
        STOP("stop"),
        
        LENGTH("length")
    
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
