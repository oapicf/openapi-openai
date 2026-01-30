# VectorStoreFileObject

A list of files attached to a vector store.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | The identifier, which can be referenced in API endpoints. | [default to undefined]
**object** | **string** | The object type, which is always &#x60;vector_store.file&#x60;. | [default to undefined]
**usage_bytes** | **number** | The total vector store usage in bytes. Note that this may be different from the original file size. | [default to undefined]
**created_at** | **number** | The Unix timestamp (in seconds) for when the vector store file was created. | [default to undefined]
**vector_store_id** | **string** | The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to. | [default to undefined]
**status** | **string** | The status of the vector store file, which can be either &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;cancelled&#x60;, or &#x60;failed&#x60;. The status &#x60;completed&#x60; indicates that the vector store file is ready for use. | [default to undefined]
**last_error** | [**VectorStoreFileObjectLastError**](VectorStoreFileObjectLastError.md) |  | [default to undefined]
**chunking_strategy** | [**VectorStoreFileObjectChunkingStrategy**](VectorStoreFileObjectChunkingStrategy.md) |  | [optional] [default to undefined]

## Example

```typescript
import { VectorStoreFileObject } from './api';

const instance: VectorStoreFileObject = {
    id,
    object,
    usage_bytes,
    created_at,
    vector_store_id,
    status,
    last_error,
    chunking_strategy,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
