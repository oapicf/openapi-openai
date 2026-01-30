# ProjectUserCreateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**user_id** | **str** | The ID of the user. | 
**role** | **str** | &#x60;owner&#x60; or &#x60;member&#x60; | 

## Example

```python
from openapiopenai.models.project_user_create_request import ProjectUserCreateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ProjectUserCreateRequest from a JSON string
project_user_create_request_instance = ProjectUserCreateRequest.from_json(json)
# print the JSON string representation of the object
print(ProjectUserCreateRequest.to_json())

# convert the object into a dict
project_user_create_request_dict = project_user_create_request_instance.to_dict()
# create an instance of ProjectUserCreateRequest from a dict
project_user_create_request_from_dict = ProjectUserCreateRequest.from_dict(project_user_create_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


