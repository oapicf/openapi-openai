# AssistantObjectToolResourcesCodeInterpreter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**file_ids** | **List[str]** | A list of [file](/docs/api-reference/files) IDs made available to the &#x60;code_interpreter&#x60;&#x60; tool. There can be a maximum of 20 files associated with the tool.  | [optional] [default to []]

## Example

```python
from openapiopenai.models.assistant_object_tool_resources_code_interpreter import AssistantObjectToolResourcesCodeInterpreter

# TODO update the JSON string below
json = "{}"
# create an instance of AssistantObjectToolResourcesCodeInterpreter from a JSON string
assistant_object_tool_resources_code_interpreter_instance = AssistantObjectToolResourcesCodeInterpreter.from_json(json)
# print the JSON string representation of the object
print(AssistantObjectToolResourcesCodeInterpreter.to_json())

# convert the object into a dict
assistant_object_tool_resources_code_interpreter_dict = assistant_object_tool_resources_code_interpreter_instance.to_dict()
# create an instance of AssistantObjectToolResourcesCodeInterpreter from a dict
assistant_object_tool_resources_code_interpreter_from_dict = AssistantObjectToolResourcesCodeInterpreter.from_dict(assistant_object_tool_resources_code_interpreter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


