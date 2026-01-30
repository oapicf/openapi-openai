# AuditLogInviteAccepted

The details for events with this `type`.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The ID of the invite. | [optional] 

## Example

```python
from openapiopenai.models.audit_log_invite_accepted import AuditLogInviteAccepted

# TODO update the JSON string below
json = "{}"
# create an instance of AuditLogInviteAccepted from a JSON string
audit_log_invite_accepted_instance = AuditLogInviteAccepted.from_json(json)
# print the JSON string representation of the object
print(AuditLogInviteAccepted.to_json())

# convert the object into a dict
audit_log_invite_accepted_dict = audit_log_invite_accepted_instance.to_dict()
# create an instance of AuditLogInviteAccepted from a dict
audit_log_invite_accepted_from_dict = AuditLogInviteAccepted.from_dict(audit_log_invite_accepted_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


