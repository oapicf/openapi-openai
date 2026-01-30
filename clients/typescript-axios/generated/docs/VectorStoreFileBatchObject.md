# VectorStoreFileBatchObject

A batch of files attached to a vector store.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | The identifier, which can be referenced in API endpoints. | [default to undefined]
**object** | **string** | The object type, which is always &#x60;vector_store.file_batch&#x60;. | [default to undefined]
**created_at** | **number** | The Unix timestamp (in seconds) for when the vector store files batch was created. | [default to undefined]
**vector_store_id** | **string** | The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to. | [default to undefined]
**status** | **string** | The status of the vector store files batch, which can be either &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;cancelled&#x60; or &#x60;failed&#x60;. | [default to undefined]
**file_counts** | [**VectorStoreFileBatchObjectFileCounts**](VectorStoreFileBatchObjectFileCounts.md) |  | [default to undefined]

## Example

```typescript
import { VectorStoreFileBatchObject } from './api';

const instance: VectorStoreFileBatchObject = {
    id,
    object,
    created_at,
    vector_store_id,
    status,
    file_counts,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
