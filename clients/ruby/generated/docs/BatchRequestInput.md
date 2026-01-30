# OpenApiOpenAIClient::BatchRequestInput

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **custom_id** | **String** | A developer-provided per-request id that will be used to match outputs to inputs. Must be unique for each request in a batch. | [optional] |
| **method** | **String** | The HTTP method to be used for the request. Currently only &#x60;POST&#x60; is supported. | [optional] |
| **url** | **String** | The OpenAI API relative URL to be used for the request. Currently &#x60;/v1/chat/completions&#x60;, &#x60;/v1/embeddings&#x60;, and &#x60;/v1/completions&#x60; are supported. | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::BatchRequestInput.new(
  custom_id: null,
  method: null,
  url: null
)
```

