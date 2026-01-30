# RealtimeClientEventConversationItemTruncate
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventId** | **String** | Optional client-generated ID used to identify this event. | [optional] 
**Type** | **String** | The event type, must be &#x60;conversation.item.truncate&#x60;. | 
**ItemId** | **String** | The ID of the assistant message item to truncate. Only assistant message  items can be truncated.  | 
**ContentIndex** | **Int32** | The index of the content part to truncate. Set this to 0. | 
**AudioEndMs** | **Int32** | Inclusive duration up to which audio is truncated, in milliseconds. If  the audio_end_ms is greater than the actual audio duration, the server  will respond with an error.  | 

## Examples

- Prepare the resource
```powershell
$RealtimeClientEventConversationItemTruncate = Initialize-PSOpenAPIToolsRealtimeClientEventConversationItemTruncate  -EventId null `
 -Type null `
 -ItemId null `
 -ContentIndex null `
 -AudioEndMs null
```

- Convert the resource to JSON
```powershell
$RealtimeClientEventConversationItemTruncate | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

