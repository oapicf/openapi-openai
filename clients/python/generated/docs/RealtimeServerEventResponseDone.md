# RealtimeServerEventResponseDone

Returned when a Response is done streaming. Always emitted, no matter the  final state. The Response object included in the `response.done` event will  include all output Items in the Response but will omit the raw audio data. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **str** | The unique ID of the server event. | 
**type** | **str** | The event type, must be &#x60;response.done&#x60;. | 
**response** | [**RealtimeResponse**](RealtimeResponse.md) |  | 

## Example

```python
from openapiopenai.models.realtime_server_event_response_done import RealtimeServerEventResponseDone

# TODO update the JSON string below
json = "{}"
# create an instance of RealtimeServerEventResponseDone from a JSON string
realtime_server_event_response_done_instance = RealtimeServerEventResponseDone.from_json(json)
# print the JSON string representation of the object
print(RealtimeServerEventResponseDone.to_json())

# convert the object into a dict
realtime_server_event_response_done_dict = realtime_server_event_response_done_instance.to_dict()
# create an instance of RealtimeServerEventResponseDone from a dict
realtime_server_event_response_done_from_dict = RealtimeServerEventResponseDone.from_dict(realtime_server_event_response_done_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


