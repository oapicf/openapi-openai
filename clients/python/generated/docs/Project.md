# Project

Represents an individual project.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The identifier, which can be referenced in API endpoints | 
**object** | **str** | The object type, which is always &#x60;organization.project&#x60; | 
**name** | **str** | The name of the project. This appears in reporting. | 
**created_at** | **int** | The Unix timestamp (in seconds) of when the project was created. | 
**archived_at** | **int** | The Unix timestamp (in seconds) of when the project was archived or &#x60;null&#x60;. | [optional] 
**status** | **str** | &#x60;active&#x60; or &#x60;archived&#x60; | 

## Example

```python
from openapiopenai.models.project import Project

# TODO update the JSON string below
json = "{}"
# create an instance of Project from a JSON string
project_instance = Project.from_json(json)
# print the JSON string representation of the object
print(Project.to_json())

# convert the object into a dict
project_dict = project_instance.to_dict()
# create an instance of Project from a dict
project_from_dict = Project.from_dict(project_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


