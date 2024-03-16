# OpenAIFile
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** |  | 
**Object** | **String** |  | 
**Bytes** | **Int32** |  | 
**CreatedAt** | **Int32** |  | 
**Filename** | **String** |  | 
**Purpose** | **String** |  | 
**Status** | **String** |  | [optional] 
**StatusDetails** | [**SystemCollectionsHashtable**](.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OpenAIFile = Initialize-PSOpenAPIToolsOpenAIFile  -Id null `
 -Object null `
 -Bytes null `
 -CreatedAt null `
 -Filename null `
 -Purpose null `
 -Status null `
 -StatusDetails null
```

- Convert the resource to JSON
```powershell
$OpenAIFile | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

