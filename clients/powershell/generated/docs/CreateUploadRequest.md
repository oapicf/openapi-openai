# CreateUploadRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Filename** | **String** | The name of the file to upload.  | 
**Purpose** | **String** | The intended purpose of the uploaded file.  See the [documentation on File purposes](/docs/api-reference/files/create#files-create-purpose).  | 
**Bytes** | **Int32** | The number of bytes in the file you are uploading.  | 
**MimeType** | **String** | The MIME type of the file.  This must fall within the supported MIME types for your file purpose. See the supported MIME types for assistants and vision.  | 

## Examples

- Prepare the resource
```powershell
$CreateUploadRequest = Initialize-PSOpenAPIToolsCreateUploadRequest  -Filename null `
 -Purpose null `
 -Bytes null `
 -MimeType null
```

- Convert the resource to JSON
```powershell
$CreateUploadRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

