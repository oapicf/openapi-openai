# RealtimeServerEventError

Returned when an error occurs, which could be a client problem or a server  problem. Most errors are recoverable and the session will stay open, we  recommend to implementors to monitor and log error messages by default. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **str** | The unique ID of the server event. | 
**type** | **str** | The event type, must be &#x60;error&#x60;. | 
**error** | [**RealtimeServerEventErrorError**](RealtimeServerEventErrorError.md) |  | 

## Example

```python
from openapiopenai.models.realtime_server_event_error import RealtimeServerEventError

# TODO update the JSON string below
json = "{}"
# create an instance of RealtimeServerEventError from a JSON string
realtime_server_event_error_instance = RealtimeServerEventError.from_json(json)
# print the JSON string representation of the object
print(RealtimeServerEventError.to_json())

# convert the object into a dict
realtime_server_event_error_dict = realtime_server_event_error_instance.to_dict()
# create an instance of RealtimeServerEventError from a dict
realtime_server_event_error_from_dict = RealtimeServerEventError.from_dict(realtime_server_event_error_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


