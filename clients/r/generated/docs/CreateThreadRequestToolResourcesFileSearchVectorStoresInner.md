# openapi::CreateThreadRequestToolResourcesFileSearchVectorStoresInner


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**file_ids** | **array[character]** | A list of [file](/docs/api-reference/files) IDs to add to the vector store. There can be a maximum of 10000 files in a vector store.  | [optional] [Max. items: 10000] 
**chunking_strategy** | [**CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy**](CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy.md) |  | [optional] 
**metadata** | **object** | Set of 16 key-value pairs that can be attached to a vector store. This can be useful for storing additional information about the vector store in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | [optional] 


