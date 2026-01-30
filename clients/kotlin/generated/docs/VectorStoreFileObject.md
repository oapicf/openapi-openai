
# VectorStoreFileObject

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** | The identifier, which can be referenced in API endpoints. |  |
| **&#x60;object&#x60;** | [**inline**](#&#x60;Object&#x60;) | The object type, which is always &#x60;vector_store.file&#x60;. |  |
| **usageBytes** | **kotlin.Int** | The total vector store usage in bytes. Note that this may be different from the original file size. |  |
| **createdAt** | **kotlin.Int** | The Unix timestamp (in seconds) for when the vector store file was created. |  |
| **vectorStoreId** | **kotlin.String** | The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to. |  |
| **status** | [**inline**](#Status) | The status of the vector store file, which can be either &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;cancelled&#x60;, or &#x60;failed&#x60;. The status &#x60;completed&#x60; indicates that the vector store file is ready for use. |  |
| **lastError** | [**VectorStoreFileObjectLastError**](VectorStoreFileObjectLastError.md) |  |  |
| **chunkingStrategy** | [**VectorStoreFileObjectChunkingStrategy**](VectorStoreFileObjectChunkingStrategy.md) |  |  [optional] |


<a id="`Object`"></a>
## Enum: object
| Name | Value |
| ---- | ----- |
| &#x60;object&#x60; | vector_store.file |


<a id="Status"></a>
## Enum: status
| Name | Value |
| ---- | ----- |
| status | in_progress, completed, cancelled, failed |



