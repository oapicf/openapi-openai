# ProjectApiKeyOwner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | &#x60;user&#x60; or &#x60;service_account&#x60; | [optional] 
**user** | [**ProjectUser**](ProjectUser.md) |  | [optional] 
**service_account** | [**ProjectServiceAccount**](ProjectServiceAccount.md) |  | [optional] 

## Example

```python
from openapiopenai.models.project_api_key_owner import ProjectApiKeyOwner

# TODO update the JSON string below
json = "{}"
# create an instance of ProjectApiKeyOwner from a JSON string
project_api_key_owner_instance = ProjectApiKeyOwner.from_json(json)
# print the JSON string representation of the object
print(ProjectApiKeyOwner.to_json())

# convert the object into a dict
project_api_key_owner_dict = project_api_key_owner_instance.to_dict()
# create an instance of ProjectApiKeyOwner from a dict
project_api_key_owner_from_dict = ProjectApiKeyOwner.from_dict(project_api_key_owner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


