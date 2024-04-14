# ChatCompletionMessageToolCallChunk


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **int** |  | 
**id** | **str** | The ID of the tool call. | [optional] 
**type** | **str** | The type of the tool. Currently, only &#x60;function&#x60; is supported. | [optional] 
**function** | [**ChatCompletionMessageToolCallChunkFunction**](ChatCompletionMessageToolCallChunkFunction.md) |  | [optional] 

## Example

```python
from openapiopenai.models.chat_completion_message_tool_call_chunk import ChatCompletionMessageToolCallChunk

# TODO update the JSON string below
json = "{}"
# create an instance of ChatCompletionMessageToolCallChunk from a JSON string
chat_completion_message_tool_call_chunk_instance = ChatCompletionMessageToolCallChunk.from_json(json)
# print the JSON string representation of the object
print(ChatCompletionMessageToolCallChunk.to_json())

# convert the object into a dict
chat_completion_message_tool_call_chunk_dict = chat_completion_message_tool_call_chunk_instance.to_dict()
# create an instance of ChatCompletionMessageToolCallChunk from a dict
chat_completion_message_tool_call_chunk_form_dict = chat_completion_message_tool_call_chunk.from_dict(chat_completion_message_tool_call_chunk_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


