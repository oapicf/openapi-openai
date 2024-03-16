# OpenApiOpenAIClient::ChatCompletionResponseMessage

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **role** | **String** | The role of the author of this message. |  |
| **content** | **String** | The contents of the message. | [optional] |
| **function_call** | [**ChatCompletionRequestMessageFunctionCall**](ChatCompletionRequestMessageFunctionCall.md) |  | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::ChatCompletionResponseMessage.new(
  role: null,
  content: null,
  function_call: null
)
```

