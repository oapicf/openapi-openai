# RealtimeServerEventResponseAudioTranscriptDone

Returned when the model-generated transcription of audio output is done streaming. Also emitted when a Response is interrupted, incomplete, or cancelled. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **str** | The unique ID of the server event. | 
**type** | **str** | The event type, must be &#x60;response.audio_transcript.done&#x60;. | 
**response_id** | **str** | The ID of the response. | 
**item_id** | **str** | The ID of the item. | 
**output_index** | **int** | The index of the output item in the response. | 
**content_index** | **int** | The index of the content part in the item&#39;s content array. | 
**transcript** | **str** | The final transcript of the audio. | 

## Example

```python
from openapiopenai.models.realtime_server_event_response_audio_transcript_done import RealtimeServerEventResponseAudioTranscriptDone

# TODO update the JSON string below
json = "{}"
# create an instance of RealtimeServerEventResponseAudioTranscriptDone from a JSON string
realtime_server_event_response_audio_transcript_done_instance = RealtimeServerEventResponseAudioTranscriptDone.from_json(json)
# print the JSON string representation of the object
print(RealtimeServerEventResponseAudioTranscriptDone.to_json())

# convert the object into a dict
realtime_server_event_response_audio_transcript_done_dict = realtime_server_event_response_audio_transcript_done_instance.to_dict()
# create an instance of RealtimeServerEventResponseAudioTranscriptDone from a dict
realtime_server_event_response_audio_transcript_done_from_dict = RealtimeServerEventResponseAudioTranscriptDone.from_dict(realtime_server_event_response_audio_transcript_done_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


