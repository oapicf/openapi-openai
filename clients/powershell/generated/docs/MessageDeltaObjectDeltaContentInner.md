# MessageDeltaObjectDeltaContentInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Index** | **Int32** | The index of the content part in the message. | 
**Type** | **String** | Always &#x60;image_file&#x60;. | 
**ImageFile** | [**MessageDeltaContentImageFileObjectImageFile**](MessageDeltaContentImageFileObjectImageFile.md) |  | [optional] 
**Text** | [**MessageDeltaContentTextObjectText**](MessageDeltaContentTextObjectText.md) |  | [optional] 
**Refusal** | **String** |  | [optional] 
**ImageUrl** | [**MessageDeltaContentImageUrlObjectImageUrl**](MessageDeltaContentImageUrlObjectImageUrl.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$MessageDeltaObjectDeltaContentInner = Initialize-PSOpenAPIToolsMessageDeltaObjectDeltaContentInner  -Index null `
 -Type null `
 -ImageFile null `
 -Text null `
 -Refusal null `
 -ImageUrl null
```

- Convert the resource to JSON
```powershell
$MessageDeltaObjectDeltaContentInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

