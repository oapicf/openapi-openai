# FineTuningJobEvent

Fine-tuning job event object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **string** | The object type, which is always \&quot;fine_tuning.job.event\&quot;. | [default to undefined]
**id** | **string** | The object identifier. | [default to undefined]
**created_at** | **number** | The Unix timestamp (in seconds) for when the fine-tuning job was created. | [default to undefined]
**level** | **string** | The log level of the event. | [default to undefined]
**message** | **string** | The message of the event. | [default to undefined]
**type** | **string** | The type of event. | [optional] [default to undefined]
**data** | **object** | The data associated with the event. | [optional] [default to undefined]

## Example

```typescript
import { FineTuningJobEvent } from './api';

const instance: FineTuningJobEvent = {
    object,
    id,
    created_at,
    level,
    message,
    type,
    data,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
