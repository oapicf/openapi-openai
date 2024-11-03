# RunStreamEventOneOf2

Occurs when a [run](/docs/api-reference/runs/object) moves to an `in_progress` status.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event** | **str** |  | 
**data** | [**RunObject**](RunObject.md) |  | 

## Example

```python
from openapiopenai.models.run_stream_event_one_of2 import RunStreamEventOneOf2

# TODO update the JSON string below
json = "{}"
# create an instance of RunStreamEventOneOf2 from a JSON string
run_stream_event_one_of2_instance = RunStreamEventOneOf2.from_json(json)
# print the JSON string representation of the object
print(RunStreamEventOneOf2.to_json())

# convert the object into a dict
run_stream_event_one_of2_dict = run_stream_event_one_of2_instance.to_dict()
# create an instance of RunStreamEventOneOf2 from a dict
run_stream_event_one_of2_from_dict = RunStreamEventOneOf2.from_dict(run_stream_event_one_of2_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


