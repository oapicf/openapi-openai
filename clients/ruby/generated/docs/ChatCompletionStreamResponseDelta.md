# OpenApiOpenAIClient::ChatCompletionStreamResponseDelta

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **content** | **String** | The contents of the chunk message. | [optional] |
| **function_call** | [**ChatCompletionStreamResponseDeltaFunctionCall**](ChatCompletionStreamResponseDeltaFunctionCall.md) |  | [optional] |
| **tool_calls** | [**Array&lt;ChatCompletionMessageToolCallChunk&gt;**](ChatCompletionMessageToolCallChunk.md) |  | [optional] |
| **role** | **String** | The role of the author of this message. | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::ChatCompletionStreamResponseDelta.new(
  content: null,
  function_call: null,
  tool_calls: null,
  role: null
)
```

