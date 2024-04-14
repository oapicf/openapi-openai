# ChatCompletionMessageToolCall


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The ID of the tool call. | 
**type** | **str** | The type of the tool. Currently, only &#x60;function&#x60; is supported. | 
**function** | [**ChatCompletionMessageToolCallFunction**](ChatCompletionMessageToolCallFunction.md) |  | 

## Example

```python
from openapiopenai.models.chat_completion_message_tool_call import ChatCompletionMessageToolCall

# TODO update the JSON string below
json = "{}"
# create an instance of ChatCompletionMessageToolCall from a JSON string
chat_completion_message_tool_call_instance = ChatCompletionMessageToolCall.from_json(json)
# print the JSON string representation of the object
print(ChatCompletionMessageToolCall.to_json())

# convert the object into a dict
chat_completion_message_tool_call_dict = chat_completion_message_tool_call_instance.to_dict()
# create an instance of ChatCompletionMessageToolCall from a dict
chat_completion_message_tool_call_form_dict = chat_completion_message_tool_call.from_dict(chat_completion_message_tool_call_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


