# CreateVectorStoreFileBatchRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**file_ids** | **Array&lt;string&gt;** | A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like &#x60;file_search&#x60; that can access files. | [default to undefined]
**chunking_strategy** | [**ChunkingStrategyRequestParam**](ChunkingStrategyRequestParam.md) |  | [optional] [default to undefined]

## Example

```typescript
import { CreateVectorStoreFileBatchRequest } from './api';

const instance: CreateVectorStoreFileBatchRequest = {
    file_ids,
    chunking_strategy,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
