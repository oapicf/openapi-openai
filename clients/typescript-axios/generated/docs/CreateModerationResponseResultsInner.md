# CreateModerationResponseResultsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**flagged** | **boolean** | Whether any of the below categories are flagged. | [default to undefined]
**categories** | [**CreateModerationResponseResultsInnerCategories**](CreateModerationResponseResultsInnerCategories.md) |  | [default to undefined]
**category_scores** | [**CreateModerationResponseResultsInnerCategoryScores**](CreateModerationResponseResultsInnerCategoryScores.md) |  | [default to undefined]

## Example

```typescript
import { CreateModerationResponseResultsInner } from './api';

const instance: CreateModerationResponseResultsInner = {
    flagged,
    categories,
    category_scores,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
