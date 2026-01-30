# BatchRequestOutputError
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Code** | **String** | A machine-readable error code. | [optional] 
**Message** | **String** | A human-readable error message. | [optional] 

## Examples

- Prepare the resource
```powershell
$BatchRequestOutputError = Initialize-PSOpenAPIToolsBatchRequestOutputError  -Code null `
 -Message null
```

- Convert the resource to JSON
```powershell
$BatchRequestOutputError | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

