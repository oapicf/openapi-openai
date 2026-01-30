# OpenApiOpenAIClient::VectorStoreExpirationAfter

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **anchor** | **String** | Anchor timestamp after which the expiration policy applies. Supported anchors: &#x60;last_active_at&#x60;. |  |
| **days** | **Integer** | The number of days after the anchor time that the vector store will expire. |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::VectorStoreExpirationAfter.new(
  anchor: null,
  days: null
)
```

