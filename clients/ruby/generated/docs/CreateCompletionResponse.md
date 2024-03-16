# OpenApiOpenAIClient::CreateCompletionResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** |  |  |
| **object** | **String** |  |  |
| **created** | **Integer** |  |  |
| **model** | **String** |  |  |
| **choices** | [**Array&lt;CreateCompletionResponseChoicesInner&gt;**](CreateCompletionResponseChoicesInner.md) |  |  |
| **usage** | [**CreateCompletionResponseUsage**](CreateCompletionResponseUsage.md) |  | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::CreateCompletionResponse.new(
  id: null,
  object: null,
  created: null,
  model: null,
  choices: null,
  usage: null
)
```
