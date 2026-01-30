# RealtimeServerEventResponseFunctionCallArgumentsDelta

Returned when the model-generated function call arguments are updated. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **str** | The unique ID of the server event. | 
**type** | **str** | The event type, must be &#x60;response.function_call_arguments.delta&#x60;.  | 
**response_id** | **str** | The ID of the response. | 
**item_id** | **str** | The ID of the function call item. | 
**output_index** | **int** | The index of the output item in the response. | 
**call_id** | **str** | The ID of the function call. | 
**delta** | **str** | The arguments delta as a JSON string. | 

## Example

```python
from openapiopenai.models.realtime_server_event_response_function_call_arguments_delta import RealtimeServerEventResponseFunctionCallArgumentsDelta

# TODO update the JSON string below
json = "{}"
# create an instance of RealtimeServerEventResponseFunctionCallArgumentsDelta from a JSON string
realtime_server_event_response_function_call_arguments_delta_instance = RealtimeServerEventResponseFunctionCallArgumentsDelta.from_json(json)
# print the JSON string representation of the object
print(RealtimeServerEventResponseFunctionCallArgumentsDelta.to_json())

# convert the object into a dict
realtime_server_event_response_function_call_arguments_delta_dict = realtime_server_event_response_function_call_arguments_delta_instance.to_dict()
# create an instance of RealtimeServerEventResponseFunctionCallArgumentsDelta from a dict
realtime_server_event_response_function_call_arguments_delta_from_dict = RealtimeServerEventResponseFunctionCallArgumentsDelta.from_dict(realtime_server_event_response_function_call_arguments_delta_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


