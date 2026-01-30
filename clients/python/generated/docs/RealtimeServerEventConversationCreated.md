# RealtimeServerEventConversationCreated

Returned when a conversation is created. Emitted right after session creation. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **str** | The unique ID of the server event. | 
**type** | **str** | The event type, must be &#x60;conversation.created&#x60;. | 
**conversation** | [**RealtimeServerEventConversationCreatedConversation**](RealtimeServerEventConversationCreatedConversation.md) |  | 

## Example

```python
from openapiopenai.models.realtime_server_event_conversation_created import RealtimeServerEventConversationCreated

# TODO update the JSON string below
json = "{}"
# create an instance of RealtimeServerEventConversationCreated from a JSON string
realtime_server_event_conversation_created_instance = RealtimeServerEventConversationCreated.from_json(json)
# print the JSON string representation of the object
print(RealtimeServerEventConversationCreated.to_json())

# convert the object into a dict
realtime_server_event_conversation_created_dict = realtime_server_event_conversation_created_instance.to_dict()
# create an instance of RealtimeServerEventConversationCreated from a dict
realtime_server_event_conversation_created_from_dict = RealtimeServerEventConversationCreated.from_dict(realtime_server_event_conversation_created_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


