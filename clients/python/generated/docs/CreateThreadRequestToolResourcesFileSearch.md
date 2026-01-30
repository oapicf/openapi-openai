# CreateThreadRequestToolResourcesFileSearch


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**vector_store_ids** | **List[str]** | The [vector store](/docs/api-reference/vector-stores/object) attached to this thread. There can be a maximum of 1 vector store attached to the thread.  | [optional] 
**vector_stores** | [**List[CreateThreadRequestToolResourcesFileSearchVectorStoresInner]**](CreateThreadRequestToolResourcesFileSearchVectorStoresInner.md) | A helper to create a [vector store](/docs/api-reference/vector-stores/object) with file_ids and attach it to this thread. There can be a maximum of 1 vector store attached to the thread.  | [optional] 

## Example

```python
from openapiopenai.models.create_thread_request_tool_resources_file_search import CreateThreadRequestToolResourcesFileSearch

# TODO update the JSON string below
json = "{}"
# create an instance of CreateThreadRequestToolResourcesFileSearch from a JSON string
create_thread_request_tool_resources_file_search_instance = CreateThreadRequestToolResourcesFileSearch.from_json(json)
# print the JSON string representation of the object
print(CreateThreadRequestToolResourcesFileSearch.to_json())

# convert the object into a dict
create_thread_request_tool_resources_file_search_dict = create_thread_request_tool_resources_file_search_instance.to_dict()
# create an instance of CreateThreadRequestToolResourcesFileSearch from a dict
create_thread_request_tool_resources_file_search_from_dict = CreateThreadRequestToolResourcesFileSearch.from_dict(create_thread_request_tool_resources_file_search_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


