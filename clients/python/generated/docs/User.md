# User

Represents an individual `user` within an organization.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **str** | The object type, which is always &#x60;organization.user&#x60; | 
**id** | **str** | The identifier, which can be referenced in API endpoints | 
**name** | **str** | The name of the user | 
**email** | **str** | The email address of the user | 
**role** | **str** | &#x60;owner&#x60; or &#x60;reader&#x60; | 
**added_at** | **int** | The Unix timestamp (in seconds) of when the user was added. | 

## Example

```python
from openapiopenai.models.user import User

# TODO update the JSON string below
json = "{}"
# create an instance of User from a JSON string
user_instance = User.from_json(json)
# print the JSON string representation of the object
print(User.to_json())

# convert the object into a dict
user_dict = user_instance.to_dict()
# create an instance of User from a dict
user_from_dict = User.from_dict(user_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


