# RunStreamEvent


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event** | **str** |  | 
**data** | [**RunObject**](RunObject.md) |  | 

## Example

```python
from openapiopenai.models.run_stream_event import RunStreamEvent

# TODO update the JSON string below
json = "{}"
# create an instance of RunStreamEvent from a JSON string
run_stream_event_instance = RunStreamEvent.from_json(json)
# print the JSON string representation of the object
print(RunStreamEvent.to_json())

# convert the object into a dict
run_stream_event_dict = run_stream_event_instance.to_dict()
# create an instance of RunStreamEvent from a dict
run_stream_event_from_dict = RunStreamEvent.from_dict(run_stream_event_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


