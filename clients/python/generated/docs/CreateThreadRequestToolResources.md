# CreateThreadRequestToolResources

A set of resources that are made available to the assistant's tools in this thread. The resources are specific to the type of tool. For example, the `code_interpreter` tool requires a list of file IDs, while the `file_search` tool requires a list of vector store IDs. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code_interpreter** | [**CreateAssistantRequestToolResourcesCodeInterpreter**](CreateAssistantRequestToolResourcesCodeInterpreter.md) |  | [optional] 
**file_search** | [**CreateThreadRequestToolResourcesFileSearch**](CreateThreadRequestToolResourcesFileSearch.md) |  | [optional] 

## Example

```python
from openapiopenai.models.create_thread_request_tool_resources import CreateThreadRequestToolResources

# TODO update the JSON string below
json = "{}"
# create an instance of CreateThreadRequestToolResources from a JSON string
create_thread_request_tool_resources_instance = CreateThreadRequestToolResources.from_json(json)
# print the JSON string representation of the object
print(CreateThreadRequestToolResources.to_json())

# convert the object into a dict
create_thread_request_tool_resources_dict = create_thread_request_tool_resources_instance.to_dict()
# create an instance of CreateThreadRequestToolResources from a dict
create_thread_request_tool_resources_from_dict = CreateThreadRequestToolResources.from_dict(create_thread_request_tool_resources_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


