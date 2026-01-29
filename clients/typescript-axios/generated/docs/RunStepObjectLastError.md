# RunStepObjectLastError

The last error associated with this run step. Will be `null` if there are no errors.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **string** | One of &#x60;server_error&#x60; or &#x60;rate_limit_exceeded&#x60;. | [default to undefined]
**message** | **string** | A human-readable description of the error. | [default to undefined]

## Example

```typescript
import { RunStepObjectLastError } from './api';

const instance: RunStepObjectLastError = {
    code,
    message,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
