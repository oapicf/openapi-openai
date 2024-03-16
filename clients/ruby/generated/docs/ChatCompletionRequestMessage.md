# OpenApiOpenAIClient::ChatCompletionRequestMessage

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **role** | **String** | The role of the messages author. One of &#x60;system&#x60;, &#x60;user&#x60;, &#x60;assistant&#x60;, or &#x60;function&#x60;. |  |
| **content** | **String** | The contents of the message. &#x60;content&#x60; is required for all messages except assistant messages with function calls. | [optional] |
| **name** | **String** | The name of the author of this message. &#x60;name&#x60; is required if role is &#x60;function&#x60;, and it should be the name of the function whose response is in the &#x60;content&#x60;. May contain a-z, A-Z, 0-9, and underscores, with a maximum length of 64 characters. | [optional] |
| **function_call** | [**ChatCompletionRequestMessageFunctionCall**](ChatCompletionRequestMessageFunctionCall.md) |  | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::ChatCompletionRequestMessage.new(
  role: null,
  content: null,
  name: null,
  function_call: null
)
```

