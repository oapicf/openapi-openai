# CreateModerationResponseResultsInnerCategories
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Hate** | **Boolean** |  | 
**HateThreatening** | **Boolean** |  | 
**SelfHarm** | **Boolean** |  | 
**Sexual** | **Boolean** |  | 
**SexualMinors** | **Boolean** |  | 
**Violence** | **Boolean** |  | 
**ViolenceGraphic** | **Boolean** |  | 

## Examples

- Prepare the resource
```powershell
$CreateModerationResponseResultsInnerCategories = Initialize-PSOpenAPIToolsCreateModerationResponseResultsInnerCategories  -Hate null `
 -HateThreatening null `
 -SelfHarm null `
 -Sexual null `
 -SexualMinors null `
 -Violence null `
 -ViolenceGraphic null
```

- Convert the resource to JSON
```powershell
$CreateModerationResponseResultsInnerCategories | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

