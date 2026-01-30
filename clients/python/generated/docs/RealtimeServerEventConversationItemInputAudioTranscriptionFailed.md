# RealtimeServerEventConversationItemInputAudioTranscriptionFailed

Returned when input audio transcription is configured, and a transcription  request for a user message failed. These events are separate from other  `error` events so that the client can identify the related Item. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **str** | The unique ID of the server event. | 
**type** | **str** | The event type, must be &#x60;conversation.item.input_audio_transcription.failed&#x60;.  | 
**item_id** | **str** | The ID of the user message item. | 
**content_index** | **int** | The index of the content part containing the audio. | 
**error** | [**RealtimeServerEventConversationItemInputAudioTranscriptionFailedError**](RealtimeServerEventConversationItemInputAudioTranscriptionFailedError.md) |  | 

## Example

```python
from openapiopenai.models.realtime_server_event_conversation_item_input_audio_transcription_failed import RealtimeServerEventConversationItemInputAudioTranscriptionFailed

# TODO update the JSON string below
json = "{}"
# create an instance of RealtimeServerEventConversationItemInputAudioTranscriptionFailed from a JSON string
realtime_server_event_conversation_item_input_audio_transcription_failed_instance = RealtimeServerEventConversationItemInputAudioTranscriptionFailed.from_json(json)
# print the JSON string representation of the object
print(RealtimeServerEventConversationItemInputAudioTranscriptionFailed.to_json())

# convert the object into a dict
realtime_server_event_conversation_item_input_audio_transcription_failed_dict = realtime_server_event_conversation_item_input_audio_transcription_failed_instance.to_dict()
# create an instance of RealtimeServerEventConversationItemInputAudioTranscriptionFailed from a dict
realtime_server_event_conversation_item_input_audio_transcription_failed_from_dict = RealtimeServerEventConversationItemInputAudioTranscriptionFailed.from_dict(realtime_server_event_conversation_item_input_audio_transcription_failed_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


