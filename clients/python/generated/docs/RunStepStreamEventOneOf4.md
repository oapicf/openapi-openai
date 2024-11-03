# RunStepStreamEventOneOf4

Occurs when a [run step](/docs/api-reference/runs/step-object) fails.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event** | **str** |  | 
**data** | [**RunStepObject**](RunStepObject.md) |  | 

## Example

```python
from openapiopenai.models.run_step_stream_event_one_of4 import RunStepStreamEventOneOf4

# TODO update the JSON string below
json = "{}"
# create an instance of RunStepStreamEventOneOf4 from a JSON string
run_step_stream_event_one_of4_instance = RunStepStreamEventOneOf4.from_json(json)
# print the JSON string representation of the object
print(RunStepStreamEventOneOf4.to_json())

# convert the object into a dict
run_step_stream_event_one_of4_dict = run_step_stream_event_one_of4_instance.to_dict()
# create an instance of RunStepStreamEventOneOf4 from a dict
run_step_stream_event_one_of4_from_dict = RunStepStreamEventOneOf4.from_dict(run_step_stream_event_one_of4_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


