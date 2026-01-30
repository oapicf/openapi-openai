# OpenApiOpenAIClient::UsageResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **object** | **String** |  |  |
| **data** | [**Array&lt;UsageTimeBucket&gt;**](UsageTimeBucket.md) |  |  |
| **has_more** | **Boolean** |  |  |
| **next_page** | **String** |  |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::UsageResponse.new(
  object: null,
  data: null,
  has_more: null,
  next_page: null
)
```

