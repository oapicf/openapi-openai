# ErrorEvent
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VarEvent** | **String** |  | 
**VarData** | [**ModelError**](ModelError.md) |  | 

## Examples

- Prepare the resource
```powershell
$ErrorEvent = Initialize-PSOpenAPIToolsErrorEvent  -VarEvent null `
 -VarData null
```

- Convert the resource to JSON
```powershell
$ErrorEvent | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

