# ModifyAssistantRequestToolResourcesCodeInterpreter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**file_ids** | **List[str]** | Overrides the list of [file](/docs/api-reference/files) IDs made available to the &#x60;code_interpreter&#x60; tool. There can be a maximum of 20 files associated with the tool.  | [optional] [default to []]

## Example

```python
from openapiopenai.models.modify_assistant_request_tool_resources_code_interpreter import ModifyAssistantRequestToolResourcesCodeInterpreter

# TODO update the JSON string below
json = "{}"
# create an instance of ModifyAssistantRequestToolResourcesCodeInterpreter from a JSON string
modify_assistant_request_tool_resources_code_interpreter_instance = ModifyAssistantRequestToolResourcesCodeInterpreter.from_json(json)
# print the JSON string representation of the object
print(ModifyAssistantRequestToolResourcesCodeInterpreter.to_json())

# convert the object into a dict
modify_assistant_request_tool_resources_code_interpreter_dict = modify_assistant_request_tool_resources_code_interpreter_instance.to_dict()
# create an instance of ModifyAssistantRequestToolResourcesCodeInterpreter from a dict
modify_assistant_request_tool_resources_code_interpreter_from_dict = ModifyAssistantRequestToolResourcesCodeInterpreter.from_dict(modify_assistant_request_tool_resources_code_interpreter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


