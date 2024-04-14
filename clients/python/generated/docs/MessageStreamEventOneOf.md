# MessageStreamEventOneOf

Occurs when a [message](/docs/api-reference/messages/object) is created.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event** | **str** |  | 
**data** | [**MessageObject**](MessageObject.md) |  | 

## Example

```python
from openapiopenai.models.message_stream_event_one_of import MessageStreamEventOneOf

# TODO update the JSON string below
json = "{}"
# create an instance of MessageStreamEventOneOf from a JSON string
message_stream_event_one_of_instance = MessageStreamEventOneOf.from_json(json)
# print the JSON string representation of the object
print(MessageStreamEventOneOf.to_json())

# convert the object into a dict
message_stream_event_one_of_dict = message_stream_event_one_of_instance.to_dict()
# create an instance of MessageStreamEventOneOf from a dict
message_stream_event_one_of_form_dict = message_stream_event_one_of.from_dict(message_stream_event_one_of_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


