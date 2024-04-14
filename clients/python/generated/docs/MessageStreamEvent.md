# MessageStreamEvent


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event** | **str** |  | 
**data** | [**MessageObject**](MessageObject.md) |  | 

## Example

```python
from openapiopenai.models.message_stream_event import MessageStreamEvent

# TODO update the JSON string below
json = "{}"
# create an instance of MessageStreamEvent from a JSON string
message_stream_event_instance = MessageStreamEvent.from_json(json)
# print the JSON string representation of the object
print(MessageStreamEvent.to_json())

# convert the object into a dict
message_stream_event_dict = message_stream_event_instance.to_dict()
# create an instance of MessageStreamEvent from a dict
message_stream_event_form_dict = message_stream_event.from_dict(message_stream_event_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


