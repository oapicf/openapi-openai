# RealtimeResponseStatusDetailsError

A description of the error that caused the response to fail,  populated when the `status` is `failed`. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **string** | The type of error. | [optional] [default to undefined]
**code** | **string** | Error code, if any. | [optional] [default to undefined]

## Example

```typescript
import { RealtimeResponseStatusDetailsError } from './api';

const instance: RealtimeResponseStatusDetailsError = {
    type,
    code,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
