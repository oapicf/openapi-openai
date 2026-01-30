# CreateChatCompletionRequestAudio

Parameters for audio output. Required when audio output is requested with `modalities: [\"audio\"]`. [Learn more](/docs/guides/audio). 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**voice** | **str** | The voice the model uses to respond. Supported voices are &#x60;ash&#x60;, &#x60;ballad&#x60;, &#x60;coral&#x60;, &#x60;sage&#x60;, and &#x60;verse&#x60; (also supported but not recommended are &#x60;alloy&#x60;, &#x60;echo&#x60;, and &#x60;shimmer&#x60;; these voices are less expressive).  | 
**format** | **str** | Specifies the output audio format. Must be one of &#x60;wav&#x60;, &#x60;mp3&#x60;, &#x60;flac&#x60;, &#x60;opus&#x60;, or &#x60;pcm16&#x60;.  | 

## Example

```python
from openapiopenai.models.create_chat_completion_request_audio import CreateChatCompletionRequestAudio

# TODO update the JSON string below
json = "{}"
# create an instance of CreateChatCompletionRequestAudio from a JSON string
create_chat_completion_request_audio_instance = CreateChatCompletionRequestAudio.from_json(json)
# print the JSON string representation of the object
print(CreateChatCompletionRequestAudio.to_json())

# convert the object into a dict
create_chat_completion_request_audio_dict = create_chat_completion_request_audio_instance.to_dict()
# create an instance of CreateChatCompletionRequestAudio from a dict
create_chat_completion_request_audio_from_dict = CreateChatCompletionRequestAudio.from_dict(create_chat_completion_request_audio_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


