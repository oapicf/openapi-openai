# ChatCompletionRequestMessageContentPartAudio

Learn about [audio inputs](/docs/guides/audio). 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | The type of the content part. Always &#x60;input_audio&#x60;. | 
**input_audio** | [**ChatCompletionRequestMessageContentPartAudioInputAudio**](ChatCompletionRequestMessageContentPartAudioInputAudio.md) |  | 

## Example

```python
from openapiopenai.models.chat_completion_request_message_content_part_audio import ChatCompletionRequestMessageContentPartAudio

# TODO update the JSON string below
json = "{}"
# create an instance of ChatCompletionRequestMessageContentPartAudio from a JSON string
chat_completion_request_message_content_part_audio_instance = ChatCompletionRequestMessageContentPartAudio.from_json(json)
# print the JSON string representation of the object
print(ChatCompletionRequestMessageContentPartAudio.to_json())

# convert the object into a dict
chat_completion_request_message_content_part_audio_dict = chat_completion_request_message_content_part_audio_instance.to_dict()
# create an instance of ChatCompletionRequestMessageContentPartAudio from a dict
chat_completion_request_message_content_part_audio_from_dict = ChatCompletionRequestMessageContentPartAudio.from_dict(chat_completion_request_message_content_part_audio_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


