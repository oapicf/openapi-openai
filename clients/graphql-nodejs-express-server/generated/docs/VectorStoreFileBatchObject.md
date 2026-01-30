# VectorStoreFileBatchObject

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id_** | **String!** | The identifier, which can be referenced in API endpoints. | [default to null]
**object** | **String!** | The object type, which is always &#x60;vector_store.file_batch&#x60;. | [default to null]
**createdAt** | **Int!** | The Unix timestamp (in seconds) for when the vector store files batch was created. | [default to null]
**vectorStoreId** | **String!** | The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to. | [default to null]
**status** | **String!** | The status of the vector store files batch, which can be either &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;cancelled&#x60; or &#x60;failed&#x60;. | [default to null]
**fileCounts** | [***VectorStoreFileBatchObjectFileCounts**](VectorStoreFileBatchObject_file_counts.md) |  | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


