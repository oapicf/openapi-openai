

# CreateChatCompletionStreamResponseChoicesInner

The class is defined in **[CreateChatCompletionStreamResponseChoicesInner.java](../../src/main/java/org/openapitools/model/CreateChatCompletionStreamResponseChoicesInner.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | `Integer` |  |  [optional property]
**delta** | [`ChatCompletionStreamResponseDelta`](ChatCompletionStreamResponseDelta.md) |  |  [optional property]
**finishReason** | [**FinishReasonEnum**](#FinishReasonEnum) |  |  [optional property]



## FinishReasonEnum

Name | Value
---- | -----
STOP | `"stop"`
LENGTH | `"length"`
FUNCTION_CALL | `"function_call"`


