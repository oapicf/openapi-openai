# CreateModerationResponseResultsInnerCategoryScores
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Hate** | **Decimal** |  | 
**HateThreatening** | **Decimal** |  | 
**SelfHarm** | **Decimal** |  | 
**Sexual** | **Decimal** |  | 
**SexualMinors** | **Decimal** |  | 
**Violence** | **Decimal** |  | 
**ViolenceGraphic** | **Decimal** |  | 

## Examples

- Prepare the resource
```powershell
$CreateModerationResponseResultsInnerCategoryScores = Initialize-PSOpenAPIToolsCreateModerationResponseResultsInnerCategoryScores  -Hate null `
 -HateThreatening null `
 -SelfHarm null `
 -Sexual null `
 -SexualMinors null `
 -Violence null `
 -ViolenceGraphic null
```

- Convert the resource to JSON
```powershell
$CreateModerationResponseResultsInnerCategoryScores | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

