# RealtimeServerEventResponseContentPartAdded

Returned when a new content part is added to an assistant message item during response generation. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **str** | The unique ID of the server event. | 
**type** | **str** | The event type, must be &#x60;response.content_part.added&#x60;. | 
**response_id** | **str** | The ID of the response. | 
**item_id** | **str** | The ID of the item to which the content part was added. | 
**output_index** | **int** | The index of the output item in the response. | 
**content_index** | **int** | The index of the content part in the item&#39;s content array. | 
**part** | [**RealtimeServerEventResponseContentPartAddedPart**](RealtimeServerEventResponseContentPartAddedPart.md) |  | 

## Example

```python
from openapiopenai.models.realtime_server_event_response_content_part_added import RealtimeServerEventResponseContentPartAdded

# TODO update the JSON string below
json = "{}"
# create an instance of RealtimeServerEventResponseContentPartAdded from a JSON string
realtime_server_event_response_content_part_added_instance = RealtimeServerEventResponseContentPartAdded.from_json(json)
# print the JSON string representation of the object
print(RealtimeServerEventResponseContentPartAdded.to_json())

# convert the object into a dict
realtime_server_event_response_content_part_added_dict = realtime_server_event_response_content_part_added_instance.to_dict()
# create an instance of RealtimeServerEventResponseContentPartAdded from a dict
realtime_server_event_response_content_part_added_from_dict = RealtimeServerEventResponseContentPartAdded.from_dict(realtime_server_event_response_content_part_added_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


