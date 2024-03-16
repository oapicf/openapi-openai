# DeleteFileResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** |  | 
**Object** | **String** |  | 
**Deleted** | **Boolean** |  | 

## Examples

- Prepare the resource
```powershell
$DeleteFileResponse = Initialize-PSOpenAPIToolsDeleteFileResponse  -Id null `
 -Object null `
 -Deleted null
```

- Convert the resource to JSON
```powershell
$DeleteFileResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

