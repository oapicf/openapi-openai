

# VectorStoreFileBatchObject

A batch of files attached to a vector store.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The identifier, which can be referenced in API endpoints. |  |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The object type, which is always &#x60;vector_store.file_batch&#x60;. |  |
|**createdAt** | **Integer** | The Unix timestamp (in seconds) for when the vector store files batch was created. |  |
|**vectorStoreId** | **String** | The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to. |  |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the vector store files batch, which can be either &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;cancelled&#x60; or &#x60;failed&#x60;. |  |
|**fileCounts** | [**VectorStoreFileBatchObjectFileCounts**](VectorStoreFileBatchObjectFileCounts.md) |  |  |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| VECTOR_STORE_FILES_BATCH | &quot;vector_store.files_batch&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| IN_PROGRESS | &quot;in_progress&quot; |
| COMPLETED | &quot;completed&quot; |
| CANCELLED | &quot;cancelled&quot; |
| FAILED | &quot;failed&quot; |



