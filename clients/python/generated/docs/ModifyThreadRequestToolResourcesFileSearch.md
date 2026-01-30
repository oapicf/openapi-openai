# ModifyThreadRequestToolResourcesFileSearch


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**vector_store_ids** | **List[str]** | The [vector store](/docs/api-reference/vector-stores/object) attached to this thread. There can be a maximum of 1 vector store attached to the thread.  | [optional] 

## Example

```python
from openapiopenai.models.modify_thread_request_tool_resources_file_search import ModifyThreadRequestToolResourcesFileSearch

# TODO update the JSON string below
json = "{}"
# create an instance of ModifyThreadRequestToolResourcesFileSearch from a JSON string
modify_thread_request_tool_resources_file_search_instance = ModifyThreadRequestToolResourcesFileSearch.from_json(json)
# print the JSON string representation of the object
print(ModifyThreadRequestToolResourcesFileSearch.to_json())

# convert the object into a dict
modify_thread_request_tool_resources_file_search_dict = modify_thread_request_tool_resources_file_search_instance.to_dict()
# create an instance of ModifyThreadRequestToolResourcesFileSearch from a dict
modify_thread_request_tool_resources_file_search_from_dict = ModifyThreadRequestToolResourcesFileSearch.from_dict(modify_thread_request_tool_resources_file_search_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


