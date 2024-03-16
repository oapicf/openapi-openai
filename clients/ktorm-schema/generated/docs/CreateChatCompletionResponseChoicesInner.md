
# Table `CreateChatCompletionResponse_choices_inner`
(mapped from: CreateChatCompletionResponseChoicesInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**index** | index | int |  | **kotlin.Int** |  |  [optional]
**message** | message | long |  | [**ChatCompletionResponseMessage**](ChatCompletionResponseMessage.md) |  |  [optional] [foreignkey]
**finishReason** | finish_reason | text |  | [**finish_reason**](#FinishReason) |  |  [optional]





