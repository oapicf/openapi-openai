# ListAuditLogsEffectiveAtParameter
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Gt** | **Int32** | Return only events whose &#x60;effective_at&#x60; (Unix seconds) is greater than this value. | [optional] 
**Gte** | **Int32** | Return only events whose &#x60;effective_at&#x60; (Unix seconds) is greater than or equal to this value. | [optional] 
**Lt** | **Int32** | Return only events whose &#x60;effective_at&#x60; (Unix seconds) is less than this value. | [optional] 
**Lte** | **Int32** | Return only events whose &#x60;effective_at&#x60; (Unix seconds) is less than or equal to this value. | [optional] 

## Examples

- Prepare the resource
```powershell
$ListAuditLogsEffectiveAtParameter = Initialize-PSOpenAPIToolsListAuditLogsEffectiveAtParameter  -Gt null `
 -Gte null `
 -Lt null `
 -Lte null
```

- Convert the resource to JSON
```powershell
$ListAuditLogsEffectiveAtParameter | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

