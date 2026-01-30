# VectorStoreObject

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | The identifier, which can be referenced in API endpoints. | 
**object** | **string** | The object type, which is always &#x60;vector_store&#x60;. | 
**createdAt** | **int** | The Unix timestamp (in seconds) for when the vector store was created. | 
**name** | **string** | The name of the vector store. | 
**usageBytes** | **int** | The total number of bytes used by the files in the vector store. | 
**fileCounts** | [**OpenAPI\Server\Model\VectorStoreObjectFileCounts**](VectorStoreObjectFileCounts.md) |  | 
**status** | **string** | The status of the vector store, which can be either &#x60;expired&#x60;, &#x60;in_progress&#x60;, or &#x60;completed&#x60;. A status of &#x60;completed&#x60; indicates that the vector store is ready for use. | 
**expiresAfter** | [**OpenAPI\Server\Model\VectorStoreExpirationAfter**](VectorStoreExpirationAfter.md) |  | [optional] 
**expiresAt** | **int** | The Unix timestamp (in seconds) for when the vector store will expire. | [optional] 
**lastActiveAt** | **int** | The Unix timestamp (in seconds) for when the vector store was last active. | 
**metadata** | **array** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


