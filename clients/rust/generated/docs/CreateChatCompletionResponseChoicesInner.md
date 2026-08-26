# CreateChatCompletionResponseChoicesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**finish_reason** | **FinishReason** | The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, `tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function.  (enum: stop, length, tool_calls, content_filter, function_call) | 
**index** | **i32** | The index of the choice in the list of choices. | 
**message** | [**models::ChatCompletionResponseMessage**](ChatCompletionResponseMessage.md) |  | 
**logprobs** | Option<[**models::CreateChatCompletionResponseChoicesInnerLogprobs**](CreateChatCompletionResponseChoicesInnerLogprobs.md)> |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


