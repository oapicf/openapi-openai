# Upload
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | The Upload unique identifier, which can be referenced in API endpoints. | 
**CreatedAt** | **Int32** | The Unix timestamp (in seconds) for when the Upload was created. | 
**Filename** | **String** | The name of the file to be uploaded. | 
**Bytes** | **Int32** | The intended number of bytes to be uploaded. | 
**Purpose** | **String** | The intended purpose of the file. [Please refer here](/docs/api-reference/files/object#files/object-purpose) for acceptable values. | 
**Status** | **String** | The status of the Upload. | 
**ExpiresAt** | **Int32** | The Unix timestamp (in seconds) for when the Upload was created. | 
**Object** | **String** | The object type, which is always &quot;&quot;upload&quot;&quot;. | [optional] 
**File** | [**OpenAIFile**](OpenAIFile.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$Upload = Initialize-PSOpenAPIToolsUpload  -Id null `
 -CreatedAt null `
 -Filename null `
 -Bytes null `
 -Purpose null `
 -Status null `
 -ExpiresAt null `
 -Object null `
 -File null
```

- Convert the resource to JSON
```powershell
$Upload | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

