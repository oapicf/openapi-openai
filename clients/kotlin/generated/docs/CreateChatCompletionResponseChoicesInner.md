
# CreateChatCompletionResponseChoicesInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **finishReason** | [**inline**](#FinishReason) | The reason the model stopped generating tokens. This will be &#x60;stop&#x60; if the model hit a natural stop point or a provided stop sequence, &#x60;length&#x60; if the maximum number of tokens specified in the request was reached, &#x60;content_filter&#x60; if content was omitted due to a flag from our content filters, &#x60;tool_calls&#x60; if the model called a tool, or &#x60;function_call&#x60; (deprecated) if the model called a function.  |  |
| **index** | **kotlin.Int** | The index of the choice in the list of choices. |  |
| **message** | [**ChatCompletionResponseMessage**](ChatCompletionResponseMessage.md) |  |  |
| **logprobs** | [**CreateChatCompletionResponseChoicesInnerLogprobs**](CreateChatCompletionResponseChoicesInnerLogprobs.md) |  |  |


<a id="FinishReason"></a>
## Enum: finish_reason
| Name | Value |
| ---- | ----- |
| finishReason | stop, length, tool_calls, content_filter, function_call |



