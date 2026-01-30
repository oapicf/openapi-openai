# RunStepDetailsToolCallsFileSearchObject


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | The ID of the tool call object. | [default to undefined]
**type** | **string** | The type of tool call. This is always going to be &#x60;file_search&#x60; for this type of tool call. | [default to undefined]
**file_search** | [**RunStepDetailsToolCallsFileSearchObjectFileSearch**](RunStepDetailsToolCallsFileSearchObjectFileSearch.md) |  | [default to undefined]

## Example

```typescript
import { RunStepDetailsToolCallsFileSearchObject } from './api';

const instance: RunStepDetailsToolCallsFileSearchObject = {
    id,
    type,
    file_search,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
