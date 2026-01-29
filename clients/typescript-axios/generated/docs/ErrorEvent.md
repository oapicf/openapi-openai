# ErrorEvent

Occurs when an [error](/docs/guides/error-codes/api-errors) occurs. This can happen due to an internal server error or a timeout.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event** | **string** |  | [default to undefined]
**data** | **Error** |  | [default to undefined]

## Example

```typescript
import { ErrorEvent } from './api';

const instance: ErrorEvent = {
    event,
    data,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
