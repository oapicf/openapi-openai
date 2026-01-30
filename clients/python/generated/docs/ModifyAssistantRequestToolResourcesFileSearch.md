# ModifyAssistantRequestToolResourcesFileSearch


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**vector_store_ids** | **List[str]** | Overrides the [vector store](/docs/api-reference/vector-stores/object) attached to this assistant. There can be a maximum of 1 vector store attached to the assistant.  | [optional] 

## Example

```python
from openapiopenai.models.modify_assistant_request_tool_resources_file_search import ModifyAssistantRequestToolResourcesFileSearch

# TODO update the JSON string below
json = "{}"
# create an instance of ModifyAssistantRequestToolResourcesFileSearch from a JSON string
modify_assistant_request_tool_resources_file_search_instance = ModifyAssistantRequestToolResourcesFileSearch.from_json(json)
# print the JSON string representation of the object
print(ModifyAssistantRequestToolResourcesFileSearch.to_json())

# convert the object into a dict
modify_assistant_request_tool_resources_file_search_dict = modify_assistant_request_tool_resources_file_search_instance.to_dict()
# create an instance of ModifyAssistantRequestToolResourcesFileSearch from a dict
modify_assistant_request_tool_resources_file_search_from_dict = ModifyAssistantRequestToolResourcesFileSearch.from_dict(modify_assistant_request_tool_resources_file_search_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


