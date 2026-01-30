# ProjectServiceAccountListResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **str** |  | 
**data** | [**List[ProjectServiceAccount]**](ProjectServiceAccount.md) |  | 
**first_id** | **str** |  | 
**last_id** | **str** |  | 
**has_more** | **bool** |  | 

## Example

```python
from openapiopenai.models.project_service_account_list_response import ProjectServiceAccountListResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ProjectServiceAccountListResponse from a JSON string
project_service_account_list_response_instance = ProjectServiceAccountListResponse.from_json(json)
# print the JSON string representation of the object
print(ProjectServiceAccountListResponse.to_json())

# convert the object into a dict
project_service_account_list_response_dict = project_service_account_list_response_instance.to_dict()
# create an instance of ProjectServiceAccountListResponse from a dict
project_service_account_list_response_from_dict = ProjectServiceAccountListResponse.from_dict(project_service_account_list_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


