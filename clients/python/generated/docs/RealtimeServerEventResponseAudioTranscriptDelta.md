# RealtimeServerEventResponseAudioTranscriptDelta

Returned when the model-generated transcription of audio output is updated. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **str** | The unique ID of the server event. | 
**type** | **str** | The event type, must be &#x60;response.audio_transcript.delta&#x60;. | 
**response_id** | **str** | The ID of the response. | 
**item_id** | **str** | The ID of the item. | 
**output_index** | **int** | The index of the output item in the response. | 
**content_index** | **int** | The index of the content part in the item&#39;s content array. | 
**delta** | **str** | The transcript delta. | 

## Example

```python
from openapiopenai.models.realtime_server_event_response_audio_transcript_delta import RealtimeServerEventResponseAudioTranscriptDelta

# TODO update the JSON string below
json = "{}"
# create an instance of RealtimeServerEventResponseAudioTranscriptDelta from a JSON string
realtime_server_event_response_audio_transcript_delta_instance = RealtimeServerEventResponseAudioTranscriptDelta.from_json(json)
# print the JSON string representation of the object
print(RealtimeServerEventResponseAudioTranscriptDelta.to_json())

# convert the object into a dict
realtime_server_event_response_audio_transcript_delta_dict = realtime_server_event_response_audio_transcript_delta_instance.to_dict()
# create an instance of RealtimeServerEventResponseAudioTranscriptDelta from a dict
realtime_server_event_response_audio_transcript_delta_from_dict = RealtimeServerEventResponseAudioTranscriptDelta.from_dict(realtime_server_event_response_audio_transcript_delta_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


