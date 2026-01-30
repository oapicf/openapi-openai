# OpenApiOpenAIClient::ProjectRateLimit

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **object** | **String** | The object type, which is always &#x60;project.rate_limit&#x60; |  |
| **id** | **String** | The identifier, which can be referenced in API endpoints. |  |
| **model** | **String** | The model this rate limit applies to. |  |
| **max_requests_per_1_minute** | **Integer** | The maximum requests per minute. |  |
| **max_tokens_per_1_minute** | **Integer** | The maximum tokens per minute. |  |
| **max_images_per_1_minute** | **Integer** | The maximum images per minute. Only present for relevant models. | [optional] |
| **max_audio_megabytes_per_1_minute** | **Integer** | The maximum audio megabytes per minute. Only present for relevant models. | [optional] |
| **max_requests_per_1_day** | **Integer** | The maximum requests per day. Only present for relevant models. | [optional] |
| **batch_1_day_max_input_tokens** | **Integer** | The maximum batch input tokens per day. Only present for relevant models. | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::ProjectRateLimit.new(
  object: null,
  id: null,
  model: null,
  max_requests_per_1_minute: null,
  max_tokens_per_1_minute: null,
  max_images_per_1_minute: null,
  max_audio_megabytes_per_1_minute: null,
  max_requests_per_1_day: null,
  batch_1_day_max_input_tokens: null
)
```

