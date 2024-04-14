# FineTuningJobError
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Code** | **String** | A machine-readable error code. | 
**Message** | **String** | A human-readable error message. | 
**VarParam** | **String** | The parameter that was invalid, usually &#x60;training_file&#x60; or &#x60;validation_file&#x60;. This field will be null if the failure was not parameter-specific. | 

## Examples

- Prepare the resource
```powershell
$FineTuningJobError = Initialize-PSOpenAPIToolsFineTuningJobError  -Code null `
 -Message null `
 -VarParam null
```

- Convert the resource to JSON
```powershell
$FineTuningJobError | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

