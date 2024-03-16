# ImagesResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Created** | **Int32** |  | 
**VarData** | [**ImagesResponseDataInner[]**](ImagesResponseDataInner.md) |  | 

## Examples

- Prepare the resource
```powershell
$ImagesResponse = Initialize-PSOpenAPIToolsImagesResponse  -Created null `
 -VarData null
```

- Convert the resource to JSON
```powershell
$ImagesResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

