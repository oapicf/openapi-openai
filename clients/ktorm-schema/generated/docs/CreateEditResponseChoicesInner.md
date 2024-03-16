
# Table `CreateEditResponse_choices_inner`
(mapped from: CreateEditResponseChoicesInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**text** | text | text |  | **kotlin.String** |  |  [optional]
**index** | index | int |  | **kotlin.Int** |  |  [optional]
**logprobs** | logprobs | long |  | [**CreateCompletionResponseChoicesInnerLogprobs**](CreateCompletionResponseChoicesInnerLogprobs.md) |  |  [optional] [foreignkey]
**finishReason** | finish_reason | text |  | [**finish_reason**](#FinishReason) |  |  [optional]






