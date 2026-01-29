# RunStepStreamEventOneOf

Occurs when a [run step](/docs/api-reference/runs/step-object) is created.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event** | **str** |  | 
**data** | [**RunStepObject**](RunStepObject.md) |  | 

## Example

```python
from openapiopenai.models.run_step_stream_event_one_of import RunStepStreamEventOneOf

# TODO update the JSON string below
json = "{}"
# create an instance of RunStepStreamEventOneOf from a JSON string
run_step_stream_event_one_of_instance = RunStepStreamEventOneOf.from_json(json)
# print the JSON string representation of the object
print(RunStepStreamEventOneOf.to_json())

# convert the object into a dict
run_step_stream_event_one_of_dict = run_step_stream_event_one_of_instance.to_dict()
# create an instance of RunStepStreamEventOneOf from a dict
run_step_stream_event_one_of_from_dict = RunStepStreamEventOneOf.from_dict(run_step_stream_event_one_of_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


