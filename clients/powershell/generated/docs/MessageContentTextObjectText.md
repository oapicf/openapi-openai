# MessageContentTextObjectText
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Value** | **String** | The data that makes up the text. | 
**Annotations** | [**MessageContentTextObjectTextAnnotationsInner[]**](MessageContentTextObjectTextAnnotationsInner.md) |  | 

## Examples

- Prepare the resource
```powershell
$MessageContentTextObjectText = Initialize-PSOpenAPIToolsMessageContentTextObjectText  -Value null `
 -Annotations null
```

- Convert the resource to JSON
```powershell
$MessageContentTextObjectText | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

