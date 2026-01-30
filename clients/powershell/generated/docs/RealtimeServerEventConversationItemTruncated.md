# RealtimeServerEventConversationItemTruncated
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventId** | **String** | The unique ID of the server event. | 
**Type** | **String** | The event type, must be &#x60;conversation.item.truncated&#x60;. | 
**ItemId** | **String** | The ID of the assistant message item that was truncated. | 
**ContentIndex** | **Int32** | The index of the content part that was truncated. | 
**AudioEndMs** | **Int32** | The duration up to which the audio was truncated, in milliseconds.  | 

## Examples

- Prepare the resource
```powershell
$RealtimeServerEventConversationItemTruncated = Initialize-PSOpenAPIToolsRealtimeServerEventConversationItemTruncated  -EventId null `
 -Type null `
 -ItemId null `
 -ContentIndex null `
 -AudioEndMs null
```

- Convert the resource to JSON
```powershell
$RealtimeServerEventConversationItemTruncated | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

