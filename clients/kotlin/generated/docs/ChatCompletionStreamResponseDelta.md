
# ChatCompletionStreamResponseDelta

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content** | **kotlin.String** | The contents of the chunk message. |  [optional]
**functionCall** | [**ChatCompletionStreamResponseDeltaFunctionCall**](ChatCompletionStreamResponseDeltaFunctionCall.md) |  |  [optional]
**toolCalls** | [**kotlin.collections.List&lt;ChatCompletionMessageToolCallChunk&gt;**](ChatCompletionMessageToolCallChunk.md) |  |  [optional]
**role** | [**inline**](#Role) | The role of the author of this message. |  [optional]


<a id="Role"></a>
## Enum: role
Name | Value
---- | -----
role | system, user, assistant, tool



