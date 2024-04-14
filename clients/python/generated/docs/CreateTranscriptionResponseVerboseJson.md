# CreateTranscriptionResponseVerboseJson

Represents a verbose json transcription response returned by model, based on the provided input.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**language** | **str** | The language of the input audio. | 
**duration** | **str** | The duration of the input audio. | 
**text** | **str** | The transcribed text. | 
**words** | [**List[TranscriptionWord]**](TranscriptionWord.md) | Extracted words and their corresponding timestamps. | [optional] 
**segments** | [**List[TranscriptionSegment]**](TranscriptionSegment.md) | Segments of the transcribed text and their corresponding details. | [optional] 

## Example

```python
from openapiopenai.models.create_transcription_response_verbose_json import CreateTranscriptionResponseVerboseJson

# TODO update the JSON string below
json = "{}"
# create an instance of CreateTranscriptionResponseVerboseJson from a JSON string
create_transcription_response_verbose_json_instance = CreateTranscriptionResponseVerboseJson.from_json(json)
# print the JSON string representation of the object
print(CreateTranscriptionResponseVerboseJson.to_json())

# convert the object into a dict
create_transcription_response_verbose_json_dict = create_transcription_response_verbose_json_instance.to_dict()
# create an instance of CreateTranscriptionResponseVerboseJson from a dict
create_transcription_response_verbose_json_form_dict = create_transcription_response_verbose_json.from_dict(create_transcription_response_verbose_json_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


