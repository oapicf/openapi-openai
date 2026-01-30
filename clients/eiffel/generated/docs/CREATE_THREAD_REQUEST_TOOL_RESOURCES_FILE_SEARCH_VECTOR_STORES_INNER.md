# CREATE_THREAD_REQUEST_TOOL_RESOURCES_FILE_SEARCH_VECTOR_STORES_INNER

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**file_ids** | [**LIST [STRING_32]**](STRING_32.md) | A list of [file](/docs/api-reference/files) IDs to add to the vector store. There can be a maximum of 10000 files in a vector store.  | [optional] [default to null]
**chunking_strategy** | [**CREATE_ASSISTANT_REQUEST_TOOL_RESOURCES_FILE_SEARCH_VECTOR_STORES_INNER_CHUNKING_STRATEGY**](CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy.md) |  | [optional] [default to null]
**metadata** | [**ANY**](.md) | Set of 16 key-value pairs that can be attached to a vector store. This can be useful for storing additional information about the vector store in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


