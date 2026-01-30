# RealtimeServerEventResponseCreated

Returned when a new Response is created. The first event of response creation, where the response is in an initial state of `in_progress`. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **str** | The unique ID of the server event. | 
**type** | **str** | The event type, must be &#x60;response.created&#x60;. | 
**response** | [**RealtimeResponse**](RealtimeResponse.md) |  | 

## Example

```python
from openapiopenai.models.realtime_server_event_response_created import RealtimeServerEventResponseCreated

# TODO update the JSON string below
json = "{}"
# create an instance of RealtimeServerEventResponseCreated from a JSON string
realtime_server_event_response_created_instance = RealtimeServerEventResponseCreated.from_json(json)
# print the JSON string representation of the object
print(RealtimeServerEventResponseCreated.to_json())

# convert the object into a dict
realtime_server_event_response_created_dict = realtime_server_event_response_created_instance.to_dict()
# create an instance of RealtimeServerEventResponseCreated from a dict
realtime_server_event_response_created_from_dict = RealtimeServerEventResponseCreated.from_dict(realtime_server_event_response_created_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


