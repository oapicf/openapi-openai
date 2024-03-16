# CreateTranscriptionResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**text** | **str** |  | 

## Example

```python
from openapiopenai.models.create_transcription_response import CreateTranscriptionResponse

# TODO update the JSON string below
json = "{}"
# create an instance of CreateTranscriptionResponse from a JSON string
create_transcription_response_instance = CreateTranscriptionResponse.from_json(json)
# print the JSON string representation of the object
print(CreateTranscriptionResponse.to_json())

# convert the object into a dict
create_transcription_response_dict = create_transcription_response_instance.to_dict()
# create an instance of CreateTranscriptionResponse from a dict
create_transcription_response_form_dict = create_transcription_response.from_dict(create_transcription_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


