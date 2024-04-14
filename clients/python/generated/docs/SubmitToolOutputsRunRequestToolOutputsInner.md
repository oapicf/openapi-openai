# SubmitToolOutputsRunRequestToolOutputsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tool_call_id** | **str** | The ID of the tool call in the &#x60;required_action&#x60; object within the run object the output is being submitted for. | [optional] 
**output** | **str** | The output of the tool call to be submitted to continue the run. | [optional] 

## Example

```python
from openapiopenai.models.submit_tool_outputs_run_request_tool_outputs_inner import SubmitToolOutputsRunRequestToolOutputsInner

# TODO update the JSON string below
json = "{}"
# create an instance of SubmitToolOutputsRunRequestToolOutputsInner from a JSON string
submit_tool_outputs_run_request_tool_outputs_inner_instance = SubmitToolOutputsRunRequestToolOutputsInner.from_json(json)
# print the JSON string representation of the object
print(SubmitToolOutputsRunRequestToolOutputsInner.to_json())

# convert the object into a dict
submit_tool_outputs_run_request_tool_outputs_inner_dict = submit_tool_outputs_run_request_tool_outputs_inner_instance.to_dict()
# create an instance of SubmitToolOutputsRunRequestToolOutputsInner from a dict
submit_tool_outputs_run_request_tool_outputs_inner_form_dict = submit_tool_outputs_run_request_tool_outputs_inner.from_dict(submit_tool_outputs_run_request_tool_outputs_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


