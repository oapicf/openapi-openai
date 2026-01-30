# AuditLogLoginFailed
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ErrorCode** | **String** | The error code of the failure. | [optional] 
**ErrorMessage** | **String** | The error message of the failure. | [optional] 

## Examples

- Prepare the resource
```powershell
$AuditLogLoginFailed = Initialize-PSOpenAPIToolsAuditLogLoginFailed  -ErrorCode null `
 -ErrorMessage null
```

- Convert the resource to JSON
```powershell
$AuditLogLoginFailed | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

