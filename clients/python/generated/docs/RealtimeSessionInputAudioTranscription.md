# RealtimeSessionInputAudioTranscription

Configuration for input audio transcription, defaults to off and can be  set to `null` to turn off once on. Input audio transcription is not native  to the model, since the model consumes audio directly. Transcription runs  asynchronously through Whisper and should be treated as rough guidance  rather than the representation understood by the model. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**model** | **str** | The model to use for transcription, &#x60;whisper-1&#x60; is the only currently  supported model.  | [optional] 

## Example

```python
from openapiopenai.models.realtime_session_input_audio_transcription import RealtimeSessionInputAudioTranscription

# TODO update the JSON string below
json = "{}"
# create an instance of RealtimeSessionInputAudioTranscription from a JSON string
realtime_session_input_audio_transcription_instance = RealtimeSessionInputAudioTranscription.from_json(json)
# print the JSON string representation of the object
print(RealtimeSessionInputAudioTranscription.to_json())

# convert the object into a dict
realtime_session_input_audio_transcription_dict = realtime_session_input_audio_transcription_instance.to_dict()
# create an instance of RealtimeSessionInputAudioTranscription from a dict
realtime_session_input_audio_transcription_from_dict = RealtimeSessionInputAudioTranscription.from_dict(realtime_session_input_audio_transcription_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


