
# Table `CreateChatCompletionFunctionResponse_choices_inner`
(mapped from: CreateChatCompletionFunctionResponseChoicesInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**finishReason** | finish_reason | text NOT NULL |  | [**finish_reason**](#FinishReason) | The reason the model stopped generating tokens. This will be &#x60;stop&#x60; if the model hit a natural stop point or a provided stop sequence, &#x60;length&#x60; if the maximum number of tokens specified in the request was reached, &#x60;content_filter&#x60; if content was omitted due to a flag from our content filters, or &#x60;function_call&#x60; if the model called a function.  | 
**index** | index | int NOT NULL |  | **kotlin.Int** | The index of the choice in the list of choices. | 
**message** | message | long NOT NULL |  | [**ChatCompletionResponseMessage**](ChatCompletionResponseMessage.md) |  |  [foreignkey]





