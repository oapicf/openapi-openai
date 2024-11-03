package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ChatCompletionResponseMessage;

@Canonical
class CreateChatCompletionFunctionResponseChoicesInner {

    enum FinishReasonEnum {
    
        STOP("stop"),
        
        LENGTH("length"),
        
        FUNCTION_CALL("function_call"),
        
        CONTENT_FILTER("content_filter")
    
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

    /* The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, or `function_call` if the model called a function.  */
    FinishReasonEnum finishReason
    /* The index of the choice in the list of choices. */
    Integer index
    
    ChatCompletionResponseMessage message
}
