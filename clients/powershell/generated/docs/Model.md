# Model
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** |  | 
**Object** | **String** |  | 
**Created** | **Int32** |  | 
**OwnedBy** | **String** |  | 

## Examples

- Prepare the resource
```powershell
$Model = Initialize-PSOpenAPIToolsModel  -Id null `
 -Object null `
 -Created null `
 -OwnedBy null
```

- Convert the resource to JSON
```powershell
$Model | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

