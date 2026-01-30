# CompleteUploadRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**PartIds** | **String[]** | The ordered list of Part IDs.  | 
**Md5** | **String** | The optional md5 checksum for the file contents to verify if the bytes uploaded matches what you expect.  | [optional] 

## Examples

- Prepare the resource
```powershell
$CompleteUploadRequest = Initialize-PSOpenAPIToolsCompleteUploadRequest  -PartIds null `
 -Md5 null
```

- Convert the resource to JSON
```powershell
$CompleteUploadRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

