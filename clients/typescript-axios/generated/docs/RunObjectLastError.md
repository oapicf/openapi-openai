# RunObjectLastError

The last error associated with this run. Will be `null` if there are no errors.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **string** | One of &#x60;server_error&#x60;, &#x60;rate_limit_exceeded&#x60;, or &#x60;invalid_prompt&#x60;. | [default to undefined]
**message** | **string** | A human-readable description of the error. | [default to undefined]

## Example

```typescript
import { RunObjectLastError } from './api';

const instance: RunObjectLastError = {
    code,
    message,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
