# RealtimeServerEventConversationCreatedConversation

The conversation resource.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The unique ID of the conversation. | [optional] 
**object** | **str** | The object type, must be &#x60;realtime.conversation&#x60;. | [optional] 

## Example

```python
from openapiopenai.models.realtime_server_event_conversation_created_conversation import RealtimeServerEventConversationCreatedConversation

# TODO update the JSON string below
json = "{}"
# create an instance of RealtimeServerEventConversationCreatedConversation from a JSON string
realtime_server_event_conversation_created_conversation_instance = RealtimeServerEventConversationCreatedConversation.from_json(json)
# print the JSON string representation of the object
print(RealtimeServerEventConversationCreatedConversation.to_json())

# convert the object into a dict
realtime_server_event_conversation_created_conversation_dict = realtime_server_event_conversation_created_conversation_instance.to_dict()
# create an instance of RealtimeServerEventConversationCreatedConversation from a dict
realtime_server_event_conversation_created_conversation_from_dict = RealtimeServerEventConversationCreatedConversation.from_dict(realtime_server_event_conversation_created_conversation_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


