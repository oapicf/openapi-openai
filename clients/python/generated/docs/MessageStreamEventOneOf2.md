# MessageStreamEventOneOf2

Occurs when parts of a [Message](/docs/api-reference/messages/object) are being streamed.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event** | **str** |  | 
**data** | [**MessageDeltaObject**](MessageDeltaObject.md) |  | 

## Example

```python
from openapiopenai.models.message_stream_event_one_of2 import MessageStreamEventOneOf2

# TODO update the JSON string below
json = "{}"
# create an instance of MessageStreamEventOneOf2 from a JSON string
message_stream_event_one_of2_instance = MessageStreamEventOneOf2.from_json(json)
# print the JSON string representation of the object
print(MessageStreamEventOneOf2.to_json())

# convert the object into a dict
message_stream_event_one_of2_dict = message_stream_event_one_of2_instance.to_dict()
# create an instance of MessageStreamEventOneOf2 from a dict
message_stream_event_one_of2_form_dict = message_stream_event_one_of2.from_dict(message_stream_event_one_of2_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


