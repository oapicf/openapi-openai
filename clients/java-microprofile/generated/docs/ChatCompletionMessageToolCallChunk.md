

# ChatCompletionMessageToolCallChunk


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**index** | **Integer** |  |  |
|**id** | **String** | The ID of the tool call. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of the tool. Currently, only &#x60;function&#x60; is supported. |  [optional] |
|**function** | [**ChatCompletionMessageToolCallChunkFunction**](ChatCompletionMessageToolCallChunkFunction.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FUNCTION | &quot;function&quot; |



