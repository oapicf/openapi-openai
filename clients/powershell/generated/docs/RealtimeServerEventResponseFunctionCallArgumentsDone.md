# RealtimeServerEventResponseFunctionCallArgumentsDone
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventId** | **String** | The unique ID of the server event. | 
**Type** | **String** | The event type, must be &#x60;response.function_call_arguments.done&#x60;.  | 
**ResponseId** | **String** | The ID of the response. | 
**ItemId** | **String** | The ID of the function call item. | 
**OutputIndex** | **Int32** | The index of the output item in the response. | 
**CallId** | **String** | The ID of the function call. | 
**Arguments** | **String** | The final arguments as a JSON string. | 

## Examples

- Prepare the resource
```powershell
$RealtimeServerEventResponseFunctionCallArgumentsDone = Initialize-PSOpenAPIToolsRealtimeServerEventResponseFunctionCallArgumentsDone  -EventId null `
 -Type null `
 -ResponseId null `
 -ItemId null `
 -OutputIndex null `
 -CallId null `
 -Arguments null
```

- Convert the resource to JSON
```powershell
$RealtimeServerEventResponseFunctionCallArgumentsDone | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

