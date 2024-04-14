
# Table `ChatCompletionMessageToolCallChunk`
(mapped from: ChatCompletionMessageToolCallChunk)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**index** | index | int NOT NULL |  | **kotlin.Int** |  | 
**id** | id | text PRIMARY KEY |  | **kotlin.String** | The ID of the tool call. |  [optional]
**type** | type | text |  | [**type**](#Type) | The type of the tool. Currently, only &#x60;function&#x60; is supported. |  [optional]
**function** | function | long |  | [**ChatCompletionMessageToolCallChunkFunction**](ChatCompletionMessageToolCallChunkFunction.md) |  |  [optional] [foreignkey]






