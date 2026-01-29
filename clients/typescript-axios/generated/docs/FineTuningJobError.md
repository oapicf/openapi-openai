# FineTuningJobError

For fine-tuning jobs that have `failed`, this will contain more information on the cause of the failure.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **string** | A machine-readable error code. | [default to undefined]
**message** | **string** | A human-readable error message. | [default to undefined]
**param** | **string** | The parameter that was invalid, usually &#x60;training_file&#x60; or &#x60;validation_file&#x60;. This field will be null if the failure was not parameter-specific. | [default to undefined]

## Example

```typescript
import { FineTuningJobError } from './api';

const instance: FineTuningJobError = {
    code,
    message,
    param,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
