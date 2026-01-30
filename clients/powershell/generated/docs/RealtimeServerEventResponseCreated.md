# RealtimeServerEventResponseCreated
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventId** | **String** | The unique ID of the server event. | 
**Type** | **String** | The event type, must be &#x60;response.created&#x60;. | 
**Response** | [**RealtimeResponse**](RealtimeResponse.md) |  | 

## Examples

- Prepare the resource
```powershell
$RealtimeServerEventResponseCreated = Initialize-PSOpenAPIToolsRealtimeServerEventResponseCreated  -EventId null `
 -Type null `
 -Response null
```

- Convert the resource to JSON
```powershell
$RealtimeServerEventResponseCreated | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

