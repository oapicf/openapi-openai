# RealtimeServerEventResponseOutputItemDone

Returned when an Item is done streaming. Also emitted when a Response is  interrupted, incomplete, or cancelled. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **str** | The unique ID of the server event. | 
**type** | **str** | The event type, must be &#x60;response.output_item.done&#x60;. | 
**response_id** | **str** | The ID of the Response to which the item belongs. | 
**output_index** | **int** | The index of the output item in the Response. | 
**item** | [**RealtimeConversationItem**](RealtimeConversationItem.md) |  | 

## Example

```python
from openapiopenai.models.realtime_server_event_response_output_item_done import RealtimeServerEventResponseOutputItemDone

# TODO update the JSON string below
json = "{}"
# create an instance of RealtimeServerEventResponseOutputItemDone from a JSON string
realtime_server_event_response_output_item_done_instance = RealtimeServerEventResponseOutputItemDone.from_json(json)
# print the JSON string representation of the object
print(RealtimeServerEventResponseOutputItemDone.to_json())

# convert the object into a dict
realtime_server_event_response_output_item_done_dict = realtime_server_event_response_output_item_done_instance.to_dict()
# create an instance of RealtimeServerEventResponseOutputItemDone from a dict
realtime_server_event_response_output_item_done_from_dict = RealtimeServerEventResponseOutputItemDone.from_dict(realtime_server_event_response_output_item_done_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


