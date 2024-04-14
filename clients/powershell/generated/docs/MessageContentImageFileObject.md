# MessageContentImageFileObject
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **String** | Always &#x60;image_file&#x60;. | 
**ImageFile** | [**MessageContentImageFileObjectImageFile**](MessageContentImageFileObjectImageFile.md) |  | 

## Examples

- Prepare the resource
```powershell
$MessageContentImageFileObject = Initialize-PSOpenAPIToolsMessageContentImageFileObject  -Type null `
 -ImageFile null
```

- Convert the resource to JSON
```powershell
$MessageContentImageFileObject | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

