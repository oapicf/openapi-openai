# RunStepDetailsToolCallsRetrievalObject


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | The ID of the tool call object. | [default to undefined]
**type** | **string** | The type of tool call. This is always going to be &#x60;retrieval&#x60; for this type of tool call. | [default to undefined]
**retrieval** | **object** | For now, this is always going to be an empty object. | [default to undefined]

## Example

```typescript
import { RunStepDetailsToolCallsRetrievalObject } from './api';

const instance: RunStepDetailsToolCallsRetrievalObject = {
    id,
    type,
    retrieval,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
