# OpenApiOpenAIClient::CreateCompletionResponseChoicesInner

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **finish_reason** | **String** | The reason the model stopped generating tokens. This will be &#x60;stop&#x60; if the model hit a natural stop point or a provided stop sequence, &#x60;length&#x60; if the maximum number of tokens specified in the request was reached, or &#x60;content_filter&#x60; if content was omitted due to a flag from our content filters.  |  |
| **index** | **Integer** |  |  |
| **logprobs** | [**CreateCompletionResponseChoicesInnerLogprobs**](CreateCompletionResponseChoicesInnerLogprobs.md) |  |  |
| **text** | **String** |  |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::CreateCompletionResponseChoicesInner.new(
  finish_reason: null,
  index: null,
  logprobs: null,
  text: null
)
```

