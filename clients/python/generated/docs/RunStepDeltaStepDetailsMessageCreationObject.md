# RunStepDeltaStepDetailsMessageCreationObject

Details of the message creation by the run step.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | Always &#x60;message_creation&#x60;. | 
**message_creation** | [**RunStepDeltaStepDetailsMessageCreationObjectMessageCreation**](RunStepDeltaStepDetailsMessageCreationObjectMessageCreation.md) |  | [optional] 

## Example

```python
from openapiopenai.models.run_step_delta_step_details_message_creation_object import RunStepDeltaStepDetailsMessageCreationObject

# TODO update the JSON string below
json = "{}"
# create an instance of RunStepDeltaStepDetailsMessageCreationObject from a JSON string
run_step_delta_step_details_message_creation_object_instance = RunStepDeltaStepDetailsMessageCreationObject.from_json(json)
# print the JSON string representation of the object
print(RunStepDeltaStepDetailsMessageCreationObject.to_json())

# convert the object into a dict
run_step_delta_step_details_message_creation_object_dict = run_step_delta_step_details_message_creation_object_instance.to_dict()
# create an instance of RunStepDeltaStepDetailsMessageCreationObject from a dict
run_step_delta_step_details_message_creation_object_form_dict = run_step_delta_step_details_message_creation_object.from_dict(run_step_delta_step_details_message_creation_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


