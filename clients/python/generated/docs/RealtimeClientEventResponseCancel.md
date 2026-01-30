# RealtimeClientEventResponseCancel

Send this event to cancel an in-progress response. The server will respond  with a `response.cancelled` event or an error if there is no response to  cancel. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **str** | Optional client-generated ID used to identify this event. | [optional] 
**type** | **str** | The event type, must be &#x60;response.cancel&#x60;. | 
**response_id** | **str** | A specific response ID to cancel - if not provided, will cancel an  in-progress response in the default conversation.  | [optional] 

## Example

```python
from openapiopenai.models.realtime_client_event_response_cancel import RealtimeClientEventResponseCancel

# TODO update the JSON string below
json = "{}"
# create an instance of RealtimeClientEventResponseCancel from a JSON string
realtime_client_event_response_cancel_instance = RealtimeClientEventResponseCancel.from_json(json)
# print the JSON string representation of the object
print(RealtimeClientEventResponseCancel.to_json())

# convert the object into a dict
realtime_client_event_response_cancel_dict = realtime_client_event_response_cancel_instance.to_dict()
# create an instance of RealtimeClientEventResponseCancel from a dict
realtime_client_event_response_cancel_from_dict = RealtimeClientEventResponseCancel.from_dict(realtime_client_event_response_cancel_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


