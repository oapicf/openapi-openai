# UploadPart
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | The upload Part unique identifier, which can be referenced in API endpoints. | 
**CreatedAt** | **Int32** | The Unix timestamp (in seconds) for when the Part was created. | 
**UploadId** | **String** | The ID of the Upload object that this Part was added to. | 
**Object** | **String** | The object type, which is always &#x60;upload.part&#x60;. | 

## Examples

- Prepare the resource
```powershell
$UploadPart = Initialize-PSOpenAPIToolsUploadPart  -Id null `
 -CreatedAt null `
 -UploadId null `
 -Object null
```

- Convert the resource to JSON
```powershell
$UploadPart | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

