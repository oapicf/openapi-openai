# UserDeleteResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **str** |  | 
**id** | **str** |  | 
**deleted** | **bool** |  | 

## Example

```python
from openapiopenai.models.user_delete_response import UserDeleteResponse

# TODO update the JSON string below
json = "{}"
# create an instance of UserDeleteResponse from a JSON string
user_delete_response_instance = UserDeleteResponse.from_json(json)
# print the JSON string representation of the object
print(UserDeleteResponse.to_json())

# convert the object into a dict
user_delete_response_dict = user_delete_response_instance.to_dict()
# create an instance of UserDeleteResponse from a dict
user_delete_response_from_dict = UserDeleteResponse.from_dict(user_delete_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


