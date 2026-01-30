# openapi::CreateVectorStoreRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**file_ids** | **array[character]** | A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like &#x60;file_search&#x60; that can access files. | [optional] [Max. items: 500] 
**name** | **character** | The name of the vector store. | [optional] 
**expires_after** | [**VectorStoreExpirationAfter**](VectorStoreExpirationAfter.md) |  | [optional] 
**chunking_strategy** | [**CreateVectorStoreRequestChunkingStrategy**](CreateVectorStoreRequest_chunking_strategy.md) |  | [optional] 
**metadata** | **object** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | [optional] 


