# ProjectApiKeyDeleteResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **str** |  | 
**id** | **str** |  | 
**deleted** | **bool** |  | 

## Example

```python
from openapiopenai.models.project_api_key_delete_response import ProjectApiKeyDeleteResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ProjectApiKeyDeleteResponse from a JSON string
project_api_key_delete_response_instance = ProjectApiKeyDeleteResponse.from_json(json)
# print the JSON string representation of the object
print(ProjectApiKeyDeleteResponse.to_json())

# convert the object into a dict
project_api_key_delete_response_dict = project_api_key_delete_response_instance.to_dict()
# create an instance of ProjectApiKeyDeleteResponse from a dict
project_api_key_delete_response_from_dict = ProjectApiKeyDeleteResponse.from_dict(project_api_key_delete_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


