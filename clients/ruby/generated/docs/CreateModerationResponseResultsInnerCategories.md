# OpenApiOpenAIClient::CreateModerationResponseResultsInnerCategories

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **hate** | **Boolean** |  |  |
| **hate_threatening** | **Boolean** |  |  |
| **self_harm** | **Boolean** |  |  |
| **sexual** | **Boolean** |  |  |
| **sexual_minors** | **Boolean** |  |  |
| **violence** | **Boolean** |  |  |
| **violence_graphic** | **Boolean** |  |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::CreateModerationResponseResultsInnerCategories.new(
  hate: null,
  hate_threatening: null,
  self_harm: null,
  sexual: null,
  sexual_minors: null,
  violence: null,
  violence_graphic: null
)
```

