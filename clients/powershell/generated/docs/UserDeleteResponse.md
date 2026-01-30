# UserDeleteResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **String** |  | 
**Id** | **String** |  | 
**Deleted** | **Boolean** |  | 

## Examples

- Prepare the resource
```powershell
$UserDeleteResponse = Initialize-PSOpenAPIToolsUserDeleteResponse  -Object null `
 -Id null `
 -Deleted null
```

- Convert the resource to JSON
```powershell
$UserDeleteResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

