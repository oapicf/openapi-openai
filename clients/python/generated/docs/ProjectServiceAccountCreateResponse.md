# ProjectServiceAccountCreateResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **str** |  | 
**id** | **str** |  | 
**name** | **str** |  | 
**role** | **str** | Service accounts can only have one role of type &#x60;member&#x60; | 
**created_at** | **int** |  | 
**api_key** | [**ProjectServiceAccountApiKey**](ProjectServiceAccountApiKey.md) |  | 

## Example

```python
from openapiopenai.models.project_service_account_create_response import ProjectServiceAccountCreateResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ProjectServiceAccountCreateResponse from a JSON string
project_service_account_create_response_instance = ProjectServiceAccountCreateResponse.from_json(json)
# print the JSON string representation of the object
print(ProjectServiceAccountCreateResponse.to_json())

# convert the object into a dict
project_service_account_create_response_dict = project_service_account_create_response_instance.to_dict()
# create an instance of ProjectServiceAccountCreateResponse from a dict
project_service_account_create_response_from_dict = ProjectServiceAccountCreateResponse.from_dict(project_service_account_create_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


