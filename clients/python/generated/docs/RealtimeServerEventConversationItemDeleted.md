# RealtimeServerEventConversationItemDeleted

Returned when an item in the conversation is deleted by the client with a  `conversation.item.delete` event. This event is used to synchronize the  server's understanding of the conversation history with the client's view. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **str** | The unique ID of the server event. | 
**type** | **str** | The event type, must be &#x60;conversation.item.deleted&#x60;. | 
**item_id** | **str** | The ID of the item that was deleted. | 

## Example

```python
from openapiopenai.models.realtime_server_event_conversation_item_deleted import RealtimeServerEventConversationItemDeleted

# TODO update the JSON string below
json = "{}"
# create an instance of RealtimeServerEventConversationItemDeleted from a JSON string
realtime_server_event_conversation_item_deleted_instance = RealtimeServerEventConversationItemDeleted.from_json(json)
# print the JSON string representation of the object
print(RealtimeServerEventConversationItemDeleted.to_json())

# convert the object into a dict
realtime_server_event_conversation_item_deleted_dict = realtime_server_event_conversation_item_deleted_instance.to_dict()
# create an instance of RealtimeServerEventConversationItemDeleted from a dict
realtime_server_event_conversation_item_deleted_from_dict = RealtimeServerEventConversationItemDeleted.from_dict(realtime_server_event_conversation_item_deleted_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


