# ProjectUserUpdateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role** | **str** | &#x60;owner&#x60; or &#x60;member&#x60; | 

## Example

```python
from openapiopenai.models.project_user_update_request import ProjectUserUpdateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ProjectUserUpdateRequest from a JSON string
project_user_update_request_instance = ProjectUserUpdateRequest.from_json(json)
# print the JSON string representation of the object
print(ProjectUserUpdateRequest.to_json())

# convert the object into a dict
project_user_update_request_dict = project_user_update_request_instance.to_dict()
# create an instance of ProjectUserUpdateRequest from a dict
project_user_update_request_from_dict = ProjectUserUpdateRequest.from_dict(project_user_update_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


