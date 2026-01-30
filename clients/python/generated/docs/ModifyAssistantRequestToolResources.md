# ModifyAssistantRequestToolResources

A set of resources that are used by the assistant's tools. The resources are specific to the type of tool. For example, the `code_interpreter` tool requires a list of file IDs, while the `file_search` tool requires a list of vector store IDs. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code_interpreter** | [**ModifyAssistantRequestToolResourcesCodeInterpreter**](ModifyAssistantRequestToolResourcesCodeInterpreter.md) |  | [optional] 
**file_search** | [**ModifyAssistantRequestToolResourcesFileSearch**](ModifyAssistantRequestToolResourcesFileSearch.md) |  | [optional] 

## Example

```python
from openapiopenai.models.modify_assistant_request_tool_resources import ModifyAssistantRequestToolResources

# TODO update the JSON string below
json = "{}"
# create an instance of ModifyAssistantRequestToolResources from a JSON string
modify_assistant_request_tool_resources_instance = ModifyAssistantRequestToolResources.from_json(json)
# print the JSON string representation of the object
print(ModifyAssistantRequestToolResources.to_json())

# convert the object into a dict
modify_assistant_request_tool_resources_dict = modify_assistant_request_tool_resources_instance.to_dict()
# create an instance of ModifyAssistantRequestToolResources from a dict
modify_assistant_request_tool_resources_from_dict = ModifyAssistantRequestToolResources.from_dict(modify_assistant_request_tool_resources_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


