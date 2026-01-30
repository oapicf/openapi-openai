# BatchErrorsDataInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **string** | An error code identifying the error type. | [optional] [default to undefined]
**message** | **string** | A human-readable message providing more details about the error. | [optional] [default to undefined]
**param** | **string** | The name of the parameter that caused the error, if applicable. | [optional] [default to undefined]
**line** | **number** | The line number of the input file where the error occurred, if applicable. | [optional] [default to undefined]

## Example

```typescript
import { BatchErrorsDataInner } from './api';

const instance: BatchErrorsDataInner = {
    code,
    message,
    param,
    line,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
