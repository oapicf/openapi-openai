# AuditLogUserAddedData

The payload used to add the user to the project.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role** | **str** | The role of the user. Is either &#x60;owner&#x60; or &#x60;member&#x60;. | [optional] 

## Example

```python
from openapiopenai.models.audit_log_user_added_data import AuditLogUserAddedData

# TODO update the JSON string below
json = "{}"
# create an instance of AuditLogUserAddedData from a JSON string
audit_log_user_added_data_instance = AuditLogUserAddedData.from_json(json)
# print the JSON string representation of the object
print(AuditLogUserAddedData.to_json())

# convert the object into a dict
audit_log_user_added_data_dict = audit_log_user_added_data_instance.to_dict()
# create an instance of AuditLogUserAddedData from a dict
audit_log_user_added_data_from_dict = AuditLogUserAddedData.from_dict(audit_log_user_added_data_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


