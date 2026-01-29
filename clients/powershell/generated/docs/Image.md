# Image
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**B64Json** | **String** | The base64-encoded JSON of the generated image, if &#x60;response_format&#x60; is &#x60;b64_json&#x60;. | [optional] 
**Url** | **String** | The URL of the generated image, if &#x60;response_format&#x60; is &#x60;url&#x60; (default). | [optional] 
**RevisedPrompt** | **String** | The prompt that was used to generate the image, if there was any revision to the prompt. | [optional] 

## Examples

- Prepare the resource
```powershell
$Image = Initialize-PSOpenAPIToolsImage  -B64Json null `
 -Url null `
 -RevisedPrompt null
```

- Convert the resource to JSON
```powershell
$Image | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

