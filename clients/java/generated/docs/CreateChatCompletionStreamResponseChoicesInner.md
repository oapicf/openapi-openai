

# CreateChatCompletionStreamResponseChoicesInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**index** | **Integer** |  |  [optional] |
|**delta** | [**ChatCompletionStreamResponseDelta**](ChatCompletionStreamResponseDelta.md) |  |  [optional] |
|**finishReason** | [**FinishReasonEnum**](#FinishReasonEnum) |  |  [optional] |



## Enum: FinishReasonEnum

| Name | Value |
|---- | -----|
| STOP | &quot;stop&quot; |
| LENGTH | &quot;length&quot; |
| FUNCTION_CALL | &quot;function_call&quot; |



