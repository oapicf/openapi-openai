# RunStreamEventOneOf3

Occurs when a [run](/docs/api-reference/runs/object) moves to a `requires_action` status.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event** | **str** |  | 
**data** | [**RunObject**](RunObject.md) |  | 

## Example

```python
from openapiopenai.models.run_stream_event_one_of3 import RunStreamEventOneOf3

# TODO update the JSON string below
json = "{}"
# create an instance of RunStreamEventOneOf3 from a JSON string
run_stream_event_one_of3_instance = RunStreamEventOneOf3.from_json(json)
# print the JSON string representation of the object
print(RunStreamEventOneOf3.to_json())

# convert the object into a dict
run_stream_event_one_of3_dict = run_stream_event_one_of3_instance.to_dict()
# create an instance of RunStreamEventOneOf3 from a dict
run_stream_event_one_of3_from_dict = RunStreamEventOneOf3.from_dict(run_stream_event_one_of3_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


