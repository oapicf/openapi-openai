# RunStepStreamEventOneOf5

Occurs when a [run step](/docs/api-reference/runs/step-object) is cancelled.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event** | **str** |  | 
**data** | [**RunStepObject**](RunStepObject.md) |  | 

## Example

```python
from openapiopenai.models.run_step_stream_event_one_of5 import RunStepStreamEventOneOf5

# TODO update the JSON string below
json = "{}"
# create an instance of RunStepStreamEventOneOf5 from a JSON string
run_step_stream_event_one_of5_instance = RunStepStreamEventOneOf5.from_json(json)
# print the JSON string representation of the object
print(RunStepStreamEventOneOf5.to_json())

# convert the object into a dict
run_step_stream_event_one_of5_dict = run_step_stream_event_one_of5_instance.to_dict()
# create an instance of RunStepStreamEventOneOf5 from a dict
run_step_stream_event_one_of5_form_dict = run_step_stream_event_one_of5.from_dict(run_step_stream_event_one_of5_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


