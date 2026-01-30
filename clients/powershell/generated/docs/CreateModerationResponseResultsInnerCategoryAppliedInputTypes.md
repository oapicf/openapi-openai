# CreateModerationResponseResultsInnerCategoryAppliedInputTypes
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Hate** | **String[]** | The applied input type(s) for the category &#39;hate&#39;. | 
**HateThreatening** | **String[]** | The applied input type(s) for the category &#39;hate/threatening&#39;. | 
**Harassment** | **String[]** | The applied input type(s) for the category &#39;harassment&#39;. | 
**HarassmentThreatening** | **String[]** | The applied input type(s) for the category &#39;harassment/threatening&#39;. | 
**Illicit** | **String[]** | The applied input type(s) for the category &#39;illicit&#39;. | 
**IllicitViolent** | **String[]** | The applied input type(s) for the category &#39;illicit/violent&#39;. | 
**SelfHarm** | **String[]** | The applied input type(s) for the category &#39;self-harm&#39;. | 
**SelfHarmIntent** | **String[]** | The applied input type(s) for the category &#39;self-harm/intent&#39;. | 
**SelfHarmInstructions** | **String[]** | The applied input type(s) for the category &#39;self-harm/instructions&#39;. | 
**Sexual** | **String[]** | The applied input type(s) for the category &#39;sexual&#39;. | 
**SexualMinors** | **String[]** | The applied input type(s) for the category &#39;sexual/minors&#39;. | 
**Violence** | **String[]** | The applied input type(s) for the category &#39;violence&#39;. | 
**ViolenceGraphic** | **String[]** | The applied input type(s) for the category &#39;violence/graphic&#39;. | 

## Examples

- Prepare the resource
```powershell
$CreateModerationResponseResultsInnerCategoryAppliedInputTypes = Initialize-PSOpenAPIToolsCreateModerationResponseResultsInnerCategoryAppliedInputTypes  -Hate null `
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
$CreateModerationResponseResultsInnerCategoryAppliedInputTypes | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

