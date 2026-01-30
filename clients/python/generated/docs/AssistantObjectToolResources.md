# AssistantObjectToolResources

A set of resources that are used by the assistant's tools. The resources are specific to the type of tool. For example, the `code_interpreter` tool requires a list of file IDs, while the `file_search` tool requires a list of vector store IDs. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code_interpreter** | [**AssistantObjectToolResourcesCodeInterpreter**](AssistantObjectToolResourcesCodeInterpreter.md) |  | [optional] 
**file_search** | [**AssistantObjectToolResourcesFileSearch**](AssistantObjectToolResourcesFileSearch.md) |  | [optional] 

## Example

```python
from openapiopenai.models.assistant_object_tool_resources import AssistantObjectToolResources

# TODO update the JSON string below
json = "{}"
# create an instance of AssistantObjectToolResources from a JSON string
assistant_object_tool_resources_instance = AssistantObjectToolResources.from_json(json)
# print the JSON string representation of the object
print(AssistantObjectToolResources.to_json())

# convert the object into a dict
assistant_object_tool_resources_dict = assistant_object_tool_resources_instance.to_dict()
# create an instance of AssistantObjectToolResources from a dict
assistant_object_tool_resources_from_dict = AssistantObjectToolResources.from_dict(assistant_object_tool_resources_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


