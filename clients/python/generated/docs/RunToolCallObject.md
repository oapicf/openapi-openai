# RunToolCallObject

Tool call objects

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The ID of the tool call. This ID must be referenced when you submit the tool outputs in using the [Submit tool outputs to run](/docs/api-reference/runs/submitToolOutputs) endpoint. | 
**type** | **str** | The type of tool call the output is required for. For now, this is always &#x60;function&#x60;. | 
**function** | [**RunToolCallObjectFunction**](RunToolCallObjectFunction.md) |  | 

## Example

```python
from openapiopenai.models.run_tool_call_object import RunToolCallObject

# TODO update the JSON string below
json = "{}"
# create an instance of RunToolCallObject from a JSON string
run_tool_call_object_instance = RunToolCallObject.from_json(json)
# print the JSON string representation of the object
print(RunToolCallObject.to_json())

# convert the object into a dict
run_tool_call_object_dict = run_tool_call_object_instance.to_dict()
# create an instance of RunToolCallObject from a dict
run_tool_call_object_from_dict = RunToolCallObject.from_dict(run_tool_call_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


