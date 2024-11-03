# ThreadStreamEvent


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event** | **str** |  | 
**data** | [**ThreadObject**](ThreadObject.md) |  | 

## Example

```python
from openapiopenai.models.thread_stream_event import ThreadStreamEvent

# TODO update the JSON string below
json = "{}"
# create an instance of ThreadStreamEvent from a JSON string
thread_stream_event_instance = ThreadStreamEvent.from_json(json)
# print the JSON string representation of the object
print(ThreadStreamEvent.to_json())

# convert the object into a dict
thread_stream_event_dict = thread_stream_event_instance.to_dict()
# create an instance of ThreadStreamEvent from a dict
thread_stream_event_from_dict = ThreadStreamEvent.from_dict(thread_stream_event_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


