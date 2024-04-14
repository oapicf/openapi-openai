# OpenApiOpenAIClient::RunStepCompletionUsage

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **completion_tokens** | **Integer** | Number of completion tokens used over the course of the run step. |  |
| **prompt_tokens** | **Integer** | Number of prompt tokens used over the course of the run step. |  |
| **total_tokens** | **Integer** | Total number of tokens used (prompt + completion). |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::RunStepCompletionUsage.new(
  completion_tokens: null,
  prompt_tokens: null,
  total_tokens: null
)
```

