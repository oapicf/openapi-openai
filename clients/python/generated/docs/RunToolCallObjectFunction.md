# RunToolCallObjectFunction

The function definition.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | The name of the function. | 
**arguments** | **str** | The arguments that the model expects you to pass to the function. | 

## Example

```python
from openapiopenai.models.run_tool_call_object_function import RunToolCallObjectFunction

# TODO update the JSON string below
json = "{}"
# create an instance of RunToolCallObjectFunction from a JSON string
run_tool_call_object_function_instance = RunToolCallObjectFunction.from_json(json)
# print the JSON string representation of the object
print(RunToolCallObjectFunction.to_json())

# convert the object into a dict
run_tool_call_object_function_dict = run_tool_call_object_function_instance.to_dict()
# create an instance of RunToolCallObjectFunction from a dict
run_tool_call_object_function_from_dict = RunToolCallObjectFunction.from_dict(run_tool_call_object_function_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


