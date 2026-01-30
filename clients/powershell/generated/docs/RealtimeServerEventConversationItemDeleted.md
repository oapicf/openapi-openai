# RealtimeServerEventConversationItemDeleted
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventId** | **String** | The unique ID of the server event. | 
**Type** | **String** | The event type, must be &#x60;conversation.item.deleted&#x60;. | 
**ItemId** | **String** | The ID of the item that was deleted. | 

## Examples

- Prepare the resource
```powershell
$RealtimeServerEventConversationItemDeleted = Initialize-PSOpenAPIToolsRealtimeServerEventConversationItemDeleted  -EventId null `
 -Type null `
 -ItemId null
```

- Convert the resource to JSON
```powershell
$RealtimeServerEventConversationItemDeleted | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

