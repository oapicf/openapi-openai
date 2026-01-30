# openapi::VectorStoreFileBatchObject

A batch of files attached to a vector store.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **character** | The identifier, which can be referenced in API endpoints. | 
**object** | **character** | The object type, which is always &#x60;vector_store.file_batch&#x60;. | [Enum: [vector_store.files_batch]] 
**created_at** | **integer** | The Unix timestamp (in seconds) for when the vector store files batch was created. | 
**vector_store_id** | **character** | The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to. | 
**status** | **character** | The status of the vector store files batch, which can be either &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;cancelled&#x60; or &#x60;failed&#x60;. | [Enum: [in_progress, completed, cancelled, failed]] 
**file_counts** | [**VectorStoreFileBatchObjectFileCounts**](VectorStoreFileBatchObject_file_counts.md) |  | 


