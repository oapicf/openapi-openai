# RunStepStreamEventOneOf2

Occurs when parts of a [run step](/docs/api-reference/runs/step-object) are being streamed.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event** | **str** |  | 
**data** | [**RunStepDeltaObject**](RunStepDeltaObject.md) |  | 

## Example

```python
from openapiopenai.models.run_step_stream_event_one_of2 import RunStepStreamEventOneOf2

# TODO update the JSON string below
json = "{}"
# create an instance of RunStepStreamEventOneOf2 from a JSON string
run_step_stream_event_one_of2_instance = RunStepStreamEventOneOf2.from_json(json)
# print the JSON string representation of the object
print(RunStepStreamEventOneOf2.to_json())

# convert the object into a dict
run_step_stream_event_one_of2_dict = run_step_stream_event_one_of2_instance.to_dict()
# create an instance of RunStepStreamEventOneOf2 from a dict
run_step_stream_event_one_of2_from_dict = RunStepStreamEventOneOf2.from_dict(run_step_stream_event_one_of2_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


