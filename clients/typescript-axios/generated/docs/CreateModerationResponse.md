# CreateModerationResponse

Represents if a given text input is potentially harmful.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | The unique identifier for the moderation request. | [default to undefined]
**model** | **string** | The model used to generate the moderation results. | [default to undefined]
**results** | [**Array&lt;CreateModerationResponseResultsInner&gt;**](CreateModerationResponseResultsInner.md) | A list of moderation objects. | [default to undefined]

## Example

```typescript
import { CreateModerationResponse } from './api';

const instance: CreateModerationResponse = {
    id,
    model,
    results,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
