# VectorStoreFileObject

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The identifier, which can be referenced in API endpoints. | 
**object** | **String** | The object type, which is always &#x60;vector_store.file&#x60;. | 
**usageBytes** | **Int** | The total vector store usage in bytes. Note that this may be different from the original file size. | 
**createdAt** | **Int** | The Unix timestamp (in seconds) for when the vector store file was created. | 
**vectorStoreId** | **String** | The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to. | 
**status** | **String** | The status of the vector store file, which can be either &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;cancelled&#x60;, or &#x60;failed&#x60;. The status &#x60;completed&#x60; indicates that the vector store file is ready for use. | 
**lastError** | [**VectorStoreFileObjectLastError**](VectorStoreFileObjectLastError.md) |  | 
**chunkingStrategy** | [**VectorStoreFileObjectChunkingStrategy**](VectorStoreFileObjectChunkingStrategy.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


