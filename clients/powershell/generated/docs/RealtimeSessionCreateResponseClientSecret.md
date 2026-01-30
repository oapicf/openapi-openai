# RealtimeSessionCreateResponseClientSecret
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Value** | **String** | Ephemeral key usable in client environments to authenticate connections to the Realtime API. Use this in client-side environments rather than a standard API token, which should only be used server-side.  | [optional] 
**ExpiresAt** | **Int32** | Timestamp for when the token expires. Currently, all tokens expire after one minute.  | [optional] 

## Examples

- Prepare the resource
```powershell
$RealtimeSessionCreateResponseClientSecret = Initialize-PSOpenAPIToolsRealtimeSessionCreateResponseClientSecret  -Value null `
 -ExpiresAt null
```

- Convert the resource to JSON
```powershell
$RealtimeSessionCreateResponseClientSecret | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

