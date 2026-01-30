# RealtimeServerEventConversationItemInputAudioTranscriptionCompleted

This event is the output of audio transcription for user audio written to the  user audio buffer. Transcription begins when the input audio buffer is  committed by the client or server (in `server_vad` mode). Transcription runs  asynchronously with Response creation, so this event may come before or after  the Response events.  Realtime API models accept audio natively, and thus input transcription is a  separate process run on a separate ASR (Automatic Speech Recognition) model,  currently always `whisper-1`. Thus the transcript may diverge somewhat from  the model's interpretation, and should be treated as a rough guide. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **str** | The unique ID of the server event. | 
**type** | **str** | The event type, must be &#x60;conversation.item.input_audio_transcription.completed&#x60;.  | 
**item_id** | **str** | The ID of the user message item containing the audio. | 
**content_index** | **int** | The index of the content part containing the audio. | 
**transcript** | **str** | The transcribed text. | 

## Example

```python
from openapiopenai.models.realtime_server_event_conversation_item_input_audio_transcription_completed import RealtimeServerEventConversationItemInputAudioTranscriptionCompleted

# TODO update the JSON string below
json = "{}"
# create an instance of RealtimeServerEventConversationItemInputAudioTranscriptionCompleted from a JSON string
realtime_server_event_conversation_item_input_audio_transcription_completed_instance = RealtimeServerEventConversationItemInputAudioTranscriptionCompleted.from_json(json)
# print the JSON string representation of the object
print(RealtimeServerEventConversationItemInputAudioTranscriptionCompleted.to_json())

# convert the object into a dict
realtime_server_event_conversation_item_input_audio_transcription_completed_dict = realtime_server_event_conversation_item_input_audio_transcription_completed_instance.to_dict()
# create an instance of RealtimeServerEventConversationItemInputAudioTranscriptionCompleted from a dict
realtime_server_event_conversation_item_input_audio_transcription_completed_from_dict = RealtimeServerEventConversationItemInputAudioTranscriptionCompleted.from_dict(realtime_server_event_conversation_item_input_audio_transcription_completed_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


