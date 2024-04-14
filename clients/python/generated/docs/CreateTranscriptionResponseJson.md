# CreateTranscriptionResponseJson

Represents a transcription response returned by model, based on the provided input.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**text** | **str** | The transcribed text. | 

## Example

```python
from openapiopenai.models.create_transcription_response_json import CreateTranscriptionResponseJson

# TODO update the JSON string below
json = "{}"
# create an instance of CreateTranscriptionResponseJson from a JSON string
create_transcription_response_json_instance = CreateTranscriptionResponseJson.from_json(json)
# print the JSON string representation of the object
print(CreateTranscriptionResponseJson.to_json())

# convert the object into a dict
create_transcription_response_json_dict = create_transcription_response_json_instance.to_dict()
# create an instance of CreateTranscriptionResponseJson from a dict
create_transcription_response_json_form_dict = create_transcription_response_json.from_dict(create_transcription_response_json_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


