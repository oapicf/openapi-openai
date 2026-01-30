# RealtimeClientEventResponseCreate
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventId** | **String** | Optional client-generated ID used to identify this event. | [optional] 
**Type** | **String** | The event type, must be &#x60;response.create&#x60;. | 
**Response** | [**RealtimeResponseCreateParams**](RealtimeResponseCreateParams.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$RealtimeClientEventResponseCreate = Initialize-PSOpenAPIToolsRealtimeClientEventResponseCreate  -EventId null `
 -Type null `
 -Response null
```

- Convert the resource to JSON
```powershell
$RealtimeClientEventResponseCreate | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

