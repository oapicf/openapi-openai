# RunObjectRequiredActionSubmitToolOutputs

Details on the tool outputs needed for this run to continue.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tool_calls** | [**List[RunToolCallObject]**](RunToolCallObject.md) | A list of the relevant tool calls. | 

## Example

```python
from openapiopenai.models.run_object_required_action_submit_tool_outputs import RunObjectRequiredActionSubmitToolOutputs

# TODO update the JSON string below
json = "{}"
# create an instance of RunObjectRequiredActionSubmitToolOutputs from a JSON string
run_object_required_action_submit_tool_outputs_instance = RunObjectRequiredActionSubmitToolOutputs.from_json(json)
# print the JSON string representation of the object
print(RunObjectRequiredActionSubmitToolOutputs.to_json())

# convert the object into a dict
run_object_required_action_submit_tool_outputs_dict = run_object_required_action_submit_tool_outputs_instance.to_dict()
# create an instance of RunObjectRequiredActionSubmitToolOutputs from a dict
run_object_required_action_submit_tool_outputs_form_dict = run_object_required_action_submit_tool_outputs.from_dict(run_object_required_action_submit_tool_outputs_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


