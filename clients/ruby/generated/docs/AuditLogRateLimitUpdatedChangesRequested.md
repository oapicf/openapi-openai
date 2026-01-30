# OpenApiOpenAIClient::AuditLogRateLimitUpdatedChangesRequested

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **max_requests_per_1_minute** | **Integer** | The maximum requests per minute. | [optional] |
| **max_tokens_per_1_minute** | **Integer** | The maximum tokens per minute. | [optional] |
| **max_images_per_1_minute** | **Integer** | The maximum images per minute. Only relevant for certain models. | [optional] |
| **max_audio_megabytes_per_1_minute** | **Integer** | The maximum audio megabytes per minute. Only relevant for certain models. | [optional] |
| **max_requests_per_1_day** | **Integer** | The maximum requests per day. Only relevant for certain models. | [optional] |
| **batch_1_day_max_input_tokens** | **Integer** | The maximum batch input tokens per day. Only relevant for certain models. | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::AuditLogRateLimitUpdatedChangesRequested.new(
  max_requests_per_1_minute: null,
  max_tokens_per_1_minute: null,
  max_images_per_1_minute: null,
  max_audio_megabytes_per_1_minute: null,
  max_requests_per_1_day: null,
  batch_1_day_max_input_tokens: null
)
```

