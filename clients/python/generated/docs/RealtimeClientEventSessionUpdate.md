# RealtimeClientEventSessionUpdate

Send this event to update the session’s default configuration. The client may  send this event at any time to update the session configuration, and any  field may be updated at any time, except for \"voice\". The server will respond  with a `session.updated` event that shows the full effective configuration.  Only fields that are present are updated, thus the correct way to clear a  field like \"instructions\" is to pass an empty string. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **str** | Optional client-generated ID used to identify this event. | [optional] 
**type** | **str** | The event type, must be &#x60;session.update&#x60;. | 
**session** | [**RealtimeSessionCreateRequest**](RealtimeSessionCreateRequest.md) |  | 

## Example

```python
from openapiopenai.models.realtime_client_event_session_update import RealtimeClientEventSessionUpdate

# TODO update the JSON string below
json = "{}"
# create an instance of RealtimeClientEventSessionUpdate from a JSON string
realtime_client_event_session_update_instance = RealtimeClientEventSessionUpdate.from_json(json)
# print the JSON string representation of the object
print(RealtimeClientEventSessionUpdate.to_json())

# convert the object into a dict
realtime_client_event_session_update_dict = realtime_client_event_session_update_instance.to_dict()
# create an instance of RealtimeClientEventSessionUpdate from a dict
realtime_client_event_session_update_from_dict = RealtimeClientEventSessionUpdate.from_dict(realtime_client_event_session_update_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


