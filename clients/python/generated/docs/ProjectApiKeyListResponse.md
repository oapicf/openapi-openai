# ProjectApiKeyListResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **str** |  | 
**data** | [**List[ProjectApiKey]**](ProjectApiKey.md) |  | 
**first_id** | **str** |  | 
**last_id** | **str** |  | 
**has_more** | **bool** |  | 

## Example

```python
from openapiopenai.models.project_api_key_list_response import ProjectApiKeyListResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ProjectApiKeyListResponse from a JSON string
project_api_key_list_response_instance = ProjectApiKeyListResponse.from_json(json)
# print the JSON string representation of the object
print(ProjectApiKeyListResponse.to_json())

# convert the object into a dict
project_api_key_list_response_dict = project_api_key_list_response_instance.to_dict()
# create an instance of ProjectApiKeyListResponse from a dict
project_api_key_list_response_from_dict = ProjectApiKeyListResponse.from_dict(project_api_key_list_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


