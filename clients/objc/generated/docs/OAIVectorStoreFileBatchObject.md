# OAIVectorStoreFileBatchObject

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_id** | **NSString*** | The identifier, which can be referenced in API endpoints. | 
**object** | **NSString*** | The object type, which is always &#x60;vector_store.file_batch&#x60;. | 
**createdAt** | **NSNumber*** | The Unix timestamp (in seconds) for when the vector store files batch was created. | 
**vectorStoreId** | **NSString*** | The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to. | 
**status** | **NSString*** | The status of the vector store files batch, which can be either &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;cancelled&#x60; or &#x60;failed&#x60;. | 
**fileCounts** | [**OAIVectorStoreFileBatchObjectFileCounts***](OAIVectorStoreFileBatchObjectFileCounts.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


