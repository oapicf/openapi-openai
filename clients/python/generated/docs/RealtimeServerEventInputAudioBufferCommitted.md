# RealtimeServerEventInputAudioBufferCommitted

Returned when an input audio buffer is committed, either by the client or  automatically in server VAD mode. The `item_id` property is the ID of the user message item that will be created, thus a `conversation.item.created` event  will also be sent to the client. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **str** | The unique ID of the server event. | 
**type** | **str** | The event type, must be &#x60;input_audio_buffer.committed&#x60;. | 
**previous_item_id** | **str** | The ID of the preceding item after which the new item will be inserted.  | 
**item_id** | **str** | The ID of the user message item that will be created. | 

## Example

```python
from openapiopenai.models.realtime_server_event_input_audio_buffer_committed import RealtimeServerEventInputAudioBufferCommitted

# TODO update the JSON string below
json = "{}"
# create an instance of RealtimeServerEventInputAudioBufferCommitted from a JSON string
realtime_server_event_input_audio_buffer_committed_instance = RealtimeServerEventInputAudioBufferCommitted.from_json(json)
# print the JSON string representation of the object
print(RealtimeServerEventInputAudioBufferCommitted.to_json())

# convert the object into a dict
realtime_server_event_input_audio_buffer_committed_dict = realtime_server_event_input_audio_buffer_committed_instance.to_dict()
# create an instance of RealtimeServerEventInputAudioBufferCommitted from a dict
realtime_server_event_input_audio_buffer_committed_from_dict = RealtimeServerEventInputAudioBufferCommitted.from_dict(realtime_server_event_input_audio_buffer_committed_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


