# RealtimeServerEventSessionCreated

Returned when a Session is created. Emitted automatically when a new  connection is established as the first server event. This event will contain  the default Session configuration. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **str** | The unique ID of the server event. | 
**type** | **str** | The event type, must be &#x60;session.created&#x60;. | 
**session** | [**RealtimeSession**](RealtimeSession.md) |  | 

## Example

```python
from openapiopenai.models.realtime_server_event_session_created import RealtimeServerEventSessionCreated

# TODO update the JSON string below
json = "{}"
# create an instance of RealtimeServerEventSessionCreated from a JSON string
realtime_server_event_session_created_instance = RealtimeServerEventSessionCreated.from_json(json)
# print the JSON string representation of the object
print(RealtimeServerEventSessionCreated.to_json())

# convert the object into a dict
realtime_server_event_session_created_dict = realtime_server_event_session_created_instance.to_dict()
# create an instance of RealtimeServerEventSessionCreated from a dict
realtime_server_event_session_created_from_dict = RealtimeServerEventSessionCreated.from_dict(realtime_server_event_session_created_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


