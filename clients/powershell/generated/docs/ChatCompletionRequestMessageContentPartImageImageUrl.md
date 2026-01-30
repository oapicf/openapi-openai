# ChatCompletionRequestMessageContentPartImageImageUrl
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Url** | **String** | Either a URL of the image or the base64 encoded image data. | 
**Detail** | **String** | Specifies the detail level of the image. Learn more in the [Vision guide](/docs/guides/vision#low-or-high-fidelity-image-understanding). | [optional] [default to "auto"]

## Examples

- Prepare the resource
```powershell
$ChatCompletionRequestMessageContentPartImageImageUrl = Initialize-PSOpenAPIToolsChatCompletionRequestMessageContentPartImageImageUrl  -Url null `
 -Detail null
```

- Convert the resource to JSON
```powershell
$ChatCompletionRequestMessageContentPartImageImageUrl | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

