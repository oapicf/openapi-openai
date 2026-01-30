# RealtimeServerEventConversationCreatedConversation
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | The unique ID of the conversation. | [optional] 
**Object** | **String** | The object type, must be &#x60;realtime.conversation&#x60;. | [optional] 

## Examples

- Prepare the resource
```powershell
$RealtimeServerEventConversationCreatedConversation = Initialize-PSOpenAPIToolsRealtimeServerEventConversationCreatedConversation  -Id null `
 -Object null
```

- Convert the resource to JSON
```powershell
$RealtimeServerEventConversationCreatedConversation | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

