# VectorStoreFileBatchObjectFileCounts


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**in_progress** | **number** | The number of files that are currently being processed. | [default to undefined]
**completed** | **number** | The number of files that have been processed. | [default to undefined]
**failed** | **number** | The number of files that have failed to process. | [default to undefined]
**cancelled** | **number** | The number of files that where cancelled. | [default to undefined]
**total** | **number** | The total number of files. | [default to undefined]

## Example

```typescript
import { VectorStoreFileBatchObjectFileCounts } from './api';

const instance: VectorStoreFileBatchObjectFileCounts = {
    in_progress,
    completed,
    failed,
    cancelled,
    total,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
