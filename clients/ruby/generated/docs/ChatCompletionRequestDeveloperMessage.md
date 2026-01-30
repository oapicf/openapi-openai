# OpenApiOpenAIClient::ChatCompletionRequestDeveloperMessage

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **content** | [**ChatCompletionRequestDeveloperMessageContent**](ChatCompletionRequestDeveloperMessageContent.md) |  |  |
| **role** | **String** | The role of the messages author, in this case &#x60;developer&#x60;. |  |
| **name** | **String** | An optional name for the participant. Provides the model information to differentiate between participants of the same role. | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::ChatCompletionRequestDeveloperMessage.new(
  content: null,
  role: null,
  name: null
)
```

