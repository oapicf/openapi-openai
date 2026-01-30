# RealtimeServerEventConversationItemCreated
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventId** | **String** | The unique ID of the server event. | 
**Type** | **String** | The event type, must be &#x60;conversation.item.created&#x60;. | 
**PreviousItemId** | **String** | The ID of the preceding item in the Conversation context, allows the  client to understand the order of the conversation.  | 
**Item** | [**RealtimeConversationItem**](RealtimeConversationItem.md) |  | 

## Examples

- Prepare the resource
```powershell
$RealtimeServerEventConversationItemCreated = Initialize-PSOpenAPIToolsRealtimeServerEventConversationItemCreated  -EventId null `
 -Type null `
 -PreviousItemId null `
 -Item null
```

- Convert the resource to JSON
```powershell
$RealtimeServerEventConversationItemCreated | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

