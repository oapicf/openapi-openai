# OpenApiOpenAIClient::RunStepDetailsToolCallsFileSearchRankingOptionsObject

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ranker** | **String** | The ranker used for the file search. |  |
| **score_threshold** | **Float** | The score threshold for the file search. All values must be a floating point number between 0 and 1. |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::RunStepDetailsToolCallsFileSearchRankingOptionsObject.new(
  ranker: null,
  score_threshold: null
)
```

