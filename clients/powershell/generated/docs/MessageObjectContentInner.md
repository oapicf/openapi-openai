# MessageObjectContentInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **String** | Always &#x60;image_file&#x60;. | 
**ImageFile** | [**MessageContentImageFileObjectImageFile**](MessageContentImageFileObjectImageFile.md) |  | 
**ImageUrl** | [**MessageContentImageUrlObjectImageUrl**](MessageContentImageUrlObjectImageUrl.md) |  | 
**Text** | [**MessageContentTextObjectText**](MessageContentTextObjectText.md) |  | 
**Refusal** | **String** |  | 

## Examples

- Prepare the resource
```powershell
$MessageObjectContentInner = Initialize-PSOpenAPIToolsMessageObjectContentInner  -Type null `
 -ImageFile null `
 -ImageUrl null `
 -Text null `
 -Refusal null
```

- Convert the resource to JSON
```powershell
$MessageObjectContentInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

