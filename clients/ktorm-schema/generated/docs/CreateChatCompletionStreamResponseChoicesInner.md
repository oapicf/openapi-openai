
# Table `CreateChatCompletionStreamResponse_choices_inner`
(mapped from: CreateChatCompletionStreamResponseChoicesInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**index** | index | int |  | **kotlin.Int** |  |  [optional]
**delta** | delta | long |  | [**ChatCompletionStreamResponseDelta**](ChatCompletionStreamResponseDelta.md) |  |  [optional] [foreignkey]
**finishReason** | finish_reason | text |  | [**finish_reason**](#FinishReason) |  |  [optional]





