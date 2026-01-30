# OpenApiOpenAIClient::FileSearchRankingOptions

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ranker** | **String** | The ranker to use for the file search. If not specified will use the &#x60;auto&#x60; ranker. | [optional] |
| **score_threshold** | **Float** | The score threshold for the file search. All values must be a floating point number between 0 and 1. |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::FileSearchRankingOptions.new(
  ranker: null,
  score_threshold: null
)
```

