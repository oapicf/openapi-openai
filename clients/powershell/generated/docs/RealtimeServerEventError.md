# RealtimeServerEventError
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventId** | **String** | The unique ID of the server event. | 
**Type** | **String** | The event type, must be &#x60;error&#x60;. | 
**VarError** | [**RealtimeServerEventErrorError**](RealtimeServerEventErrorError.md) |  | 

## Examples

- Prepare the resource
```powershell
$RealtimeServerEventError = Initialize-PSOpenAPIToolsRealtimeServerEventError  -EventId null `
 -Type null `
 -VarError null
```

- Convert the resource to JSON
```powershell
$RealtimeServerEventError | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

