# ProjectRateLimit

Represents a project rate limit config.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **string** | The object type, which is always &#x60;project.rate_limit&#x60; | [default to undefined]
**id** | **string** | The identifier, which can be referenced in API endpoints. | [default to undefined]
**model** | **string** | The model this rate limit applies to. | [default to undefined]
**max_requests_per_1_minute** | **number** | The maximum requests per minute. | [default to undefined]
**max_tokens_per_1_minute** | **number** | The maximum tokens per minute. | [default to undefined]
**max_images_per_1_minute** | **number** | The maximum images per minute. Only present for relevant models. | [optional] [default to undefined]
**max_audio_megabytes_per_1_minute** | **number** | The maximum audio megabytes per minute. Only present for relevant models. | [optional] [default to undefined]
**max_requests_per_1_day** | **number** | The maximum requests per day. Only present for relevant models. | [optional] [default to undefined]
**batch_1_day_max_input_tokens** | **number** | The maximum batch input tokens per day. Only present for relevant models. | [optional] [default to undefined]

## Example

```typescript
import { ProjectRateLimit } from './api';

const instance: ProjectRateLimit = {
    object,
    id,
    model,
    max_requests_per_1_minute,
    max_tokens_per_1_minute,
    max_images_per_1_minute,
    max_audio_megabytes_per_1_minute,
    max_requests_per_1_day,
    batch_1_day_max_input_tokens,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
