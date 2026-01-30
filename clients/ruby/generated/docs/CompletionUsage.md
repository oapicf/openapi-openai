# OpenApiOpenAIClient::CompletionUsage

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **completion_tokens** | **Integer** | Number of tokens in the generated completion. |  |
| **prompt_tokens** | **Integer** | Number of tokens in the prompt. |  |
| **total_tokens** | **Integer** | Total number of tokens used in the request (prompt + completion). |  |
| **completion_tokens_details** | [**CompletionUsageCompletionTokensDetails**](CompletionUsageCompletionTokensDetails.md) |  | [optional] |
| **prompt_tokens_details** | [**CompletionUsagePromptTokensDetails**](CompletionUsagePromptTokensDetails.md) |  | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::CompletionUsage.new(
  completion_tokens: null,
  prompt_tokens: null,
  total_tokens: null,
  completion_tokens_details: null,
  prompt_tokens_details: null
)
```

