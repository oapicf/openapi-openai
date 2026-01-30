# ChatCompletionRequestMessageContentPartAudioInputAudio


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | **str** | Base64 encoded audio data. | 
**format** | **str** | The format of the encoded audio data. Currently supports \&quot;wav\&quot; and \&quot;mp3\&quot;.  | 

## Example

```python
from openapiopenai.models.chat_completion_request_message_content_part_audio_input_audio import ChatCompletionRequestMessageContentPartAudioInputAudio

# TODO update the JSON string below
json = "{}"
# create an instance of ChatCompletionRequestMessageContentPartAudioInputAudio from a JSON string
chat_completion_request_message_content_part_audio_input_audio_instance = ChatCompletionRequestMessageContentPartAudioInputAudio.from_json(json)
# print the JSON string representation of the object
print(ChatCompletionRequestMessageContentPartAudioInputAudio.to_json())

# convert the object into a dict
chat_completion_request_message_content_part_audio_input_audio_dict = chat_completion_request_message_content_part_audio_input_audio_instance.to_dict()
# create an instance of ChatCompletionRequestMessageContentPartAudioInputAudio from a dict
chat_completion_request_message_content_part_audio_input_audio_from_dict = ChatCompletionRequestMessageContentPartAudioInputAudio.from_dict(chat_completion_request_message_content_part_audio_input_audio_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


