# OpenApiOpenAIClient::ChatCompletionMessageToolCall

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | The ID of the tool call. |  |
| **type** | **String** | The type of the tool. Currently, only &#x60;function&#x60; is supported. |  |
| **function** | [**ChatCompletionMessageToolCallFunction**](ChatCompletionMessageToolCallFunction.md) |  |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::ChatCompletionMessageToolCall.new(
  id: null,
  type: null,
  function: null
)
```

