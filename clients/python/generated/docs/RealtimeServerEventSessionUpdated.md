# RealtimeServerEventSessionUpdated

Returned when a session is updated with a `session.update` event, unless  there is an error. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **str** | The unique ID of the server event. | 
**type** | **str** | The event type, must be &#x60;session.updated&#x60;. | 
**session** | [**RealtimeSession**](RealtimeSession.md) |  | 

## Example

```python
from openapiopenai.models.realtime_server_event_session_updated import RealtimeServerEventSessionUpdated

# TODO update the JSON string below
json = "{}"
# create an instance of RealtimeServerEventSessionUpdated from a JSON string
realtime_server_event_session_updated_instance = RealtimeServerEventSessionUpdated.from_json(json)
# print the JSON string representation of the object
print(RealtimeServerEventSessionUpdated.to_json())

# convert the object into a dict
realtime_server_event_session_updated_dict = realtime_server_event_session_updated_instance.to_dict()
# create an instance of RealtimeServerEventSessionUpdated from a dict
realtime_server_event_session_updated_from_dict = RealtimeServerEventSessionUpdated.from_dict(realtime_server_event_session_updated_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


