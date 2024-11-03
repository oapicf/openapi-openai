# DoneEvent

Occurs when a stream ends.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event** | **str** |  | 
**data** | **str** |  | 

## Example

```python
from openapiopenai.models.done_event import DoneEvent

# TODO update the JSON string below
json = "{}"
# create an instance of DoneEvent from a JSON string
done_event_instance = DoneEvent.from_json(json)
# print the JSON string representation of the object
print(DoneEvent.to_json())

# convert the object into a dict
done_event_dict = done_event_instance.to_dict()
# create an instance of DoneEvent from a dict
done_event_from_dict = DoneEvent.from_dict(done_event_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


