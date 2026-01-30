# RealtimeClientEventConversationItemDelete

Send this event when you want to remove any item from the conversation  history. The server will respond with a `conversation.item.deleted` event,  unless the item does not exist in the conversation history, in which case the  server will respond with an error. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **str** | Optional client-generated ID used to identify this event. | [optional] 
**type** | **str** | The event type, must be &#x60;conversation.item.delete&#x60;. | 
**item_id** | **str** | The ID of the item to delete. | 

## Example

```python
from openapiopenai.models.realtime_client_event_conversation_item_delete import RealtimeClientEventConversationItemDelete

# TODO update the JSON string below
json = "{}"
# create an instance of RealtimeClientEventConversationItemDelete from a JSON string
realtime_client_event_conversation_item_delete_instance = RealtimeClientEventConversationItemDelete.from_json(json)
# print the JSON string representation of the object
print(RealtimeClientEventConversationItemDelete.to_json())

# convert the object into a dict
realtime_client_event_conversation_item_delete_dict = realtime_client_event_conversation_item_delete_instance.to_dict()
# create an instance of RealtimeClientEventConversationItemDelete from a dict
realtime_client_event_conversation_item_delete_from_dict = RealtimeClientEventConversationItemDelete.from_dict(realtime_client_event_conversation_item_delete_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


