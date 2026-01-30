# ProjectApiKey

Represents an individual API key in a project.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **str** | The object type, which is always &#x60;organization.project.api_key&#x60; | 
**redacted_value** | **str** | The redacted value of the API key | 
**name** | **str** | The name of the API key | 
**created_at** | **int** | The Unix timestamp (in seconds) of when the API key was created | 
**id** | **str** | The identifier, which can be referenced in API endpoints | 
**owner** | [**ProjectApiKeyOwner**](ProjectApiKeyOwner.md) |  | 

## Example

```python
from openapiopenai.models.project_api_key import ProjectApiKey

# TODO update the JSON string below
json = "{}"
# create an instance of ProjectApiKey from a JSON string
project_api_key_instance = ProjectApiKey.from_json(json)
# print the JSON string representation of the object
print(ProjectApiKey.to_json())

# convert the object into a dict
project_api_key_dict = project_api_key_instance.to_dict()
# create an instance of ProjectApiKey from a dict
project_api_key_from_dict = ProjectApiKey.from_dict(project_api_key_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


