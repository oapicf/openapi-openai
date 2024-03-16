# FineTune
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** |  | 
**Object** | **String** |  | 
**CreatedAt** | **Int32** |  | 
**UpdatedAt** | **Int32** |  | 
**Model** | **String** |  | 
**FineTunedModel** | **String** |  | 
**OrganizationId** | **String** |  | 
**Status** | **String** |  | 
**Hyperparams** | [**SystemCollectionsHashtable**](.md) |  | 
**TrainingFiles** | [**OpenAIFile[]**](OpenAIFile.md) |  | 
**ValidationFiles** | [**OpenAIFile[]**](OpenAIFile.md) |  | 
**ResultFiles** | [**OpenAIFile[]**](OpenAIFile.md) |  | 
**Events** | [**FineTuneEvent[]**](FineTuneEvent.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$FineTune = Initialize-PSOpenAPIToolsFineTune  -Id null `
 -Object null `
 -CreatedAt null `
 -UpdatedAt null `
 -Model null `
 -FineTunedModel null `
 -OrganizationId null `
 -Status null `
 -Hyperparams null `
 -TrainingFiles null `
 -ValidationFiles null `
 -ResultFiles null `
 -Events null
```

- Convert the resource to JSON
```powershell
$FineTune | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

