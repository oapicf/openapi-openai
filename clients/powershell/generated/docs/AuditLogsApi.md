# PSOpenAPITools.PSOpenAPITools\Api.AuditLogsApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-ListAuditLogs**](AuditLogsApi.md#Invoke-ListAuditLogs) | **GET** /organization/audit_logs | List user actions and configuration changes within this organization.


<a id="Invoke-ListAuditLogs"></a>
# **Invoke-ListAuditLogs**
> ListAuditLogsResponse Invoke-ListAuditLogs<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EffectiveAt] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProjectIds] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EventTypes] <PSCustomObject[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ActorIds] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ActorEmails] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ResourceIds] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-After] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Before] <String><br>

List user actions and configuration changes within this organization.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$ListAuditLogsEffectiveAtParameter = Initialize-ListAuditLogsEffectiveAtParameter -Gt 0 -Gte 0 -Lt 0 -Lte 0 # ListAuditLogsEffectiveAtParameter | Return only events whose `effective_at` (Unix seconds) is in this range. (optional)
$ProjectIds = "MyProjectIds" # String[] | Return only events for these projects. (optional)
$EventTypes = "api_key.created" # AuditLogEventType[] | Return only events with a `type` in one of these values. For example, `project.created`. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object). (optional)
$ActorIds = "MyActorIds" # String[] | Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID. (optional)
$ActorEmails = "MyActorEmails" # String[] | Return only events performed by users with these emails. (optional)
$ResourceIds = "MyResourceIds" # String[] | Return only events performed on these targets. For example, a project ID updated. (optional)
$Limit = 56 # Int32 | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to 20)
$After = "MyAfter" # String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
$Before = "MyBefore" # String | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)

# List user actions and configuration changes within this organization.
try {
    $Result = Invoke-ListAuditLogs -EffectiveAt $EffectiveAt -ProjectIds $ProjectIds -EventTypes $EventTypes -ActorIds $ActorIds -ActorEmails $ActorEmails -ResourceIds $ResourceIds -Limit $Limit -After $After -Before $Before
} catch {
    Write-Host ("Exception occurred when calling Invoke-ListAuditLogs: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **EffectiveAt** | [**ListAuditLogsEffectiveAtParameter**](ListAuditLogsEffectiveAtParameter.md)| Return only events whose &#x60;effective_at&#x60; (Unix seconds) is in this range. | [optional] 
 **ProjectIds** | [**String[]**](String.md)| Return only events for these projects. | [optional] 
 **EventTypes** | [**AuditLogEventType[]**](AuditLogEventType.md)| Return only events with a &#x60;type&#x60; in one of these values. For example, &#x60;project.created&#x60;. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object). | [optional] 
 **ActorIds** | [**String[]**](String.md)| Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID. | [optional] 
 **ActorEmails** | [**String[]**](String.md)| Return only events performed by users with these emails. | [optional] 
 **ResourceIds** | [**String[]**](String.md)| Return only events performed on these targets. For example, a project ID updated. | [optional] 
 **Limit** | **Int32**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **After** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
 **Before** | **String**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] 

### Return type

[**ListAuditLogsResponse**](ListAuditLogsResponse.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

