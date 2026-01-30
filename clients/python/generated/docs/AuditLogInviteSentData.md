# AuditLogInviteSentData

The payload used to create the invite.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | **str** | The email invited to the organization. | [optional] 
**role** | **str** | The role the email was invited to be. Is either &#x60;owner&#x60; or &#x60;member&#x60;. | [optional] 

## Example

```python
from openapiopenai.models.audit_log_invite_sent_data import AuditLogInviteSentData

# TODO update the JSON string below
json = "{}"
# create an instance of AuditLogInviteSentData from a JSON string
audit_log_invite_sent_data_instance = AuditLogInviteSentData.from_json(json)
# print the JSON string representation of the object
print(AuditLogInviteSentData.to_json())

# convert the object into a dict
audit_log_invite_sent_data_dict = audit_log_invite_sent_data_instance.to_dict()
# create an instance of AuditLogInviteSentData from a dict
audit_log_invite_sent_data_from_dict = AuditLogInviteSentData.from_dict(audit_log_invite_sent_data_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


