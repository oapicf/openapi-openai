# UsageCodeInterpreterSessionsResult

The aggregated code interpreter sessions usage details of the specific time bucket.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **string** |  | [default to undefined]
**sessions** | **number** | The number of code interpreter sessions. | [default to undefined]
**project_id** | **string** | When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped usage result. | [optional] [default to undefined]

## Example

```typescript
import { UsageCodeInterpreterSessionsResult } from './api';

const instance: UsageCodeInterpreterSessionsResult = {
    object,
    sessions,
    project_id,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
