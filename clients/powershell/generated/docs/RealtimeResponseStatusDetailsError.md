# RealtimeResponseStatusDetailsError
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **String** | The type of error. | [optional] 
**Code** | **String** | Error code, if any. | [optional] 

## Examples

- Prepare the resource
```powershell
$RealtimeResponseStatusDetailsError = Initialize-PSOpenAPIToolsRealtimeResponseStatusDetailsError  -Type null `
 -Code null
```

- Convert the resource to JSON
```powershell
$RealtimeResponseStatusDetailsError | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

