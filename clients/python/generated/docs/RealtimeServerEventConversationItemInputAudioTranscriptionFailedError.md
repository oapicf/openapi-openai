# RealtimeServerEventConversationItemInputAudioTranscriptionFailedError

Details of the transcription error.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | The type of error. | [optional] 
**code** | **str** | Error code, if any. | [optional] 
**message** | **str** | A human-readable error message. | [optional] 
**param** | **str** | Parameter related to the error, if any. | [optional] 

## Example

```python
from openapiopenai.models.realtime_server_event_conversation_item_input_audio_transcription_failed_error import RealtimeServerEventConversationItemInputAudioTranscriptionFailedError

# TODO update the JSON string below
json = "{}"
# create an instance of RealtimeServerEventConversationItemInputAudioTranscriptionFailedError from a JSON string
realtime_server_event_conversation_item_input_audio_transcription_failed_error_instance = RealtimeServerEventConversationItemInputAudioTranscriptionFailedError.from_json(json)
# print the JSON string representation of the object
print(RealtimeServerEventConversationItemInputAudioTranscriptionFailedError.to_json())

# convert the object into a dict
realtime_server_event_conversation_item_input_audio_transcription_failed_error_dict = realtime_server_event_conversation_item_input_audio_transcription_failed_error_instance.to_dict()
# create an instance of RealtimeServerEventConversationItemInputAudioTranscriptionFailedError from a dict
realtime_server_event_conversation_item_input_audio_transcription_failed_error_from_dict = RealtimeServerEventConversationItemInputAudioTranscriptionFailedError.from_dict(realtime_server_event_conversation_item_input_audio_transcription_failed_error_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


