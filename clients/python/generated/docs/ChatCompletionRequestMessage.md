# ChatCompletionRequestMessage


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role** | **str** | The role of the messages author. One of &#x60;system&#x60;, &#x60;user&#x60;, &#x60;assistant&#x60;, or &#x60;function&#x60;. | 
**content** | **str** | The contents of the message. &#x60;content&#x60; is required for all messages except assistant messages with function calls. | [optional] 
**name** | **str** | The name of the author of this message. &#x60;name&#x60; is required if role is &#x60;function&#x60;, and it should be the name of the function whose response is in the &#x60;content&#x60;. May contain a-z, A-Z, 0-9, and underscores, with a maximum length of 64 characters. | [optional] 
**function_call** | [**ChatCompletionRequestMessageFunctionCall**](ChatCompletionRequestMessageFunctionCall.md) |  | [optional] 

## Example

```python
from openapiopenai.models.chat_completion_request_message import ChatCompletionRequestMessage

# TODO update the JSON string below
json = "{}"
# create an instance of ChatCompletionRequestMessage from a JSON string
chat_completion_request_message_instance = ChatCompletionRequestMessage.from_json(json)
# print the JSON string representation of the object
print(ChatCompletionRequestMessage.to_json())

# convert the object into a dict
chat_completion_request_message_dict = chat_completion_request_message_instance.to_dict()
# create an instance of ChatCompletionRequestMessage from a dict
chat_completion_request_message_form_dict = chat_completion_request_message.from_dict(chat_completion_request_message_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


