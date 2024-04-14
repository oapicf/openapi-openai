# OpenApiOpenAIClient::ChatCompletionRequestFunctionMessage

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **role** | **String** | The role of the messages author, in this case &#x60;function&#x60;. |  |
| **content** | **String** | The contents of the function message. |  |
| **name** | **String** | The name of the function to call. |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::ChatCompletionRequestFunctionMessage.new(
  role: null,
  content: null,
  name: null
)
```

