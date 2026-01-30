# openapi::VectorStoreObject

A vector store is a collection of processed files can be used by the `file_search` tool.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **character** | The identifier, which can be referenced in API endpoints. | 
**object** | **character** | The object type, which is always &#x60;vector_store&#x60;. | [Enum: [vector_store]] 
**created_at** | **integer** | The Unix timestamp (in seconds) for when the vector store was created. | 
**name** | **character** | The name of the vector store. | 
**usage_bytes** | **integer** | The total number of bytes used by the files in the vector store. | 
**file_counts** | [**VectorStoreObjectFileCounts**](VectorStoreObject_file_counts.md) |  | 
**status** | **character** | The status of the vector store, which can be either &#x60;expired&#x60;, &#x60;in_progress&#x60;, or &#x60;completed&#x60;. A status of &#x60;completed&#x60; indicates that the vector store is ready for use. | [Enum: [expired, in_progress, completed]] 
**expires_after** | [**VectorStoreExpirationAfter**](VectorStoreExpirationAfter.md) |  | [optional] 
**expires_at** | **integer** | The Unix timestamp (in seconds) for when the vector store will expire. | [optional] 
**last_active_at** | **integer** | The Unix timestamp (in seconds) for when the vector store was last active. | 
**metadata** | **object** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | 


