# RealtimeServerEventResponseFunctionCallArgumentsDelta
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventId** | **String** | The unique ID of the server event. | 
**Type** | **String** | The event type, must be &#x60;response.function_call_arguments.delta&#x60;.  | 
**ResponseId** | **String** | The ID of the response. | 
**ItemId** | **String** | The ID of the function call item. | 
**OutputIndex** | **Int32** | The index of the output item in the response. | 
**CallId** | **String** | The ID of the function call. | 
**Delta** | **String** | The arguments delta as a JSON string. | 

## Examples

- Prepare the resource
```powershell
$RealtimeServerEventResponseFunctionCallArgumentsDelta = Initialize-PSOpenAPIToolsRealtimeServerEventResponseFunctionCallArgumentsDelta  -EventId null `
 -Type null `
 -ResponseId null `
 -ItemId null `
 -OutputIndex null `
 -CallId null `
 -Delta null
```

- Convert the resource to JSON
```powershell
$RealtimeServerEventResponseFunctionCallArgumentsDelta | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

