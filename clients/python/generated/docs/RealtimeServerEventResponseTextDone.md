# RealtimeServerEventResponseTextDone

Returned when the text value of a \"text\" content part is done streaming. Also emitted when a Response is interrupted, incomplete, or cancelled. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **str** | The unique ID of the server event. | 
**type** | **str** | The event type, must be &#x60;response.text.done&#x60;. | 
**response_id** | **str** | The ID of the response. | 
**item_id** | **str** | The ID of the item. | 
**output_index** | **int** | The index of the output item in the response. | 
**content_index** | **int** | The index of the content part in the item&#39;s content array. | 
**text** | **str** | The final text content. | 

## Example

```python
from openapiopenai.models.realtime_server_event_response_text_done import RealtimeServerEventResponseTextDone

# TODO update the JSON string below
json = "{}"
# create an instance of RealtimeServerEventResponseTextDone from a JSON string
realtime_server_event_response_text_done_instance = RealtimeServerEventResponseTextDone.from_json(json)
# print the JSON string representation of the object
print(RealtimeServerEventResponseTextDone.to_json())

# convert the object into a dict
realtime_server_event_response_text_done_dict = realtime_server_event_response_text_done_instance.to_dict()
# create an instance of RealtimeServerEventResponseTextDone from a dict
realtime_server_event_response_text_done_from_dict = RealtimeServerEventResponseTextDone.from_dict(realtime_server_event_response_text_done_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


