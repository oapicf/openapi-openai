# ChatCompletionRequestToolMessage


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role** | **str** | The role of the messages author, in this case &#x60;tool&#x60;. | 
**content** | **str** | The contents of the tool message. | 
**tool_call_id** | **str** | Tool call that this message is responding to. | 

## Example

```python
from openapiopenai.models.chat_completion_request_tool_message import ChatCompletionRequestToolMessage

# TODO update the JSON string below
json = "{}"
# create an instance of ChatCompletionRequestToolMessage from a JSON string
chat_completion_request_tool_message_instance = ChatCompletionRequestToolMessage.from_json(json)
# print the JSON string representation of the object
print(ChatCompletionRequestToolMessage.to_json())

# convert the object into a dict
chat_completion_request_tool_message_dict = chat_completion_request_tool_message_instance.to_dict()
# create an instance of ChatCompletionRequestToolMessage from a dict
chat_completion_request_tool_message_form_dict = chat_completion_request_tool_message.from_dict(chat_completion_request_tool_message_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


