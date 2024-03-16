# OpenApiOpenAIClient::CreateEmbeddingRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **model** | [**CreateEmbeddingRequestModel**](CreateEmbeddingRequestModel.md) |  |  |
| **input** | [**CreateEmbeddingRequestInput**](CreateEmbeddingRequestInput.md) |  |  |
| **user** | **String** | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::CreateEmbeddingRequest.new(
  model: null,
  input: null,
  user: user-1234
)
```

