# RunStepDetailsToolCallsFunctionObject


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | The ID of the tool call object. | [default to undefined]
**type** | **string** | The type of tool call. This is always going to be &#x60;function&#x60; for this type of tool call. | [default to undefined]
**_function** | [**RunStepDetailsToolCallsFunctionObjectFunction**](RunStepDetailsToolCallsFunctionObjectFunction.md) |  | [default to undefined]

## Example

```typescript
import { RunStepDetailsToolCallsFunctionObject } from './api';

const instance: RunStepDetailsToolCallsFunctionObject = {
    id,
    type,
    _function,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
