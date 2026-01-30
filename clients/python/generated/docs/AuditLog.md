# AuditLog

A log of a user action or configuration change within this organization.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The ID of this log. | 
**type** | [**AuditLogEventType**](AuditLogEventType.md) |  | 
**effective_at** | **int** | The Unix timestamp (in seconds) of the event. | 
**project** | [**AuditLogProject**](AuditLogProject.md) |  | [optional] 
**actor** | [**AuditLogActor**](AuditLogActor.md) |  | 
**api_key_created** | [**AuditLogApiKeyCreated**](AuditLogApiKeyCreated.md) |  | [optional] 
**api_key_updated** | [**AuditLogApiKeyUpdated**](AuditLogApiKeyUpdated.md) |  | [optional] 
**api_key_deleted** | [**AuditLogApiKeyDeleted**](AuditLogApiKeyDeleted.md) |  | [optional] 
**invite_sent** | [**AuditLogInviteSent**](AuditLogInviteSent.md) |  | [optional] 
**invite_accepted** | [**AuditLogInviteAccepted**](AuditLogInviteAccepted.md) |  | [optional] 
**invite_deleted** | [**AuditLogInviteAccepted**](AuditLogInviteAccepted.md) |  | [optional] 
**login_failed** | [**AuditLogLoginFailed**](AuditLogLoginFailed.md) |  | [optional] 
**logout_failed** | [**AuditLogLoginFailed**](AuditLogLoginFailed.md) |  | [optional] 
**organization_updated** | [**AuditLogOrganizationUpdated**](AuditLogOrganizationUpdated.md) |  | [optional] 
**project_created** | [**AuditLogProjectCreated**](AuditLogProjectCreated.md) |  | [optional] 
**project_updated** | [**AuditLogProjectUpdated**](AuditLogProjectUpdated.md) |  | [optional] 
**project_archived** | [**AuditLogProjectArchived**](AuditLogProjectArchived.md) |  | [optional] 
**rate_limit_updated** | [**AuditLogRateLimitUpdated**](AuditLogRateLimitUpdated.md) |  | [optional] 
**rate_limit_deleted** | [**AuditLogRateLimitDeleted**](AuditLogRateLimitDeleted.md) |  | [optional] 
**service_account_created** | [**AuditLogServiceAccountCreated**](AuditLogServiceAccountCreated.md) |  | [optional] 
**service_account_updated** | [**AuditLogServiceAccountUpdated**](AuditLogServiceAccountUpdated.md) |  | [optional] 
**service_account_deleted** | [**AuditLogServiceAccountDeleted**](AuditLogServiceAccountDeleted.md) |  | [optional] 
**user_added** | [**AuditLogUserAdded**](AuditLogUserAdded.md) |  | [optional] 
**user_updated** | [**AuditLogUserUpdated**](AuditLogUserUpdated.md) |  | [optional] 
**user_deleted** | [**AuditLogUserDeleted**](AuditLogUserDeleted.md) |  | [optional] 

## Example

```python
from openapiopenai.models.audit_log import AuditLog

# TODO update the JSON string below
json = "{}"
# create an instance of AuditLog from a JSON string
audit_log_instance = AuditLog.from_json(json)
# print the JSON string representation of the object
print(AuditLog.to_json())

# convert the object into a dict
audit_log_dict = audit_log_instance.to_dict()
# create an instance of AuditLog from a dict
audit_log_from_dict = AuditLog.from_dict(audit_log_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


