# ChatCompletionRequestAssistantMessageAudio

Data about a previous audio response from the model.  [Learn more](/docs/guides/audio). 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Unique identifier for a previous audio response from the model.  | 

## Example

```python
from openapiopenai.models.chat_completion_request_assistant_message_audio import ChatCompletionRequestAssistantMessageAudio

# TODO update the JSON string below
json = "{}"
# create an instance of ChatCompletionRequestAssistantMessageAudio from a JSON string
chat_completion_request_assistant_message_audio_instance = ChatCompletionRequestAssistantMessageAudio.from_json(json)
# print the JSON string representation of the object
print(ChatCompletionRequestAssistantMessageAudio.to_json())

# convert the object into a dict
chat_completion_request_assistant_message_audio_dict = chat_completion_request_assistant_message_audio_instance.to_dict()
# create an instance of ChatCompletionRequestAssistantMessageAudio from a dict
chat_completion_request_assistant_message_audio_from_dict = ChatCompletionRequestAssistantMessageAudio.from_dict(chat_completion_request_assistant_message_audio_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


