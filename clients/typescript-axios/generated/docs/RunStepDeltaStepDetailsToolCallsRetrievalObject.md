# RunStepDeltaStepDetailsToolCallsRetrievalObject


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **number** | The index of the tool call in the tool calls array. | [default to undefined]
**id** | **string** | The ID of the tool call object. | [optional] [default to undefined]
**type** | **string** | The type of tool call. This is always going to be &#x60;retrieval&#x60; for this type of tool call. | [default to undefined]
**retrieval** | **object** | For now, this is always going to be an empty object. | [optional] [default to undefined]

## Example

```typescript
import { RunStepDeltaStepDetailsToolCallsRetrievalObject } from './api';

const instance: RunStepDeltaStepDetailsToolCallsRetrievalObject = {
    index,
    id,
    type,
    retrieval,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
