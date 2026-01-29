# MessageStreamEventOneOf1

Occurs when a [message](/docs/api-reference/messages/object) moves to an `in_progress` state.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event** | **str** |  | 
**data** | [**MessageObject**](MessageObject.md) |  | 

## Example

```python
from openapiopenai.models.message_stream_event_one_of1 import MessageStreamEventOneOf1

# TODO update the JSON string below
json = "{}"
# create an instance of MessageStreamEventOneOf1 from a JSON string
message_stream_event_one_of1_instance = MessageStreamEventOneOf1.from_json(json)
# print the JSON string representation of the object
print(MessageStreamEventOneOf1.to_json())

# convert the object into a dict
message_stream_event_one_of1_dict = message_stream_event_one_of1_instance.to_dict()
# create an instance of MessageStreamEventOneOf1 from a dict
message_stream_event_one_of1_from_dict = MessageStreamEventOneOf1.from_dict(message_stream_event_one_of1_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


