# ProjectUserListResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **str** |  | 
**data** | [**List[ProjectUser]**](ProjectUser.md) |  | 
**first_id** | **str** |  | 
**last_id** | **str** |  | 
**has_more** | **bool** |  | 

## Example

```python
from openapiopenai.models.project_user_list_response import ProjectUserListResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ProjectUserListResponse from a JSON string
project_user_list_response_instance = ProjectUserListResponse.from_json(json)
# print the JSON string representation of the object
print(ProjectUserListResponse.to_json())

# convert the object into a dict
project_user_list_response_dict = project_user_list_response_instance.to_dict()
# create an instance of ProjectUserListResponse from a dict
project_user_list_response_from_dict = ProjectUserListResponse.from_dict(project_user_list_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


