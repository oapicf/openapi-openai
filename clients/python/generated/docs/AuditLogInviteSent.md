# AuditLogInviteSent

The details for events with this `type`.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The ID of the invite. | [optional] 
**data** | [**AuditLogInviteSentData**](AuditLogInviteSentData.md) |  | [optional] 

## Example

```python
from openapiopenai.models.audit_log_invite_sent import AuditLogInviteSent

# TODO update the JSON string below
json = "{}"
# create an instance of AuditLogInviteSent from a JSON string
audit_log_invite_sent_instance = AuditLogInviteSent.from_json(json)
# print the JSON string representation of the object
print(AuditLogInviteSent.to_json())

# convert the object into a dict
audit_log_invite_sent_dict = audit_log_invite_sent_instance.to_dict()
# create an instance of AuditLogInviteSent from a dict
audit_log_invite_sent_from_dict = AuditLogInviteSent.from_dict(audit_log_invite_sent_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


