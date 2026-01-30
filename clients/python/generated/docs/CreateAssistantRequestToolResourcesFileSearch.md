# CreateAssistantRequestToolResourcesFileSearch


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**vector_store_ids** | **List[str]** | The [vector store](/docs/api-reference/vector-stores/object) attached to this assistant. There can be a maximum of 1 vector store attached to the assistant.  | [optional] 
**vector_stores** | [**List[CreateAssistantRequestToolResourcesFileSearchVectorStoresInner]**](CreateAssistantRequestToolResourcesFileSearchVectorStoresInner.md) | A helper to create a [vector store](/docs/api-reference/vector-stores/object) with file_ids and attach it to this assistant. There can be a maximum of 1 vector store attached to the assistant.  | [optional] 

## Example

```python
from openapiopenai.models.create_assistant_request_tool_resources_file_search import CreateAssistantRequestToolResourcesFileSearch

# TODO update the JSON string below
json = "{}"
# create an instance of CreateAssistantRequestToolResourcesFileSearch from a JSON string
create_assistant_request_tool_resources_file_search_instance = CreateAssistantRequestToolResourcesFileSearch.from_json(json)
# print the JSON string representation of the object
print(CreateAssistantRequestToolResourcesFileSearch.to_json())

# convert the object into a dict
create_assistant_request_tool_resources_file_search_dict = create_assistant_request_tool_resources_file_search_instance.to_dict()
# create an instance of CreateAssistantRequestToolResourcesFileSearch from a dict
create_assistant_request_tool_resources_file_search_from_dict = CreateAssistantRequestToolResourcesFileSearch.from_dict(create_assistant_request_tool_resources_file_search_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


