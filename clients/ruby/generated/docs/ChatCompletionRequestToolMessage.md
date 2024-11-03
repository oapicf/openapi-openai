# OpenApiOpenAIClient::ChatCompletionRequestToolMessage

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **role** | **String** | The role of the messages author, in this case &#x60;tool&#x60;. |  |
| **content** | **String** | The contents of the tool message. |  |
| **tool_call_id** | **String** | Tool call that this message is responding to. |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::ChatCompletionRequestToolMessage.new(
  role: null,
  content: null,
  tool_call_id: null
)
```

