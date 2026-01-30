# RealtimeServerEventResponseOutputItemAdded
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventId** | **String** | The unique ID of the server event. | 
**Type** | **String** | The event type, must be &#x60;response.output_item.added&#x60;. | 
**ResponseId** | **String** | The ID of the Response to which the item belongs. | 
**OutputIndex** | **Int32** | The index of the output item in the Response. | 
**Item** | [**RealtimeConversationItem**](RealtimeConversationItem.md) |  | 

## Examples

- Prepare the resource
```powershell
$RealtimeServerEventResponseOutputItemAdded = Initialize-PSOpenAPIToolsRealtimeServerEventResponseOutputItemAdded  -EventId null `
 -Type null `
 -ResponseId null `
 -OutputIndex null `
 -Item null
```

- Convert the resource to JSON
```powershell
$RealtimeServerEventResponseOutputItemAdded | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

