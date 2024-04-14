# openapi::ChatCompletionMessageToolCallChunk


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **integer** |  | 
**id** | **character** | The ID of the tool call. | [optional] 
**type** | **character** | The type of the tool. Currently, only &#x60;function&#x60; is supported. | [optional] [Enum: [function]] 
**function** | [**ChatCompletionMessageToolCallChunkFunction**](ChatCompletionMessageToolCallChunk_function.md) |  | [optional] 


