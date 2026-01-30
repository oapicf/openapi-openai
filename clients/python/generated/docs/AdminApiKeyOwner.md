# AdminApiKeyOwner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** |  | [optional] 
**id** | **str** |  | [optional] 
**name** | **str** |  | [optional] 
**created_at** | **int** |  | [optional] 
**role** | **str** |  | [optional] 

## Example

```python
from openapiopenai.models.admin_api_key_owner import AdminApiKeyOwner

# TODO update the JSON string below
json = "{}"
# create an instance of AdminApiKeyOwner from a JSON string
admin_api_key_owner_instance = AdminApiKeyOwner.from_json(json)
# print the JSON string representation of the object
print(AdminApiKeyOwner.to_json())

# convert the object into a dict
admin_api_key_owner_dict = admin_api_key_owner_instance.to_dict()
# create an instance of AdminApiKeyOwner from a dict
admin_api_key_owner_from_dict = AdminApiKeyOwner.from_dict(admin_api_key_owner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


