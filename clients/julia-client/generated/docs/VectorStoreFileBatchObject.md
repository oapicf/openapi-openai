# VectorStoreFileBatchObject


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`id`** | **`String`** | The identifier, which can be referenced in API endpoints. | [default to nothing]
**`object`** | **`String`** | The object type, which is always &#x60;vector_store.file_batch&#x60;. | [default to nothing]
**`created_at`** | **`Int64`** | The Unix timestamp (in seconds) for when the vector store files batch was created. | [default to nothing]
**`vector_store_id`** | **`String`** | The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to. | [default to nothing]
**`status`** | **`String`** | The status of the vector store files batch, which can be either &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;cancelled&#x60; or &#x60;failed&#x60;. | [default to nothing]
**`file_counts`** | [**`*VectorStoreFileBatchObjectFileCounts`**](VectorStoreFileBatchObjectFileCounts.md) |  | [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


