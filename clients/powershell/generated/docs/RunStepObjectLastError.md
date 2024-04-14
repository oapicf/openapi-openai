# RunStepObjectLastError
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Code** | **String** | One of &#x60;server_error&#x60; or &#x60;rate_limit_exceeded&#x60;. | 
**Message** | **String** | A human-readable description of the error. | 

## Examples

- Prepare the resource
```powershell
$RunStepObjectLastError = Initialize-PSOpenAPIToolsRunStepObjectLastError  -Code null `
 -Message null
```

- Convert the resource to JSON
```powershell
$RunStepObjectLastError | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

