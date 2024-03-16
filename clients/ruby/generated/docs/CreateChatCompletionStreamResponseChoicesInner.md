# OpenApiOpenAIClient::CreateChatCompletionStreamResponseChoicesInner

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **index** | **Integer** |  | [optional] |
| **delta** | [**ChatCompletionStreamResponseDelta**](ChatCompletionStreamResponseDelta.md) |  | [optional] |
| **finish_reason** | **String** |  | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::CreateChatCompletionStreamResponseChoicesInner.new(
  index: null,
  delta: null,
  finish_reason: null
)
```

