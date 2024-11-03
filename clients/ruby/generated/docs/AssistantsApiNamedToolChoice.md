# OpenApiOpenAIClient::AssistantsApiNamedToolChoice

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **type** | **String** | The type of the tool. If type is &#x60;function&#x60;, the function name must be set |  |
| **function** | [**ChatCompletionNamedToolChoiceFunction**](ChatCompletionNamedToolChoiceFunction.md) |  | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::AssistantsApiNamedToolChoice.new(
  type: null,
  function: null
)
```

