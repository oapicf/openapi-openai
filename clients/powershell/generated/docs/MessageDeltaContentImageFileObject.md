# MessageDeltaContentImageFileObject
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Index** | **Int32** | The index of the content part in the message. | 
**Type** | **String** | Always &#x60;image_file&#x60;. | 
**ImageFile** | [**MessageDeltaContentImageFileObjectImageFile**](MessageDeltaContentImageFileObjectImageFile.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$MessageDeltaContentImageFileObject = Initialize-PSOpenAPIToolsMessageDeltaContentImageFileObject  -Index null `
 -Type null `
 -ImageFile null
```

- Convert the resource to JSON
```powershell
$MessageDeltaContentImageFileObject | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

