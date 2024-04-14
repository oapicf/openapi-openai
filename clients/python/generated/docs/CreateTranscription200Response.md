# CreateTranscription200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**text** | **str** | The transcribed text. | 
**language** | **str** | The language of the input audio. | 
**duration** | **str** | The duration of the input audio. | 
**words** | [**List[TranscriptionWord]**](TranscriptionWord.md) | Extracted words and their corresponding timestamps. | [optional] 
**segments** | [**List[TranscriptionSegment]**](TranscriptionSegment.md) | Segments of the transcribed text and their corresponding details. | [optional] 

## Example

```python
from openapiopenai.models.create_transcription200_response import CreateTranscription200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CreateTranscription200Response from a JSON string
create_transcription200_response_instance = CreateTranscription200Response.from_json(json)
# print the JSON string representation of the object
print(CreateTranscription200Response.to_json())

# convert the object into a dict
create_transcription200_response_dict = create_transcription200_response_instance.to_dict()
# create an instance of CreateTranscription200Response from a dict
create_transcription200_response_form_dict = create_transcription200_response.from_dict(create_transcription200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


