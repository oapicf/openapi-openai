# OpenApiOpenAIClient::CreateModerationResponseResultsInner

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **flagged** | **Boolean** | Whether any of the below categories are flagged. |  |
| **categories** | [**CreateModerationResponseResultsInnerCategories**](CreateModerationResponseResultsInnerCategories.md) |  |  |
| **category_scores** | [**CreateModerationResponseResultsInnerCategoryScores**](CreateModerationResponseResultsInnerCategoryScores.md) |  |  |
| **category_applied_input_types** | [**CreateModerationResponseResultsInnerCategoryAppliedInputTypes**](CreateModerationResponseResultsInnerCategoryAppliedInputTypes.md) |  |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::CreateModerationResponseResultsInner.new(
  flagged: null,
  categories: null,
  category_scores: null,
  category_applied_input_types: null
)
```

