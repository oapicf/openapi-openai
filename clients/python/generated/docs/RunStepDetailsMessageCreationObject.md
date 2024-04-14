# RunStepDetailsMessageCreationObject

Details of the message creation by the run step.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | Always &#x60;message_creation&#x60;. | 
**message_creation** | [**RunStepDetailsMessageCreationObjectMessageCreation**](RunStepDetailsMessageCreationObjectMessageCreation.md) |  | 

## Example

```python
from openapiopenai.models.run_step_details_message_creation_object import RunStepDetailsMessageCreationObject

# TODO update the JSON string below
json = "{}"
# create an instance of RunStepDetailsMessageCreationObject from a JSON string
run_step_details_message_creation_object_instance = RunStepDetailsMessageCreationObject.from_json(json)
# print the JSON string representation of the object
print(RunStepDetailsMessageCreationObject.to_json())

# convert the object into a dict
run_step_details_message_creation_object_dict = run_step_details_message_creation_object_instance.to_dict()
# create an instance of RunStepDetailsMessageCreationObject from a dict
run_step_details_message_creation_object_form_dict = run_step_details_message_creation_object.from_dict(run_step_details_message_creation_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


