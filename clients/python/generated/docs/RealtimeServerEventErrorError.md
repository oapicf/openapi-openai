# RealtimeServerEventErrorError

Details of the error.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | The type of error (e.g., \&quot;invalid_request_error\&quot;, \&quot;server_error\&quot;).  | 
**code** | **str** | Error code, if any. | [optional] 
**message** | **str** | A human-readable error message. | 
**param** | **str** | Parameter related to the error, if any. | [optional] 
**event_id** | **str** | The event_id of the client event that caused the error, if applicable.  | [optional] 

## Example

```python
from openapiopenai.models.realtime_server_event_error_error import RealtimeServerEventErrorError

# TODO update the JSON string below
json = "{}"
# create an instance of RealtimeServerEventErrorError from a JSON string
realtime_server_event_error_error_instance = RealtimeServerEventErrorError.from_json(json)
# print the JSON string representation of the object
print(RealtimeServerEventErrorError.to_json())

# convert the object into a dict
realtime_server_event_error_error_dict = realtime_server_event_error_error_instance.to_dict()
# create an instance of RealtimeServerEventErrorError from a dict
realtime_server_event_error_error_from_dict = RealtimeServerEventErrorError.from_dict(realtime_server_event_error_error_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


