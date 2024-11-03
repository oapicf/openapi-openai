# RunStepDeltaObjectDelta

The delta containing the fields that have changed on the run step.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**step_details** | [**RunStepDeltaObjectDeltaStepDetails**](RunStepDeltaObjectDeltaStepDetails.md) |  | [optional] 

## Example

```python
from openapiopenai.models.run_step_delta_object_delta import RunStepDeltaObjectDelta

# TODO update the JSON string below
json = "{}"
# create an instance of RunStepDeltaObjectDelta from a JSON string
run_step_delta_object_delta_instance = RunStepDeltaObjectDelta.from_json(json)
# print the JSON string representation of the object
print(RunStepDeltaObjectDelta.to_json())

# convert the object into a dict
run_step_delta_object_delta_dict = run_step_delta_object_delta_instance.to_dict()
# create an instance of RunStepDeltaObjectDelta from a dict
run_step_delta_object_delta_from_dict = RunStepDeltaObjectDelta.from_dict(run_step_delta_object_delta_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


