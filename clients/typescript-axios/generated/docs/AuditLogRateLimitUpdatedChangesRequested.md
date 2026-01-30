# AuditLogRateLimitUpdatedChangesRequested

The payload used to update the rate limits.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**max_requests_per_1_minute** | **number** | The maximum requests per minute. | [optional] [default to undefined]
**max_tokens_per_1_minute** | **number** | The maximum tokens per minute. | [optional] [default to undefined]
**max_images_per_1_minute** | **number** | The maximum images per minute. Only relevant for certain models. | [optional] [default to undefined]
**max_audio_megabytes_per_1_minute** | **number** | The maximum audio megabytes per minute. Only relevant for certain models. | [optional] [default to undefined]
**max_requests_per_1_day** | **number** | The maximum requests per day. Only relevant for certain models. | [optional] [default to undefined]
**batch_1_day_max_input_tokens** | **number** | The maximum batch input tokens per day. Only relevant for certain models. | [optional] [default to undefined]

## Example

```typescript
import { AuditLogRateLimitUpdatedChangesRequested } from './api';

const instance: AuditLogRateLimitUpdatedChangesRequested = {
    max_requests_per_1_minute,
    max_tokens_per_1_minute,
    max_images_per_1_minute,
    max_audio_megabytes_per_1_minute,
    max_requests_per_1_day,
    batch_1_day_max_input_tokens,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
