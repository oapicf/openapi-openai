# BatchErrors
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **String** | The object type, which is always &#x60;list&#x60;. | [optional] 
**VarData** | [**BatchErrorsDataInner[]**](BatchErrorsDataInner.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$BatchErrors = Initialize-PSOpenAPIToolsBatchErrors  -Object null `
 -VarData null
```

- Convert the resource to JSON
```powershell
$BatchErrors | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

