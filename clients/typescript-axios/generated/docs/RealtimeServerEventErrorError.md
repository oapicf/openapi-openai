# RealtimeServerEventErrorError

Details of the error.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **string** | The type of error (e.g., \&quot;invalid_request_error\&quot;, \&quot;server_error\&quot;).  | [default to undefined]
**code** | **string** | Error code, if any. | [optional] [default to undefined]
**message** | **string** | A human-readable error message. | [default to undefined]
**param** | **string** | Parameter related to the error, if any. | [optional] [default to undefined]
**event_id** | **string** | The event_id of the client event that caused the error, if applicable.  | [optional] [default to undefined]

## Example

```typescript
import { RealtimeServerEventErrorError } from './api';

const instance: RealtimeServerEventErrorError = {
    type,
    code,
    message,
    param,
    event_id,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
