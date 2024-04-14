# CreateSpeechRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**model** | [**CreateSpeechRequestModel**](CreateSpeechRequestModel.md) |  | 
**input** | **str** | The text to generate audio for. The maximum length is 4096 characters. | 
**voice** | **str** | The voice to use when generating the audio. Supported voices are &#x60;alloy&#x60;, &#x60;echo&#x60;, &#x60;fable&#x60;, &#x60;onyx&#x60;, &#x60;nova&#x60;, and &#x60;shimmer&#x60;. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech/voice-options). | 
**response_format** | **str** | The format to audio in. Supported formats are &#x60;mp3&#x60;, &#x60;opus&#x60;, &#x60;aac&#x60;, &#x60;flac&#x60;, &#x60;wav&#x60;, and &#x60;pcm&#x60;. | [optional] [default to 'mp3']
**speed** | **float** | The speed of the generated audio. Select a value from &#x60;0.25&#x60; to &#x60;4.0&#x60;. &#x60;1.0&#x60; is the default. | [optional] [default to 1.0]

## Example

```python
from openapiopenai.models.create_speech_request import CreateSpeechRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CreateSpeechRequest from a JSON string
create_speech_request_instance = CreateSpeechRequest.from_json(json)
# print the JSON string representation of the object
print(CreateSpeechRequest.to_json())

# convert the object into a dict
create_speech_request_dict = create_speech_request_instance.to_dict()
# create an instance of CreateSpeechRequest from a dict
create_speech_request_form_dict = create_speech_request.from_dict(create_speech_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


