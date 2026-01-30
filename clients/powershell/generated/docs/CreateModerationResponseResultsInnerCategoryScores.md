# CreateModerationResponseResultsInnerCategoryScores
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Hate** | **Decimal** | The score for the category &#39;hate&#39;. | 
**HateThreatening** | **Decimal** | The score for the category &#39;hate/threatening&#39;. | 
**Harassment** | **Decimal** | The score for the category &#39;harassment&#39;. | 
**HarassmentThreatening** | **Decimal** | The score for the category &#39;harassment/threatening&#39;. | 
**Illicit** | **Decimal** | The score for the category &#39;illicit&#39;. | 
**IllicitViolent** | **Decimal** | The score for the category &#39;illicit/violent&#39;. | 
**SelfHarm** | **Decimal** | The score for the category &#39;self-harm&#39;. | 
**SelfHarmIntent** | **Decimal** | The score for the category &#39;self-harm/intent&#39;. | 
**SelfHarmInstructions** | **Decimal** | The score for the category &#39;self-harm/instructions&#39;. | 
**Sexual** | **Decimal** | The score for the category &#39;sexual&#39;. | 
**SexualMinors** | **Decimal** | The score for the category &#39;sexual/minors&#39;. | 
**Violence** | **Decimal** | The score for the category &#39;violence&#39;. | 
**ViolenceGraphic** | **Decimal** | The score for the category &#39;violence/graphic&#39;. | 

## Examples

- Prepare the resource
```powershell
$CreateModerationResponseResultsInnerCategoryScores = Initialize-PSOpenAPIToolsCreateModerationResponseResultsInnerCategoryScores  -Hate null `
 -HateThreatening null `
 -Harassment null `
 -HarassmentThreatening null `
 -Illicit null `
 -IllicitViolent null `
 -SelfHarm null `
 -SelfHarmIntent null `
 -SelfHarmInstructions null `
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

