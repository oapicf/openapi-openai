# OpenApiOpenAIClient::ChatCompletionRequestUserMessage

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **content** | [**ChatCompletionRequestUserMessageContent**](ChatCompletionRequestUserMessageContent.md) |  |  |
| **role** | **String** | The role of the messages author, in this case &#x60;user&#x60;. |  |
| **name** | **String** | An optional name for the participant. Provides the model information to differentiate between participants of the same role. | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::ChatCompletionRequestUserMessage.new(
  content: null,
  role: null,
  name: null
)
```

