
# Table `CreateCompletionResponse_choices_inner`
(mapped from: CreateCompletionResponseChoicesInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**finishReason** | finish_reason | text NOT NULL |  | [**finish_reason**](#FinishReason) | The reason the model stopped generating tokens. This will be &#x60;stop&#x60; if the model hit a natural stop point or a provided stop sequence, &#x60;length&#x60; if the maximum number of tokens specified in the request was reached, or &#x60;content_filter&#x60; if content was omitted due to a flag from our content filters.  | 
**index** | index | int NOT NULL |  | **kotlin.Int** |  | 
**logprobs** | logprobs | long NOT NULL |  | [**CreateCompletionResponseChoicesInnerLogprobs**](CreateCompletionResponseChoicesInnerLogprobs.md) |  |  [foreignkey]
**text** | text | text NOT NULL |  | **kotlin.String** |  | 






