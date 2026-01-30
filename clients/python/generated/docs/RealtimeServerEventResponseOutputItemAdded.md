# RealtimeServerEventResponseOutputItemAdded

Returned when a new Item is created during Response generation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **str** | The unique ID of the server event. | 
**type** | **str** | The event type, must be &#x60;response.output_item.added&#x60;. | 
**response_id** | **str** | The ID of the Response to which the item belongs. | 
**output_index** | **int** | The index of the output item in the Response. | 
**item** | [**RealtimeConversationItem**](RealtimeConversationItem.md) |  | 

## Example

```python
from openapiopenai.models.realtime_server_event_response_output_item_added import RealtimeServerEventResponseOutputItemAdded

# TODO update the JSON string below
json = "{}"
# create an instance of RealtimeServerEventResponseOutputItemAdded from a JSON string
realtime_server_event_response_output_item_added_instance = RealtimeServerEventResponseOutputItemAdded.from_json(json)
# print the JSON string representation of the object
print(RealtimeServerEventResponseOutputItemAdded.to_json())

# convert the object into a dict
realtime_server_event_response_output_item_added_dict = realtime_server_event_response_output_item_added_instance.to_dict()
# create an instance of RealtimeServerEventResponseOutputItemAdded from a dict
realtime_server_event_response_output_item_added_from_dict = RealtimeServerEventResponseOutputItemAdded.from_dict(realtime_server_event_response_output_item_added_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


