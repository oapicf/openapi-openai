# MessageContentImageFileObjectImageFile
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FileId** | **String** | The [File](/docs/api-reference/files) ID of the image in the message content. Set &#x60;purpose&#x3D;&quot;&quot;vision&quot;&quot;&#x60; when uploading the File if you need to later display the file content. | 
**Detail** | **String** | Specifies the detail level of the image if specified by the user. &#x60;low&#x60; uses fewer tokens, you can opt in to high resolution using &#x60;high&#x60;. | [optional] [default to "auto"]

## Examples

- Prepare the resource
```powershell
$MessageContentImageFileObjectImageFile = Initialize-PSOpenAPIToolsMessageContentImageFileObjectImageFile  -FileId null `
 -Detail null
```

- Convert the resource to JSON
```powershell
$MessageContentImageFileObjectImageFile | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

