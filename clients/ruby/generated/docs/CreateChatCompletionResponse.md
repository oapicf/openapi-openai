# OpenApiOpenAIClient::CreateChatCompletionResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** |  |  |
| **object** | **String** |  |  |
| **created** | **Integer** |  |  |
| **model** | **String** |  |  |
| **choices** | [**Array&lt;CreateChatCompletionResponseChoicesInner&gt;**](CreateChatCompletionResponseChoicesInner.md) |  |  |
| **usage** | [**CreateCompletionResponseUsage**](CreateCompletionResponseUsage.md) |  | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::CreateChatCompletionResponse.new(
  id: null,
  object: null,
  created: null,
  model: null,
  choices: null,
  usage: null
)
```

