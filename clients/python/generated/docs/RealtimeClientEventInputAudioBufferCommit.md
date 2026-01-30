# RealtimeClientEventInputAudioBufferCommit

Send this event to commit the user input audio buffer, which will create a  new user message item in the conversation. This event will produce an error  if the input audio buffer is empty. When in Server VAD mode, the client does  not need to send this event, the server will commit the audio buffer  automatically.  Committing the input audio buffer will trigger input audio transcription  (if enabled in session configuration), but it will not create a response  from the model. The server will respond with an `input_audio_buffer.committed`  event. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **str** | Optional client-generated ID used to identify this event. | [optional] 
**type** | **str** | The event type, must be &#x60;input_audio_buffer.commit&#x60;. | 

## Example

```python
from openapiopenai.models.realtime_client_event_input_audio_buffer_commit import RealtimeClientEventInputAudioBufferCommit

# TODO update the JSON string below
json = "{}"
# create an instance of RealtimeClientEventInputAudioBufferCommit from a JSON string
realtime_client_event_input_audio_buffer_commit_instance = RealtimeClientEventInputAudioBufferCommit.from_json(json)
# print the JSON string representation of the object
print(RealtimeClientEventInputAudioBufferCommit.to_json())

# convert the object into a dict
realtime_client_event_input_audio_buffer_commit_dict = realtime_client_event_input_audio_buffer_commit_instance.to_dict()
# create an instance of RealtimeClientEventInputAudioBufferCommit from a dict
realtime_client_event_input_audio_buffer_commit_from_dict = RealtimeClientEventInputAudioBufferCommit.from_dict(realtime_client_event_input_audio_buffer_commit_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


