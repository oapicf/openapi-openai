# RunStepDeltaStepDetailsToolCallsCodeOutputImageObject


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **int** | The index of the output in the outputs array. | 
**type** | **str** | Always &#x60;image&#x60;. | 
**image** | [**RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage**](RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage.md) |  | [optional] 

## Example

```python
from openapiopenai.models.run_step_delta_step_details_tool_calls_code_output_image_object import RunStepDeltaStepDetailsToolCallsCodeOutputImageObject

# TODO update the JSON string below
json = "{}"
# create an instance of RunStepDeltaStepDetailsToolCallsCodeOutputImageObject from a JSON string
run_step_delta_step_details_tool_calls_code_output_image_object_instance = RunStepDeltaStepDetailsToolCallsCodeOutputImageObject.from_json(json)
# print the JSON string representation of the object
print(RunStepDeltaStepDetailsToolCallsCodeOutputImageObject.to_json())

# convert the object into a dict
run_step_delta_step_details_tool_calls_code_output_image_object_dict = run_step_delta_step_details_tool_calls_code_output_image_object_instance.to_dict()
# create an instance of RunStepDeltaStepDetailsToolCallsCodeOutputImageObject from a dict
run_step_delta_step_details_tool_calls_code_output_image_object_form_dict = run_step_delta_step_details_tool_calls_code_output_image_object.from_dict(run_step_delta_step_details_tool_calls_code_output_image_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


