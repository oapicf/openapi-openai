# RealtimeClientEventConversationItemCreate

Add a new Item to the Conversation's context, including messages, function  calls, and function call responses. This event can be used both to populate a  \"history\" of the conversation and to add new items mid-stream, but has the  current limitation that it cannot populate assistant audio messages.  If successful, the server will respond with a `conversation.item.created`  event, otherwise an `error` event will be sent. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **str** | Optional client-generated ID used to identify this event. | [optional] 
**type** | **str** | The event type, must be &#x60;conversation.item.create&#x60;. | 
**previous_item_id** | **str** | The ID of the preceding item after which the new item will be inserted.  If not set, the new item will be appended to the end of the conversation.  If set, it allows an item to be inserted mid-conversation. If the ID  cannot be found, an error will be returned and the item will not be added.  | [optional] 
**item** | [**RealtimeConversationItem**](RealtimeConversationItem.md) |  | 

## Example

```python
from openapiopenai.models.realtime_client_event_conversation_item_create import RealtimeClientEventConversationItemCreate

# TODO update the JSON string below
json = "{}"
# create an instance of RealtimeClientEventConversationItemCreate from a JSON string
realtime_client_event_conversation_item_create_instance = RealtimeClientEventConversationItemCreate.from_json(json)
# print the JSON string representation of the object
print(RealtimeClientEventConversationItemCreate.to_json())

# convert the object into a dict
realtime_client_event_conversation_item_create_dict = realtime_client_event_conversation_item_create_instance.to_dict()
# create an instance of RealtimeClientEventConversationItemCreate from a dict
realtime_client_event_conversation_item_create_from_dict = RealtimeClientEventConversationItemCreate.from_dict(realtime_client_event_conversation_item_create_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


