# CreateTranscriptionRequestModel

ID of the model to use. Only `whisper-1` (which is powered by our open source Whisper V2 model) is currently available. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------

## Example

```python
from openapiopenai.models.create_transcription_request_model import CreateTranscriptionRequestModel

# TODO update the JSON string below
json = "{}"
# create an instance of CreateTranscriptionRequestModel from a JSON string
create_transcription_request_model_instance = CreateTranscriptionRequestModel.from_json(json)
# print the JSON string representation of the object
print(CreateTranscriptionRequestModel.to_json())

# convert the object into a dict
create_transcription_request_model_dict = create_transcription_request_model_instance.to_dict()
# create an instance of CreateTranscriptionRequestModel from a dict
create_transcription_request_model_from_dict = CreateTranscriptionRequestModel.from_dict(create_transcription_request_model_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


