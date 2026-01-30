# openapi::CreateVectorStoreFileBatchRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**file_ids** | **array[character]** | A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like &#x60;file_search&#x60; that can access files. | [Max. items: 500] [Min. items: 1] 
**chunking_strategy** | [**ChunkingStrategyRequestParam**](ChunkingStrategyRequestParam.md) |  | [optional] 


