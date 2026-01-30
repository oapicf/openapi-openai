# BatchRequestOutputError

For requests that failed with a non-HTTP error, this will contain more information on the cause of the failure.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **string** | A machine-readable error code. | [optional] [default to undefined]
**message** | **string** | A human-readable error message. | [optional] [default to undefined]

## Example

```typescript
import { BatchRequestOutputError } from './api';

const instance: BatchRequestOutputError = {
    code,
    message,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
