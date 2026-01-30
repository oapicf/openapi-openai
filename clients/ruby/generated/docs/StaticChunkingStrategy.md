# OpenApiOpenAIClient::StaticChunkingStrategy

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **type** | **String** | Always &#x60;static&#x60;. |  |
| **static** | [**StaticChunkingStrategyStatic**](StaticChunkingStrategyStatic.md) |  |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::StaticChunkingStrategy.new(
  type: null,
  static: null
)
```

