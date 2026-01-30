# ProjectUser

Represents an individual user in a project.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **str** | The object type, which is always &#x60;organization.project.user&#x60; | 
**id** | **str** | The identifier, which can be referenced in API endpoints | 
**name** | **str** | The name of the user | 
**email** | **str** | The email address of the user | 
**role** | **str** | &#x60;owner&#x60; or &#x60;member&#x60; | 
**added_at** | **int** | The Unix timestamp (in seconds) of when the project was added. | 

## Example

```python
from openapiopenai.models.project_user import ProjectUser

# TODO update the JSON string below
json = "{}"
# create an instance of ProjectUser from a JSON string
project_user_instance = ProjectUser.from_json(json)
# print the JSON string representation of the object
print(ProjectUser.to_json())

# convert the object into a dict
project_user_dict = project_user_instance.to_dict()
# create an instance of ProjectUser from a dict
project_user_from_dict = ProjectUser.from_dict(project_user_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


