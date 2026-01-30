# AuditLogOrganizationUpdatedChangesRequestedSettings
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ThreadsUiVisibility** | **String** | Visibility of the threads page which shows messages created with the Assistants API and Playground. One of &#x60;ANY_ROLE&#x60;, &#x60;OWNERS&#x60;, or &#x60;NONE&#x60;. | [optional] 
**UsageDashboardVisibility** | **String** | Visibility of the usage dashboard which shows activity and costs for your organization. One of &#x60;ANY_ROLE&#x60; or &#x60;OWNERS&#x60;. | [optional] 

## Examples

- Prepare the resource
```powershell
$AuditLogOrganizationUpdatedChangesRequestedSettings = Initialize-PSOpenAPIToolsAuditLogOrganizationUpdatedChangesRequestedSettings  -ThreadsUiVisibility null `
 -UsageDashboardVisibility null
```

- Convert the resource to JSON
```powershell
$AuditLogOrganizationUpdatedChangesRequestedSettings | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

