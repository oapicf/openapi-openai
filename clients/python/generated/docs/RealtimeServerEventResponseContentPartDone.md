# RealtimeServerEventResponseContentPartDone

Returned when a content part is done streaming in an assistant message item. Also emitted when a Response is interrupted, incomplete, or cancelled. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **str** | The unique ID of the server event. | 
**type** | **str** | The event type, must be &#x60;response.content_part.done&#x60;. | 
**response_id** | **str** | The ID of the response. | 
**item_id** | **str** | The ID of the item. | 
**output_index** | **int** | The index of the output item in the response. | 
**content_index** | **int** | The index of the content part in the item&#39;s content array. | 
**part** | [**RealtimeServerEventResponseContentPartDonePart**](RealtimeServerEventResponseContentPartDonePart.md) |  | 

## Example

```python
from openapiopenai.models.realtime_server_event_response_content_part_done import RealtimeServerEventResponseContentPartDone

# TODO update the JSON string below
json = "{}"
# create an instance of RealtimeServerEventResponseContentPartDone from a JSON string
realtime_server_event_response_content_part_done_instance = RealtimeServerEventResponseContentPartDone.from_json(json)
# print the JSON string representation of the object
print(RealtimeServerEventResponseContentPartDone.to_json())

# convert the object into a dict
realtime_server_event_response_content_part_done_dict = realtime_server_event_response_content_part_done_instance.to_dict()
# create an instance of RealtimeServerEventResponseContentPartDone from a dict
realtime_server_event_response_content_part_done_from_dict = RealtimeServerEventResponseContentPartDone.from_dict(realtime_server_event_response_content_part_done_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


