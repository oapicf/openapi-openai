# ModelError
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **String** |  | 
**Message** | **String** |  | 
**VarParam** | **String** |  | 
**Code** | **String** |  | 

## Examples

- Prepare the resource
```powershell
$ModelError = Initialize-PSOpenAPIToolsModelError  -Type null `
 -Message null `
 -VarParam null `
 -Code null
```

- Convert the resource to JSON
```powershell
$ModelError | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

