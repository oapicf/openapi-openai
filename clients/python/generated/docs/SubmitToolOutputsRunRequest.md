# SubmitToolOutputsRunRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tool_outputs** | [**List[SubmitToolOutputsRunRequestToolOutputsInner]**](SubmitToolOutputsRunRequestToolOutputsInner.md) | A list of tools for which the outputs are being submitted. | 
**stream** | **bool** | If &#x60;true&#x60;, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a &#x60;data: [DONE]&#x60; message.  | [optional] 

## Example

```python
from openapiopenai.models.submit_tool_outputs_run_request import SubmitToolOutputsRunRequest

# TODO update the JSON string below
json = "{}"
# create an instance of SubmitToolOutputsRunRequest from a JSON string
submit_tool_outputs_run_request_instance = SubmitToolOutputsRunRequest.from_json(json)
# print the JSON string representation of the object
print(SubmitToolOutputsRunRequest.to_json())

# convert the object into a dict
submit_tool_outputs_run_request_dict = submit_tool_outputs_run_request_instance.to_dict()
# create an instance of SubmitToolOutputsRunRequest from a dict
submit_tool_outputs_run_request_from_dict = SubmitToolOutputsRunRequest.from_dict(submit_tool_outputs_run_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


