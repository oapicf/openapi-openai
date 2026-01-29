# RunObjectIncompleteDetails

Details on why the run is incomplete. Will be `null` if the run is not incomplete.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reason** | **string** | The reason why the run is incomplete. This will point to which specific token limit was reached over the course of the run. | [optional] [default to undefined]

## Example

```typescript
import { RunObjectIncompleteDetails } from './api';

const instance: RunObjectIncompleteDetails = {
    reason,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
