# RunStepStreamEventOneOf6

Occurs when a [run step](/docs/api-reference/runs/step-object) expires.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event** | **str** |  | 
**data** | [**RunStepObject**](RunStepObject.md) |  | 

## Example

```python
from openapiopenai.models.run_step_stream_event_one_of6 import RunStepStreamEventOneOf6

# TODO update the JSON string below
json = "{}"
# create an instance of RunStepStreamEventOneOf6 from a JSON string
run_step_stream_event_one_of6_instance = RunStepStreamEventOneOf6.from_json(json)
# print the JSON string representation of the object
print(RunStepStreamEventOneOf6.to_json())

# convert the object into a dict
run_step_stream_event_one_of6_dict = run_step_stream_event_one_of6_instance.to_dict()
# create an instance of RunStepStreamEventOneOf6 from a dict
run_step_stream_event_one_of6_from_dict = RunStepStreamEventOneOf6.from_dict(run_step_stream_event_one_of6_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


