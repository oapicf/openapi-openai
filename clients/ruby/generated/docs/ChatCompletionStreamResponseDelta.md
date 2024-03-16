# OpenApiOpenAIClient::ChatCompletionStreamResponseDelta

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **role** | **String** | The role of the author of this message. | [optional] |
| **content** | **String** | The contents of the chunk message. | [optional] |
| **function_call** | [**ChatCompletionRequestMessageFunctionCall**](ChatCompletionRequestMessageFunctionCall.md) |  | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::ChatCompletionStreamResponseDelta.new(
  role: null,
  content: null,
  function_call: null
)
```

