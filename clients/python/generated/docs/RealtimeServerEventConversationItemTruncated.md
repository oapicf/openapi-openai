# RealtimeServerEventConversationItemTruncated

Returned when an earlier assistant audio message item is truncated by the  client with a `conversation.item.truncate` event. This event is used to  synchronize the server's understanding of the audio with the client's playback.  This action will truncate the audio and remove the server-side text transcript  to ensure there is no text in the context that hasn't been heard by the user. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **str** | The unique ID of the server event. | 
**type** | **str** | The event type, must be &#x60;conversation.item.truncated&#x60;. | 
**item_id** | **str** | The ID of the assistant message item that was truncated. | 
**content_index** | **int** | The index of the content part that was truncated. | 
**audio_end_ms** | **int** | The duration up to which the audio was truncated, in milliseconds.  | 

## Example

```python
from openapiopenai.models.realtime_server_event_conversation_item_truncated import RealtimeServerEventConversationItemTruncated

# TODO update the JSON string below
json = "{}"
# create an instance of RealtimeServerEventConversationItemTruncated from a JSON string
realtime_server_event_conversation_item_truncated_instance = RealtimeServerEventConversationItemTruncated.from_json(json)
# print the JSON string representation of the object
print(RealtimeServerEventConversationItemTruncated.to_json())

# convert the object into a dict
realtime_server_event_conversation_item_truncated_dict = realtime_server_event_conversation_item_truncated_instance.to_dict()
# create an instance of RealtimeServerEventConversationItemTruncated from a dict
realtime_server_event_conversation_item_truncated_from_dict = RealtimeServerEventConversationItemTruncated.from_dict(realtime_server_event_conversation_item_truncated_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


