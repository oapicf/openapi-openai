# Org.OpenAPITools.Model.VectorStoreObject
A vector store is a collection of processed files can be used by the `file_search` tool.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | The identifier, which can be referenced in API endpoints. | 
**Object** | **string** | The object type, which is always &#x60;vector_store&#x60;. | 
**CreatedAt** | **int** | The Unix timestamp (in seconds) for when the vector store was created. | 
**Name** | **string** | The name of the vector store. | 
**UsageBytes** | **int** | The total number of bytes used by the files in the vector store. | 
**FileCounts** | [**VectorStoreObjectFileCounts**](VectorStoreObjectFileCounts.md) |  | 
**Status** | **string** | The status of the vector store, which can be either &#x60;expired&#x60;, &#x60;in_progress&#x60;, or &#x60;completed&#x60;. A status of &#x60;completed&#x60; indicates that the vector store is ready for use. | 
**ExpiresAfter** | [**VectorStoreExpirationAfter**](VectorStoreExpirationAfter.md) |  | [optional] 
**ExpiresAt** | **int** | The Unix timestamp (in seconds) for when the vector store will expire. | [optional] 
**LastActiveAt** | **int** | The Unix timestamp (in seconds) for when the vector store was last active. | 
**Metadata** | **Object** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

