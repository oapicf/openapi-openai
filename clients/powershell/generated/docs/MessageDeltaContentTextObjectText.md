# MessageDeltaContentTextObjectText
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Value** | **String** | The data that makes up the text. | [optional] 
**Annotations** | [**MessageDeltaContentTextObjectTextAnnotationsInner[]**](MessageDeltaContentTextObjectTextAnnotationsInner.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$MessageDeltaContentTextObjectText = Initialize-PSOpenAPIToolsMessageDeltaContentTextObjectText  -Value null `
 -Annotations null
```

- Convert the resource to JSON
```powershell
$MessageDeltaContentTextObjectText | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

