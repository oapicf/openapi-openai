# RealtimeClientEventSessionUpdate
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventId** | **String** | Optional client-generated ID used to identify this event. | [optional] 
**Type** | **String** | The event type, must be &#x60;session.update&#x60;. | 
**Session** | [**RealtimeSessionCreateRequest**](RealtimeSessionCreateRequest.md) |  | 

## Examples

- Prepare the resource
```powershell
$RealtimeClientEventSessionUpdate = Initialize-PSOpenAPIToolsRealtimeClientEventSessionUpdate  -EventId null `
 -Type null `
 -Session null
```

- Convert the resource to JSON
```powershell
$RealtimeClientEventSessionUpdate | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

