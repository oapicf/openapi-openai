# RunObjectRequiredAction

Details on the action required to continue the run. Will be `null` if no action is required.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | For now, this is always &#x60;submit_tool_outputs&#x60;. | 
**submit_tool_outputs** | [**RunObjectRequiredActionSubmitToolOutputs**](RunObjectRequiredActionSubmitToolOutputs.md) |  | 

## Example

```python
from openapiopenai.models.run_object_required_action import RunObjectRequiredAction

# TODO update the JSON string below
json = "{}"
# create an instance of RunObjectRequiredAction from a JSON string
run_object_required_action_instance = RunObjectRequiredAction.from_json(json)
# print the JSON string representation of the object
print(RunObjectRequiredAction.to_json())

# convert the object into a dict
run_object_required_action_dict = run_object_required_action_instance.to_dict()
# create an instance of RunObjectRequiredAction from a dict
run_object_required_action_from_dict = RunObjectRequiredAction.from_dict(run_object_required_action_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


