# RealtimeClientEventConversationItemDelete
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventId** | **String** | Optional client-generated ID used to identify this event. | [optional] 
**Type** | **String** | The event type, must be &#x60;conversation.item.delete&#x60;. | 
**ItemId** | **String** | The ID of the item to delete. | 

## Examples

- Prepare the resource
```powershell
$RealtimeClientEventConversationItemDelete = Initialize-PSOpenAPIToolsRealtimeClientEventConversationItemDelete  -EventId null `
 -Type null `
 -ItemId null
```

- Convert the resource to JSON
```powershell
$RealtimeClientEventConversationItemDelete | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

