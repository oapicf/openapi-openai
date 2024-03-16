# OpenApiOpenAIClient::CreateModerationResponseResultsInnerCategoryScores

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **hate** | **Float** |  |  |
| **hate_threatening** | **Float** |  |  |
| **self_harm** | **Float** |  |  |
| **sexual** | **Float** |  |  |
| **sexual_minors** | **Float** |  |  |
| **violence** | **Float** |  |  |
| **violence_graphic** | **Float** |  |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::CreateModerationResponseResultsInnerCategoryScores.new(
  hate: null,
  hate_threatening: null,
  self_harm: null,
  sexual: null,
  sexual_minors: null,
  violence: null,
  violence_graphic: null
)
```

