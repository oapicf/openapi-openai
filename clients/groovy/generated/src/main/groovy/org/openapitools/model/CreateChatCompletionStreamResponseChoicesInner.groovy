package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ChatCompletionStreamResponseDelta;
import org.openapitools.model.CreateChatCompletionResponseChoicesInnerLogprobs;

@Canonical
class CreateChatCompletionStreamResponseChoicesInner {
    
    ChatCompletionStreamResponseDelta delta
    
    CreateChatCompletionResponseChoicesInnerLogprobs logprobs

    enum FinishReasonEnum {
    
        STOP("stop"),
        
        LENGTH("length"),
        
        TOOL_CALLS("tool_calls"),
        
        CONTENT_FILTER("content_filter"),
        
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

    /* The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, `tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function.  */
    FinishReasonEnum finishReason
    /* The index of the choice in the list of choices. */
    Integer index
}
