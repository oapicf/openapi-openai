# ProjectServiceAccountCreateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | The name of the service account being created. | 

## Example

```python
from openapiopenai.models.project_service_account_create_request import ProjectServiceAccountCreateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ProjectServiceAccountCreateRequest from a JSON string
project_service_account_create_request_instance = ProjectServiceAccountCreateRequest.from_json(json)
# print the JSON string representation of the object
print(ProjectServiceAccountCreateRequest.to_json())

# convert the object into a dict
project_service_account_create_request_dict = project_service_account_create_request_instance.to_dict()
# create an instance of ProjectServiceAccountCreateRequest from a dict
project_service_account_create_request_from_dict = ProjectServiceAccountCreateRequest.from_dict(project_service_account_create_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


