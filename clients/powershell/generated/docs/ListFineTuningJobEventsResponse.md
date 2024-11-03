# ListFineTuningJobEventsResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VarData** | [**FineTuningJobEvent[]**](FineTuningJobEvent.md) |  | 
**Object** | **String** |  | 

## Examples

- Prepare the resource
```powershell
$ListFineTuningJobEventsResponse = Initialize-PSOpenAPIToolsListFineTuningJobEventsResponse  -VarData null `
 -Object null
```

- Convert the resource to JSON
```powershell
$ListFineTuningJobEventsResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

