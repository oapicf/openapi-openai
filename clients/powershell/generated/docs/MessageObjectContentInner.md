# MessageObjectContentInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **String** | Always &#x60;image_file&#x60;. | 
**ImageFile** | [**MessageContentImageFileObjectImageFile**](MessageContentImageFileObjectImageFile.md) |  | 
**Text** | [**MessageContentTextObjectText**](MessageContentTextObjectText.md) |  | 

## Examples

- Prepare the resource
```powershell
$MessageObjectContentInner = Initialize-PSOpenAPIToolsMessageObjectContentInner  -Type null `
 -ImageFile null `
 -Text null
```

- Convert the resource to JSON
```powershell
$MessageObjectContentInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

