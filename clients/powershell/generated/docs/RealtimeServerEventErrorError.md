# RealtimeServerEventErrorError
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **String** | The type of error (e.g., &quot;&quot;invalid_request_error&quot;&quot;, &quot;&quot;server_error&quot;&quot;).  | 
**Code** | **String** | Error code, if any. | [optional] 
**Message** | **String** | A human-readable error message. | 
**VarParam** | **String** | Parameter related to the error, if any. | [optional] 
**EventId** | **String** | The event_id of the client event that caused the error, if applicable.  | [optional] 

## Examples

- Prepare the resource
```powershell
$RealtimeServerEventErrorError = Initialize-PSOpenAPIToolsRealtimeServerEventErrorError  -Type null `
 -Code null `
 -Message null `
 -VarParam null `
 -EventId null
```

- Convert the resource to JSON
```powershell
$RealtimeServerEventErrorError | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

