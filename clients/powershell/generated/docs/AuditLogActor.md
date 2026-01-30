# AuditLogActor
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **String** | The type of actor. Is either &#x60;session&#x60; or &#x60;api_key&#x60;. | [optional] 
**Session** | [**AuditLogActorSession**](.md) |  | [optional] 
**ApiKey** | [**AuditLogActorApiKey**](.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$AuditLogActor = Initialize-PSOpenAPIToolsAuditLogActor  -Type null `
 -Session null `
 -ApiKey null
```

- Convert the resource to JSON
```powershell
$AuditLogActor | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

