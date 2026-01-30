# RunStepDeltaStepDetailsToolCallsFileSearchObject


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **number** | The index of the tool call in the tool calls array. | [default to undefined]
**id** | **string** | The ID of the tool call object. | [optional] [default to undefined]
**type** | **string** | The type of tool call. This is always going to be &#x60;file_search&#x60; for this type of tool call. | [default to undefined]
**file_search** | **object** | For now, this is always going to be an empty object. | [default to undefined]

## Example

```typescript
import { RunStepDeltaStepDetailsToolCallsFileSearchObject } from './api';

const instance: RunStepDeltaStepDetailsToolCallsFileSearchObject = {
    index,
    id,
    type,
    file_search,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
