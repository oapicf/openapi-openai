# RealtimeServerEventConversationCreated
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventId** | **String** | The unique ID of the server event. | 
**Type** | **String** | The event type, must be &#x60;conversation.created&#x60;. | 
**Conversation** | [**RealtimeServerEventConversationCreatedConversation**](RealtimeServerEventConversationCreatedConversation.md) |  | 

## Examples

- Prepare the resource
```powershell
$RealtimeServerEventConversationCreated = Initialize-PSOpenAPIToolsRealtimeServerEventConversationCreated  -EventId null `
 -Type null `
 -Conversation null
```

- Convert the resource to JSON
```powershell
$RealtimeServerEventConversationCreated | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

