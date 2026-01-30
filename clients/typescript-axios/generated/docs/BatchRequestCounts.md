# BatchRequestCounts

The request counts for different statuses within the batch.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**total** | **number** | Total number of requests in the batch. | [default to undefined]
**completed** | **number** | Number of requests that have been completed successfully. | [default to undefined]
**failed** | **number** | Number of requests that have failed. | [default to undefined]

## Example

```typescript
import { BatchRequestCounts } from './api';

const instance: BatchRequestCounts = {
    total,
    completed,
    failed,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
