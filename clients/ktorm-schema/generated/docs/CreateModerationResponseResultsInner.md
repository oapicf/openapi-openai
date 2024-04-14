
# Table `CreateModerationResponse_results_inner`
(mapped from: CreateModerationResponseResultsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**flagged** | flagged | boolean NOT NULL |  | **kotlin.Boolean** | Whether any of the below categories are flagged. | 
**categories** | categories | long NOT NULL |  | [**CreateModerationResponseResultsInnerCategories**](CreateModerationResponseResultsInnerCategories.md) |  |  [foreignkey]
**categoryScores** | category_scores | long NOT NULL |  | [**CreateModerationResponseResultsInnerCategoryScores**](CreateModerationResponseResultsInnerCategoryScores.md) |  |  [foreignkey]





