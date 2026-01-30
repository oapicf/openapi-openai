# RealtimeServerEventConversationItemCreated

Returned when a conversation item is created. There are several scenarios that  produce this event:   - The server is generating a Response, which if successful will produce      either one or two Items, which will be of type `message`      (role `assistant`) or type `function_call`.   - The input audio buffer has been committed, either by the client or the      server (in `server_vad` mode). The server will take the content of the      input audio buffer and add it to a new user message Item.   - The client has sent a `conversation.item.create` event to add a new Item      to the Conversation. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **str** | The unique ID of the server event. | 
**type** | **str** | The event type, must be &#x60;conversation.item.created&#x60;. | 
**previous_item_id** | **str** | The ID of the preceding item in the Conversation context, allows the  client to understand the order of the conversation.  | 
**item** | [**RealtimeConversationItem**](RealtimeConversationItem.md) |  | 

## Example

```python
from openapiopenai.models.realtime_server_event_conversation_item_created import RealtimeServerEventConversationItemCreated

# TODO update the JSON string below
json = "{}"
# create an instance of RealtimeServerEventConversationItemCreated from a JSON string
realtime_server_event_conversation_item_created_instance = RealtimeServerEventConversationItemCreated.from_json(json)
# print the JSON string representation of the object
print(RealtimeServerEventConversationItemCreated.to_json())

# convert the object into a dict
realtime_server_event_conversation_item_created_dict = realtime_server_event_conversation_item_created_instance.to_dict()
# create an instance of RealtimeServerEventConversationItemCreated from a dict
realtime_server_event_conversation_item_created_from_dict = RealtimeServerEventConversationItemCreated.from_dict(realtime_server_event_conversation_item_created_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


