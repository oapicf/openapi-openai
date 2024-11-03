

# ChatCompletionMessageToolCallChunk

The class is defined in **[ChatCompletionMessageToolCallChunk.java](../../src/main/java/org/openapitools/model/ChatCompletionMessageToolCallChunk.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | `Integer` |  | 
**id** | `String` | The ID of the tool call. |  [optional property]
**type** | [**TypeEnum**](#TypeEnum) | The type of the tool. Currently, only &#x60;function&#x60; is supported. |  [optional property]
**function** | [`ChatCompletionMessageToolCallChunkFunction`](ChatCompletionMessageToolCallChunkFunction.md) |  |  [optional property]



## TypeEnum

Name | Value
---- | -----
FUNCTION | `"function"`



