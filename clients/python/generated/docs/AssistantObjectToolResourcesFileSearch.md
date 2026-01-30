# AssistantObjectToolResourcesFileSearch


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**vector_store_ids** | **List[str]** | The ID of the [vector store](/docs/api-reference/vector-stores/object) attached to this assistant. There can be a maximum of 1 vector store attached to the assistant.  | [optional] 

## Example

```python
from openapiopenai.models.assistant_object_tool_resources_file_search import AssistantObjectToolResourcesFileSearch

# TODO update the JSON string below
json = "{}"
# create an instance of AssistantObjectToolResourcesFileSearch from a JSON string
assistant_object_tool_resources_file_search_instance = AssistantObjectToolResourcesFileSearch.from_json(json)
# print the JSON string representation of the object
print(AssistantObjectToolResourcesFileSearch.to_json())

# convert the object into a dict
assistant_object_tool_resources_file_search_dict = assistant_object_tool_resources_file_search_instance.to_dict()
# create an instance of AssistantObjectToolResourcesFileSearch from a dict
assistant_object_tool_resources_file_search_from_dict = AssistantObjectToolResourcesFileSearch.from_dict(assistant_object_tool_resources_file_search_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


