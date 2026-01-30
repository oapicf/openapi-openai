# ProjectServiceAccount

Represents an individual service account in a project.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **str** | The object type, which is always &#x60;organization.project.service_account&#x60; | 
**id** | **str** | The identifier, which can be referenced in API endpoints | 
**name** | **str** | The name of the service account | 
**role** | **str** | &#x60;owner&#x60; or &#x60;member&#x60; | 
**created_at** | **int** | The Unix timestamp (in seconds) of when the service account was created | 

## Example

```python
from openapiopenai.models.project_service_account import ProjectServiceAccount

# TODO update the JSON string below
json = "{}"
# create an instance of ProjectServiceAccount from a JSON string
project_service_account_instance = ProjectServiceAccount.from_json(json)
# print the JSON string representation of the object
print(ProjectServiceAccount.to_json())

# convert the object into a dict
project_service_account_dict = project_service_account_instance.to_dict()
# create an instance of ProjectServiceAccount from a dict
project_service_account_from_dict = ProjectServiceAccount.from_dict(project_service_account_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


