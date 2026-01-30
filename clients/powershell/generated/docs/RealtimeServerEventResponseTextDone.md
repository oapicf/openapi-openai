# RealtimeServerEventResponseTextDone
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventId** | **String** | The unique ID of the server event. | 
**Type** | **String** | The event type, must be &#x60;response.text.done&#x60;. | 
**ResponseId** | **String** | The ID of the response. | 
**ItemId** | **String** | The ID of the item. | 
**OutputIndex** | **Int32** | The index of the output item in the response. | 
**ContentIndex** | **Int32** | The index of the content part in the item&#39;s content array. | 
**Text** | **String** | The final text content. | 

## Examples

- Prepare the resource
```powershell
$RealtimeServerEventResponseTextDone = Initialize-PSOpenAPIToolsRealtimeServerEventResponseTextDone  -EventId null `
 -Type null `
 -ResponseId null `
 -ItemId null `
 -OutputIndex null `
 -ContentIndex null `
 -Text null
```

- Convert the resource to JSON
```powershell
$RealtimeServerEventResponseTextDone | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

