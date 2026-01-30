# CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy

The chunking strategy used to chunk the file(s). If not set, will use the `auto` strategy.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | Always &#x60;auto&#x60;. | 
**static** | [**StaticChunkingStrategyStatic**](StaticChunkingStrategyStatic.md) |  | 

## Example

```python
from openapiopenai.models.create_assistant_request_tool_resources_file_search_vector_stores_inner_chunking_strategy import CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy

# TODO update the JSON string below
json = "{}"
# create an instance of CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy from a JSON string
create_assistant_request_tool_resources_file_search_vector_stores_inner_chunking_strategy_instance = CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy.from_json(json)
# print the JSON string representation of the object
print(CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy.to_json())

# convert the object into a dict
create_assistant_request_tool_resources_file_search_vector_stores_inner_chunking_strategy_dict = create_assistant_request_tool_resources_file_search_vector_stores_inner_chunking_strategy_instance.to_dict()
# create an instance of CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy from a dict
create_assistant_request_tool_resources_file_search_vector_stores_inner_chunking_strategy_from_dict = CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy.from_dict(create_assistant_request_tool_resources_file_search_vector_stores_inner_chunking_strategy_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


