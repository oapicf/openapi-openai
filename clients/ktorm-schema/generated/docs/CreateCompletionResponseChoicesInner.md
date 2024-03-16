
# Table `CreateCompletionResponse_choices_inner`
(mapped from: CreateCompletionResponseChoicesInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**text** | text | text NOT NULL |  | **kotlin.String** |  | 
**index** | index | int NOT NULL |  | **kotlin.Int** |  | 
**logprobs** | logprobs | long NOT NULL |  | [**CreateCompletionResponseChoicesInnerLogprobs**](CreateCompletionResponseChoicesInnerLogprobs.md) |  |  [foreignkey]
**finishReason** | finish_reason | text NOT NULL |  | [**finish_reason**](#FinishReason) |  | 






