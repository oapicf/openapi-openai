# CreateAssistantRequestToolResourcesCodeInterpreter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**file_ids** | **List[str]** | A list of [file](/docs/api-reference/files) IDs made available to the &#x60;code_interpreter&#x60; tool. There can be a maximum of 20 files associated with the tool.  | [optional] [default to []]

## Example

```python
from openapiopenai.models.create_assistant_request_tool_resources_code_interpreter import CreateAssistantRequestToolResourcesCodeInterpreter

# TODO update the JSON string below
json = "{}"
# create an instance of CreateAssistantRequestToolResourcesCodeInterpreter from a JSON string
create_assistant_request_tool_resources_code_interpreter_instance = CreateAssistantRequestToolResourcesCodeInterpreter.from_json(json)
# print the JSON string representation of the object
print(CreateAssistantRequestToolResourcesCodeInterpreter.to_json())

# convert the object into a dict
create_assistant_request_tool_resources_code_interpreter_dict = create_assistant_request_tool_resources_code_interpreter_instance.to_dict()
# create an instance of CreateAssistantRequestToolResourcesCodeInterpreter from a dict
create_assistant_request_tool_resources_code_interpreter_from_dict = CreateAssistantRequestToolResourcesCodeInterpreter.from_dict(create_assistant_request_tool_resources_code_interpreter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


