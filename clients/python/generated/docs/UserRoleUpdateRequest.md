# UserRoleUpdateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role** | **str** | &#x60;owner&#x60; or &#x60;reader&#x60; | 

## Example

```python
from openapiopenai.models.user_role_update_request import UserRoleUpdateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UserRoleUpdateRequest from a JSON string
user_role_update_request_instance = UserRoleUpdateRequest.from_json(json)
# print the JSON string representation of the object
print(UserRoleUpdateRequest.to_json())

# convert the object into a dict
user_role_update_request_dict = user_role_update_request_instance.to_dict()
# create an instance of UserRoleUpdateRequest from a dict
user_role_update_request_from_dict = UserRoleUpdateRequest.from_dict(user_role_update_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


