# BatchRequestOutput

The per-line object of the batch output and error files

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** |  | [optional] [default to undefined]
**custom_id** | **string** | A developer-provided per-request id that will be used to match outputs to inputs. | [optional] [default to undefined]
**response** | [**BatchRequestOutputResponse**](BatchRequestOutputResponse.md) |  | [optional] [default to undefined]
**error** | [**BatchRequestOutputError**](BatchRequestOutputError.md) |  | [optional] [default to undefined]

## Example

```typescript
import { BatchRequestOutput } from './api';

const instance: BatchRequestOutput = {
    id,
    custom_id,
    response,
    error,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
