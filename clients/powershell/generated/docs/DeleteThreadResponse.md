# DeleteThreadResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** |  | 
**Deleted** | **Boolean** |  | 
**Object** | **String** |  | 

## Examples

- Prepare the resource
```powershell
$DeleteThreadResponse = Initialize-PSOpenAPIToolsDeleteThreadResponse  -Id null `
 -Deleted null `
 -Object null
```

- Convert the resource to JSON
```powershell
$DeleteThreadResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

