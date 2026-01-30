# AdminApiKeysCreateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 

## Example

```python
from openapiopenai.models.admin_api_keys_create_request import AdminApiKeysCreateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of AdminApiKeysCreateRequest from a JSON string
admin_api_keys_create_request_instance = AdminApiKeysCreateRequest.from_json(json)
# print the JSON string representation of the object
print(AdminApiKeysCreateRequest.to_json())

# convert the object into a dict
admin_api_keys_create_request_dict = admin_api_keys_create_request_instance.to_dict()
# create an instance of AdminApiKeysCreateRequest from a dict
admin_api_keys_create_request_from_dict = AdminApiKeysCreateRequest.from_dict(admin_api_keys_create_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


