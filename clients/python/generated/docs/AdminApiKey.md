# AdminApiKey


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **str** |  | [optional] 
**id** | **str** |  | [optional] 
**name** | **str** |  | [optional] 
**redacted_value** | **str** |  | [optional] 
**value** | **str** |  | [optional] 
**created_at** | **int** |  | [optional] 
**owner** | [**AdminApiKeyOwner**](AdminApiKeyOwner.md) |  | [optional] 

## Example

```python
from openapiopenai.models.admin_api_key import AdminApiKey

# TODO update the JSON string below
json = "{}"
# create an instance of AdminApiKey from a JSON string
admin_api_key_instance = AdminApiKey.from_json(json)
# print the JSON string representation of the object
print(AdminApiKey.to_json())

# convert the object into a dict
admin_api_key_dict = admin_api_key_instance.to_dict()
# create an instance of AdminApiKey from a dict
admin_api_key_from_dict = AdminApiKey.from_dict(admin_api_key_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


