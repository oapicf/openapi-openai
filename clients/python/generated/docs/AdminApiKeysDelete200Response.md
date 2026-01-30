# AdminApiKeysDelete200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** |  | [optional] 
**object** | **str** |  | [optional] 
**deleted** | **bool** |  | [optional] 

## Example

```python
from openapiopenai.models.admin_api_keys_delete200_response import AdminApiKeysDelete200Response

# TODO update the JSON string below
json = "{}"
# create an instance of AdminApiKeysDelete200Response from a JSON string
admin_api_keys_delete200_response_instance = AdminApiKeysDelete200Response.from_json(json)
# print the JSON string representation of the object
print(AdminApiKeysDelete200Response.to_json())

# convert the object into a dict
admin_api_keys_delete200_response_dict = admin_api_keys_delete200_response_instance.to_dict()
# create an instance of AdminApiKeysDelete200Response from a dict
admin_api_keys_delete200_response_from_dict = AdminApiKeysDelete200Response.from_dict(admin_api_keys_delete200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


