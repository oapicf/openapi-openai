# ThreadStreamEventOneOf

Occurs when a new [thread](/docs/api-reference/threads/object) is created.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event** | **str** |  | 
**data** | [**ThreadObject**](ThreadObject.md) |  | 

## Example

```python
from openapiopenai.models.thread_stream_event_one_of import ThreadStreamEventOneOf

# TODO update the JSON string below
json = "{}"
# create an instance of ThreadStreamEventOneOf from a JSON string
thread_stream_event_one_of_instance = ThreadStreamEventOneOf.from_json(json)
# print the JSON string representation of the object
print(ThreadStreamEventOneOf.to_json())

# convert the object into a dict
thread_stream_event_one_of_dict = thread_stream_event_one_of_instance.to_dict()
# create an instance of ThreadStreamEventOneOf from a dict
thread_stream_event_one_of_from_dict = ThreadStreamEventOneOf.from_dict(thread_stream_event_one_of_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


