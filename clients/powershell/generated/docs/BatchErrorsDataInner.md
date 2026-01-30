# BatchErrorsDataInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Code** | **String** | An error code identifying the error type. | [optional] 
**Message** | **String** | A human-readable message providing more details about the error. | [optional] 
**VarParam** | **String** | The name of the parameter that caused the error, if applicable. | [optional] 
**Line** | **Int32** | The line number of the input file where the error occurred, if applicable. | [optional] 

## Examples

- Prepare the resource
```powershell
$BatchErrorsDataInner = Initialize-PSOpenAPIToolsBatchErrorsDataInner  -Code null `
 -Message null `
 -VarParam null `
 -Line null
```

- Convert the resource to JSON
```powershell
$BatchErrorsDataInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

