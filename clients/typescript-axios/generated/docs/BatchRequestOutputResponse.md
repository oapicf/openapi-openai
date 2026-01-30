# BatchRequestOutputResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status_code** | **number** | The HTTP status code of the response | [optional] [default to undefined]
**request_id** | **string** | An unique identifier for the OpenAI API request. Please include this request ID when contacting support. | [optional] [default to undefined]
**body** | **object** | The JSON body of the response | [optional] [default to undefined]

## Example

```typescript
import { BatchRequestOutputResponse } from './api';

const instance: BatchRequestOutputResponse = {
    status_code,
    request_id,
    body,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
