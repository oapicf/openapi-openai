# ProjectServiceAccountApiKey


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **str** | The object type, which is always &#x60;organization.project.service_account.api_key&#x60; | 
**value** | **str** |  | 
**name** | **str** |  | 
**created_at** | **int** |  | 
**id** | **str** |  | 

## Example

```python
from openapiopenai.models.project_service_account_api_key import ProjectServiceAccountApiKey

# TODO update the JSON string below
json = "{}"
# create an instance of ProjectServiceAccountApiKey from a JSON string
project_service_account_api_key_instance = ProjectServiceAccountApiKey.from_json(json)
# print the JSON string representation of the object
print(ProjectServiceAccountApiKey.to_json())

# convert the object into a dict
project_service_account_api_key_dict = project_service_account_api_key_instance.to_dict()
# create an instance of ProjectServiceAccountApiKey from a dict
project_service_account_api_key_from_dict = ProjectServiceAccountApiKey.from_dict(project_service_account_api_key_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


