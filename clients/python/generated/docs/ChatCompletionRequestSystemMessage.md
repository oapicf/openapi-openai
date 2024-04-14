# ChatCompletionRequestSystemMessage


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content** | **str** | The contents of the system message. | 
**role** | **str** | The role of the messages author, in this case &#x60;system&#x60;. | 
**name** | **str** | An optional name for the participant. Provides the model information to differentiate between participants of the same role. | [optional] 

## Example

```python
from openapiopenai.models.chat_completion_request_system_message import ChatCompletionRequestSystemMessage

# TODO update the JSON string below
json = "{}"
# create an instance of ChatCompletionRequestSystemMessage from a JSON string
chat_completion_request_system_message_instance = ChatCompletionRequestSystemMessage.from_json(json)
# print the JSON string representation of the object
print(ChatCompletionRequestSystemMessage.to_json())

# convert the object into a dict
chat_completion_request_system_message_dict = chat_completion_request_system_message_instance.to_dict()
# create an instance of ChatCompletionRequestSystemMessage from a dict
chat_completion_request_system_message_form_dict = chat_completion_request_system_message.from_dict(chat_completion_request_system_message_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


