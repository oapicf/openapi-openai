# CreateSpeechRequestModel

One of the available [TTS models](/docs/models/tts): `tts-1` or `tts-1-hd` 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------

## Example

```python
from openapiopenai.models.create_speech_request_model import CreateSpeechRequestModel

# TODO update the JSON string below
json = "{}"
# create an instance of CreateSpeechRequestModel from a JSON string
create_speech_request_model_instance = CreateSpeechRequestModel.from_json(json)
# print the JSON string representation of the object
print(CreateSpeechRequestModel.to_json())

# convert the object into a dict
create_speech_request_model_dict = create_speech_request_model_instance.to_dict()
# create an instance of CreateSpeechRequestModel from a dict
create_speech_request_model_from_dict = CreateSpeechRequestModel.from_dict(create_speech_request_model_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


