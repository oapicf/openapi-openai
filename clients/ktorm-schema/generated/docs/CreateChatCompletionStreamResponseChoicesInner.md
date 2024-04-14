
# Table `CreateChatCompletionStreamResponse_choices_inner`
(mapped from: CreateChatCompletionStreamResponseChoicesInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**delta** | delta | long NOT NULL |  | [**ChatCompletionStreamResponseDelta**](ChatCompletionStreamResponseDelta.md) |  |  [foreignkey]
**finishReason** | finish_reason | text NOT NULL |  | [**finish_reason**](#FinishReason) | The reason the model stopped generating tokens. This will be &#x60;stop&#x60; if the model hit a natural stop point or a provided stop sequence, &#x60;length&#x60; if the maximum number of tokens specified in the request was reached, &#x60;content_filter&#x60; if content was omitted due to a flag from our content filters, &#x60;tool_calls&#x60; if the model called a tool, or &#x60;function_call&#x60; (deprecated) if the model called a function.  | 
**index** | index | int NOT NULL |  | **kotlin.Int** | The index of the choice in the list of choices. | 
**logprobs** | logprobs | long |  | [**CreateChatCompletionResponseChoicesInnerLogprobs**](CreateChatCompletionResponseChoicesInnerLogprobs.md) |  |  [optional] [foreignkey]






