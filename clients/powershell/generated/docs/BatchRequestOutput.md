# BatchRequestOutput
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** |  | [optional] 
**CustomId** | **String** | A developer-provided per-request id that will be used to match outputs to inputs. | [optional] 
**Response** | [**BatchRequestOutputResponse**](BatchRequestOutputResponse.md) |  | [optional] 
**VarError** | [**BatchRequestOutputError**](BatchRequestOutputError.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$BatchRequestOutput = Initialize-PSOpenAPIToolsBatchRequestOutput  -Id null `
 -CustomId null `
 -Response null `
 -VarError null
```

- Convert the resource to JSON
```powershell
$BatchRequestOutput | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

