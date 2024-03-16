# ChatCompletionResponseMessage


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role** | **str** | The role of the author of this message. | 
**content** | **str** | The contents of the message. | [optional] 
**function_call** | [**ChatCompletionRequestMessageFunctionCall**](ChatCompletionRequestMessageFunctionCall.md) |  | [optional] 

## Example

```python
from openapiopenai.models.chat_completion_response_message import ChatCompletionResponseMessage

# TODO update the JSON string below
json = "{}"
# create an instance of ChatCompletionResponseMessage from a JSON string
chat_completion_response_message_instance = ChatCompletionResponseMessage.from_json(json)
# print the JSON string representation of the object
print(ChatCompletionResponseMessage.to_json())

# convert the object into a dict
chat_completion_response_message_dict = chat_completion_response_message_instance.to_dict()
# create an instance of ChatCompletionResponseMessage from a dict
chat_completion_response_message_form_dict = chat_completion_response_message.from_dict(chat_completion_response_message_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


