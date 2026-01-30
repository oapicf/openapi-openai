# ProjectServiceAccountDeleteResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **str** |  | 
**id** | **str** |  | 
**deleted** | **bool** |  | 

## Example

```python
from openapiopenai.models.project_service_account_delete_response import ProjectServiceAccountDeleteResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ProjectServiceAccountDeleteResponse from a JSON string
project_service_account_delete_response_instance = ProjectServiceAccountDeleteResponse.from_json(json)
# print the JSON string representation of the object
print(ProjectServiceAccountDeleteResponse.to_json())

# convert the object into a dict
project_service_account_delete_response_dict = project_service_account_delete_response_instance.to_dict()
# create an instance of ProjectServiceAccountDeleteResponse from a dict
project_service_account_delete_response_from_dict = ProjectServiceAccountDeleteResponse.from_dict(project_service_account_delete_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


