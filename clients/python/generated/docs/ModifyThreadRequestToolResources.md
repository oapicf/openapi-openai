# ModifyThreadRequestToolResources

A set of resources that are made available to the assistant's tools in this thread. The resources are specific to the type of tool. For example, the `code_interpreter` tool requires a list of file IDs, while the `file_search` tool requires a list of vector store IDs. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code_interpreter** | [**CreateAssistantRequestToolResourcesCodeInterpreter**](CreateAssistantRequestToolResourcesCodeInterpreter.md) |  | [optional] 
**file_search** | [**ModifyThreadRequestToolResourcesFileSearch**](ModifyThreadRequestToolResourcesFileSearch.md) |  | [optional] 

## Example

```python
from openapiopenai.models.modify_thread_request_tool_resources import ModifyThreadRequestToolResources

# TODO update the JSON string below
json = "{}"
# create an instance of ModifyThreadRequestToolResources from a JSON string
modify_thread_request_tool_resources_instance = ModifyThreadRequestToolResources.from_json(json)
# print the JSON string representation of the object
print(ModifyThreadRequestToolResources.to_json())

# convert the object into a dict
modify_thread_request_tool_resources_dict = modify_thread_request_tool_resources_instance.to_dict()
# create an instance of ModifyThreadRequestToolResources from a dict
modify_thread_request_tool_resources_from_dict = ModifyThreadRequestToolResources.from_dict(modify_thread_request_tool_resources_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


