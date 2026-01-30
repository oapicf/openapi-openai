# MessageDeltaContentImageUrlObjectImageUrl
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Url** | **String** | The URL of the image, must be a supported image types: jpeg, jpg, png, gif, webp. | [optional] 
**Detail** | **String** | Specifies the detail level of the image. &#x60;low&#x60; uses fewer tokens, you can opt in to high resolution using &#x60;high&#x60;. | [optional] [default to "auto"]

## Examples

- Prepare the resource
```powershell
$MessageDeltaContentImageUrlObjectImageUrl = Initialize-PSOpenAPIToolsMessageDeltaContentImageUrlObjectImageUrl  -Url null `
 -Detail null
```

- Convert the resource to JSON
```powershell
$MessageDeltaContentImageUrlObjectImageUrl | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

