# OpenApiOpenAIClient::ChatCompletionNamedToolChoice

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **type** | **String** | The type of the tool. Currently, only &#x60;function&#x60; is supported. |  |
| **function** | [**AssistantsNamedToolChoiceFunction**](AssistantsNamedToolChoiceFunction.md) |  |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::ChatCompletionNamedToolChoice.new(
  type: null,
  function: null
)
```

