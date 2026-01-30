# ChatCompletionRequestDeveloperMessage

Developer-provided instructions that the model should follow, regardless of messages sent by the user. With o1 models and newer, `developer` messages replace the previous `system` messages. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content** | [**ChatCompletionRequestDeveloperMessageContent**](ChatCompletionRequestDeveloperMessageContent.md) |  | 
**role** | **str** | The role of the messages author, in this case &#x60;developer&#x60;. | 
**name** | **str** | An optional name for the participant. Provides the model information to differentiate between participants of the same role. | [optional] 

## Example

```python
from openapiopenai.models.chat_completion_request_developer_message import ChatCompletionRequestDeveloperMessage

# TODO update the JSON string below
json = "{}"
# create an instance of ChatCompletionRequestDeveloperMessage from a JSON string
chat_completion_request_developer_message_instance = ChatCompletionRequestDeveloperMessage.from_json(json)
# print the JSON string representation of the object
print(ChatCompletionRequestDeveloperMessage.to_json())

# convert the object into a dict
chat_completion_request_developer_message_dict = chat_completion_request_developer_message_instance.to_dict()
# create an instance of ChatCompletionRequestDeveloperMessage from a dict
chat_completion_request_developer_message_from_dict = ChatCompletionRequestDeveloperMessage.from_dict(chat_completion_request_developer_message_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


