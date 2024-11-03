# CreateModerationResponseResultsInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Flagged** | **Boolean** | Whether any of the below categories are flagged. | 
**Categories** | [**CreateModerationResponseResultsInnerCategories**](CreateModerationResponseResultsInnerCategories.md) |  | 
**CategoryScores** | [**CreateModerationResponseResultsInnerCategoryScores**](CreateModerationResponseResultsInnerCategoryScores.md) |  | 

## Examples

- Prepare the resource
```powershell
$CreateModerationResponseResultsInner = Initialize-PSOpenAPIToolsCreateModerationResponseResultsInner  -Flagged null `
 -Categories null `
 -CategoryScores null
```

- Convert the resource to JSON
```powershell
$CreateModerationResponseResultsInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

