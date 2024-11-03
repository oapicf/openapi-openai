# MessageStreamEventOneOf4

Occurs when a [message](/docs/api-reference/messages/object) ends before it is completed.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event** | **str** |  | 
**data** | [**MessageObject**](MessageObject.md) |  | 

## Example

```python
from openapiopenai.models.message_stream_event_one_of4 import MessageStreamEventOneOf4

# TODO update the JSON string below
json = "{}"
# create an instance of MessageStreamEventOneOf4 from a JSON string
message_stream_event_one_of4_instance = MessageStreamEventOneOf4.from_json(json)
# print the JSON string representation of the object
print(MessageStreamEventOneOf4.to_json())

# convert the object into a dict
message_stream_event_one_of4_dict = message_stream_event_one_of4_instance.to_dict()
# create an instance of MessageStreamEventOneOf4 from a dict
message_stream_event_one_of4_from_dict = MessageStreamEventOneOf4.from_dict(message_stream_event_one_of4_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


