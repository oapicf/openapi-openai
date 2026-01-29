# RunStepDeltaObject

Represents a run step delta i.e. any changed fields on a run step during streaming. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The identifier of the run step, which can be referenced in API endpoints. | 
**object** | **str** | The object type, which is always &#x60;thread.run.step.delta&#x60;. | 
**delta** | [**RunStepDeltaObjectDelta**](RunStepDeltaObjectDelta.md) |  | 

## Example

```python
from openapiopenai.models.run_step_delta_object import RunStepDeltaObject

# TODO update the JSON string below
json = "{}"
# create an instance of RunStepDeltaObject from a JSON string
run_step_delta_object_instance = RunStepDeltaObject.from_json(json)
# print the JSON string representation of the object
print(RunStepDeltaObject.to_json())

# convert the object into a dict
run_step_delta_object_dict = run_step_delta_object_instance.to_dict()
# create an instance of RunStepDeltaObject from a dict
run_step_delta_object_from_dict = RunStepDeltaObject.from_dict(run_step_delta_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


