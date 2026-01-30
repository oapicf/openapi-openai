# OpenAIFile
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | The file identifier, which can be referenced in the API endpoints. | 
**Bytes** | **Int32** | The size of the file, in bytes. | 
**CreatedAt** | **Int32** | The Unix timestamp (in seconds) for when the file was created. | 
**Filename** | **String** | The name of the file. | 
**Object** | **String** | The object type, which is always &#x60;file&#x60;. | 
**Purpose** | **String** | The intended purpose of the file. Supported values are &#x60;assistants&#x60;, &#x60;assistants_output&#x60;, &#x60;batch&#x60;, &#x60;batch_output&#x60;, &#x60;fine-tune&#x60;, &#x60;fine-tune-results&#x60; and &#x60;vision&#x60;. | 
**Status** | **String** | Deprecated. The current status of the file, which can be either &#x60;uploaded&#x60;, &#x60;processed&#x60;, or &#x60;error&#x60;. | 
**StatusDetails** | **String** | Deprecated. For details on why a fine-tuning training file failed validation, see the &#x60;error&#x60; field on &#x60;fine_tuning.job&#x60;. | [optional] 

## Examples

- Prepare the resource
```powershell
$OpenAIFile = Initialize-PSOpenAPIToolsOpenAIFile  -Id null `
 -Bytes null `
 -CreatedAt null `
 -Filename null `
 -Object null `
 -Purpose null `
 -Status null `
 -StatusDetails null
```

- Convert the resource to JSON
```powershell
$OpenAIFile | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

