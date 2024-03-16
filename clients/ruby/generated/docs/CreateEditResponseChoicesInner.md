# OpenApiOpenAIClient::CreateEditResponseChoicesInner

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **text** | **String** |  | [optional] |
| **index** | **Integer** |  | [optional] |
| **logprobs** | [**CreateCompletionResponseChoicesInnerLogprobs**](CreateCompletionResponseChoicesInnerLogprobs.md) |  | [optional] |
| **finish_reason** | **String** |  | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::CreateEditResponseChoicesInner.new(
  text: null,
  index: null,
  logprobs: null,
  finish_reason: null
)
```

