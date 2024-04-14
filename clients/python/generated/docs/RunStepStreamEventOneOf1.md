# RunStepStreamEventOneOf1

Occurs when a [run step](/docs/api-reference/runs/step-object) moves to an `in_progress` state.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event** | **str** |  | 
**data** | [**RunStepObject**](RunStepObject.md) |  | 

## Example

```python
from openapiopenai.models.run_step_stream_event_one_of1 import RunStepStreamEventOneOf1

# TODO update the JSON string below
json = "{}"
# create an instance of RunStepStreamEventOneOf1 from a JSON string
run_step_stream_event_one_of1_instance = RunStepStreamEventOneOf1.from_json(json)
# print the JSON string representation of the object
print(RunStepStreamEventOneOf1.to_json())

# convert the object into a dict
run_step_stream_event_one_of1_dict = run_step_stream_event_one_of1_instance.to_dict()
# create an instance of RunStepStreamEventOneOf1 from a dict
run_step_stream_event_one_of1_form_dict = run_step_stream_event_one_of1.from_dict(run_step_stream_event_one_of1_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


