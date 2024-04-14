# RunStepDetailsToolCallsCodeOutputImageObject


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | Always &#x60;image&#x60;. | 
**image** | [**RunStepDetailsToolCallsCodeOutputImageObjectImage**](RunStepDetailsToolCallsCodeOutputImageObjectImage.md) |  | 

## Example

```python
from openapiopenai.models.run_step_details_tool_calls_code_output_image_object import RunStepDetailsToolCallsCodeOutputImageObject

# TODO update the JSON string below
json = "{}"
# create an instance of RunStepDetailsToolCallsCodeOutputImageObject from a JSON string
run_step_details_tool_calls_code_output_image_object_instance = RunStepDetailsToolCallsCodeOutputImageObject.from_json(json)
# print the JSON string representation of the object
print(RunStepDetailsToolCallsCodeOutputImageObject.to_json())

# convert the object into a dict
run_step_details_tool_calls_code_output_image_object_dict = run_step_details_tool_calls_code_output_image_object_instance.to_dict()
# create an instance of RunStepDetailsToolCallsCodeOutputImageObject from a dict
run_step_details_tool_calls_code_output_image_object_form_dict = run_step_details_tool_calls_code_output_image_object.from_dict(run_step_details_tool_calls_code_output_image_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


