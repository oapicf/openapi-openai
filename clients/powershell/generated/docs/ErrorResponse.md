# ErrorResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VarError** | [**ModelError**](ModelError.md) |  | 

## Examples

- Prepare the resource
```powershell
$ErrorResponse = Initialize-PSOpenAPIToolsErrorResponse  -VarError null
```

- Convert the resource to JSON
```powershell
$ErrorResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

