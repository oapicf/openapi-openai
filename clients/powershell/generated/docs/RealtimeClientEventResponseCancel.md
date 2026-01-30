# RealtimeClientEventResponseCancel
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventId** | **String** | Optional client-generated ID used to identify this event. | [optional] 
**Type** | **String** | The event type, must be &#x60;response.cancel&#x60;. | 
**ResponseId** | **String** | A specific response ID to cancel - if not provided, will cancel an  in-progress response in the default conversation.  | [optional] 

## Examples

- Prepare the resource
```powershell
$RealtimeClientEventResponseCancel = Initialize-PSOpenAPIToolsRealtimeClientEventResponseCancel  -EventId null `
 -Type null `
 -ResponseId null
```

- Convert the resource to JSON
```powershell
$RealtimeClientEventResponseCancel | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

