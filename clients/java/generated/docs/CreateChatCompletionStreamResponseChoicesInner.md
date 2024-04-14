

# CreateChatCompletionStreamResponseChoicesInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**delta** | [**ChatCompletionStreamResponseDelta**](ChatCompletionStreamResponseDelta.md) |  |  |
|**logprobs** | [**CreateChatCompletionResponseChoicesInnerLogprobs**](CreateChatCompletionResponseChoicesInnerLogprobs.md) |  |  [optional] |
|**finishReason** | [**FinishReasonEnum**](#FinishReasonEnum) | The reason the model stopped generating tokens. This will be &#x60;stop&#x60; if the model hit a natural stop point or a provided stop sequence, &#x60;length&#x60; if the maximum number of tokens specified in the request was reached, &#x60;content_filter&#x60; if content was omitted due to a flag from our content filters, &#x60;tool_calls&#x60; if the model called a tool, or &#x60;function_call&#x60; (deprecated) if the model called a function.  |  |
|**index** | **Integer** | The index of the choice in the list of choices. |  |



## Enum: FinishReasonEnum

| Name | Value |
|---- | -----|
| STOP | &quot;stop&quot; |
| LENGTH | &quot;length&quot; |
| TOOL_CALLS | &quot;tool_calls&quot; |
| CONTENT_FILTER | &quot;content_filter&quot; |
| FUNCTION_CALL | &quot;function_call&quot; |



