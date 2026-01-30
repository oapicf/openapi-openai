# CreateModerationResponseResultsInnerCategories
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Hate** | **Boolean** | Content that expresses, incites, or promotes hate based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. Hateful content aimed at non-protected groups (e.g., chess players) is harassment. | 
**HateThreatening** | **Boolean** | Hateful content that also includes violence or serious harm towards the targeted group based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. | 
**Harassment** | **Boolean** | Content that expresses, incites, or promotes harassing language towards any target. | 
**HarassmentThreatening** | **Boolean** | Harassment content that also includes violence or serious harm towards any target. | 
**Illicit** | **Boolean** | Content that includes instructions or advice that facilitate the planning or execution of wrongdoing, or that gives advice or instruction on how to commit illicit acts. For example, &quot;&quot;how to shoplift&quot;&quot; would fit this category. | 
**IllicitViolent** | **Boolean** | Content that includes instructions or advice that facilitate the planning or execution of wrongdoing that also includes violence, or that gives advice or instruction on the procurement of any weapon. | 
**SelfHarm** | **Boolean** | Content that promotes, encourages, or depicts acts of self-harm, such as suicide, cutting, and eating disorders. | 
**SelfHarmIntent** | **Boolean** | Content where the speaker expresses that they are engaging or intend to engage in acts of self-harm, such as suicide, cutting, and eating disorders. | 
**SelfHarmInstructions** | **Boolean** | Content that encourages performing acts of self-harm, such as suicide, cutting, and eating disorders, or that gives instructions or advice on how to commit such acts. | 
**Sexual** | **Boolean** | Content meant to arouse sexual excitement, such as the description of sexual activity, or that promotes sexual services (excluding sex education and wellness). | 
**SexualMinors** | **Boolean** | Sexual content that includes an individual who is under 18 years old. | 
**Violence** | **Boolean** | Content that depicts death, violence, or physical injury. | 
**ViolenceGraphic** | **Boolean** | Content that depicts death, violence, or physical injury in graphic detail. | 

## Examples

- Prepare the resource
```powershell
$CreateModerationResponseResultsInnerCategories = Initialize-PSOpenAPIToolsCreateModerationResponseResultsInnerCategories  -Hate null `
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
$CreateModerationResponseResultsInnerCategories | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

