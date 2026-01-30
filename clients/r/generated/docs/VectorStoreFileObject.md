# openapi::VectorStoreFileObject

A list of files attached to a vector store.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **character** | The identifier, which can be referenced in API endpoints. | 
**object** | **character** | The object type, which is always &#x60;vector_store.file&#x60;. | [Enum: [vector_store.file]] 
**usage_bytes** | **integer** | The total vector store usage in bytes. Note that this may be different from the original file size. | 
**created_at** | **integer** | The Unix timestamp (in seconds) for when the vector store file was created. | 
**vector_store_id** | **character** | The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to. | 
**status** | **character** | The status of the vector store file, which can be either &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;cancelled&#x60;, or &#x60;failed&#x60;. The status &#x60;completed&#x60; indicates that the vector store file is ready for use. | [Enum: [in_progress, completed, cancelled, failed]] 
**last_error** | [**VectorStoreFileObjectLastError**](VectorStoreFileObject_last_error.md) |  | 
**chunking_strategy** | [**VectorStoreFileObjectChunkingStrategy**](VectorStoreFileObject_chunking_strategy.md) |  | [optional] 


