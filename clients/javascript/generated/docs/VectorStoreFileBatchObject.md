# OpenapiOpenai.VectorStoreFileBatchObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The identifier, which can be referenced in API endpoints. | 
**object** | **String** | The object type, which is always &#x60;vector_store.file_batch&#x60;. | 
**createdAt** | **Number** | The Unix timestamp (in seconds) for when the vector store files batch was created. | 
**vectorStoreId** | **String** | The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to. | 
**status** | **String** | The status of the vector store files batch, which can be either &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;cancelled&#x60; or &#x60;failed&#x60;. | 
**fileCounts** | [**VectorStoreFileBatchObjectFileCounts**](VectorStoreFileBatchObjectFileCounts.md) |  | 



## Enum: ObjectEnum


* `vector_store.files_batch` (value: `"vector_store.files_batch"`)





## Enum: StatusEnum


* `in_progress` (value: `"in_progress"`)

* `completed` (value: `"completed"`)

* `cancelled` (value: `"cancelled"`)

* `failed` (value: `"failed"`)




