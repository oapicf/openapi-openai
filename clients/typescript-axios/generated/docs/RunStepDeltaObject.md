# RunStepDeltaObject

Represents a run step delta i.e. any changed fields on a run step during streaming. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | The identifier of the run step, which can be referenced in API endpoints. | [default to undefined]
**object** | **string** | The object type, which is always &#x60;thread.run.step.delta&#x60;. | [default to undefined]
**delta** | [**RunStepDeltaObjectDelta**](RunStepDeltaObjectDelta.md) |  | [default to undefined]

## Example

```typescript
import { RunStepDeltaObject } from './api';

const instance: RunStepDeltaObject = {
    id,
    object,
    delta,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
