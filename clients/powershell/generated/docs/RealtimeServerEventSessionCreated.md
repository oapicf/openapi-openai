# RealtimeServerEventSessionCreated
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventId** | **String** | The unique ID of the server event. | 
**Type** | **String** | The event type, must be &#x60;session.created&#x60;. | 
**Session** | [**RealtimeSession**](RealtimeSession.md) |  | 

## Examples

- Prepare the resource
```powershell
$RealtimeServerEventSessionCreated = Initialize-PSOpenAPIToolsRealtimeServerEventSessionCreated  -EventId null `
 -Type null `
 -Session null
```

- Convert the resource to JSON
```powershell
$RealtimeServerEventSessionCreated | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

