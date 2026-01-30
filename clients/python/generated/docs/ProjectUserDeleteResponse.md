# ProjectUserDeleteResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **str** |  | 
**id** | **str** |  | 
**deleted** | **bool** |  | 

## Example

```python
from openapiopenai.models.project_user_delete_response import ProjectUserDeleteResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ProjectUserDeleteResponse from a JSON string
project_user_delete_response_instance = ProjectUserDeleteResponse.from_json(json)
# print the JSON string representation of the object
print(ProjectUserDeleteResponse.to_json())

# convert the object into a dict
project_user_delete_response_dict = project_user_delete_response_instance.to_dict()
# create an instance of ProjectUserDeleteResponse from a dict
project_user_delete_response_from_dict = ProjectUserDeleteResponse.from_dict(project_user_delete_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


