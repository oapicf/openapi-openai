# MessageContentImageUrlObjectImageUrl
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Url** | **String** | The external URL of the image, must be a supported image types: jpeg, jpg, png, gif, webp. | 
**Detail** | **String** | Specifies the detail level of the image. &#x60;low&#x60; uses fewer tokens, you can opt in to high resolution using &#x60;high&#x60;. Default value is &#x60;auto&#x60; | [optional] [default to "auto"]

## Examples

- Prepare the resource
```powershell
$MessageContentImageUrlObjectImageUrl = Initialize-PSOpenAPIToolsMessageContentImageUrlObjectImageUrl  -Url null `
 -Detail null
```

- Convert the resource to JSON
```powershell
$MessageContentImageUrlObjectImageUrl | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

