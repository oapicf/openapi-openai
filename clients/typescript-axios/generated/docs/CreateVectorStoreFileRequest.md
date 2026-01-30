# CreateVectorStoreFileRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**file_id** | **string** | A [File](/docs/api-reference/files) ID that the vector store should use. Useful for tools like &#x60;file_search&#x60; that can access files. | [default to undefined]
**chunking_strategy** | [**ChunkingStrategyRequestParam**](ChunkingStrategyRequestParam.md) |  | [optional] [default to undefined]

## Example

```typescript
import { CreateVectorStoreFileRequest } from './api';

const instance: CreateVectorStoreFileRequest = {
    file_id,
    chunking_strategy,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
