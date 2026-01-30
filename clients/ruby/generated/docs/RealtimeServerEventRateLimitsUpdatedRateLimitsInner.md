# OpenApiOpenAIClient::RealtimeServerEventRateLimitsUpdatedRateLimitsInner

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **name** | **String** | The name of the rate limit (&#x60;requests&#x60;, &#x60;tokens&#x60;).  | [optional] |
| **limit** | **Integer** | The maximum allowed value for the rate limit. | [optional] |
| **remaining** | **Integer** | The remaining value before the limit is reached. | [optional] |
| **reset_seconds** | **Float** | Seconds until the rate limit resets. | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::RealtimeServerEventRateLimitsUpdatedRateLimitsInner.new(
  name: null,
  limit: null,
  remaining: null,
  reset_seconds: null
)
```

