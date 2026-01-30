# ArrayOfContentPartsInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **String** | Always &#x60;image_file&#x60;. | 
**ImageFile** | [**MessageContentImageFileObjectImageFile**](MessageContentImageFileObjectImageFile.md) |  | 
**ImageUrl** | [**MessageContentImageUrlObjectImageUrl**](MessageContentImageUrlObjectImageUrl.md) |  | 
**Text** | **String** | Text content to be sent to the model | 

## Examples

- Prepare the resource
```powershell
$ArrayOfContentPartsInner = Initialize-PSOpenAPIToolsArrayOfContentPartsInner  -Type null `
 -ImageFile null `
 -ImageUrl null `
 -Text null
```

- Convert the resource to JSON
```powershell
$ArrayOfContentPartsInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

