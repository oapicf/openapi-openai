# DefaultProjectErrorResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **int** |  | 
**message** | **str** |  | 

## Example

```python
from openapiopenai.models.default_project_error_response import DefaultProjectErrorResponse

# TODO update the JSON string below
json = "{}"
# create an instance of DefaultProjectErrorResponse from a JSON string
default_project_error_response_instance = DefaultProjectErrorResponse.from_json(json)
# print the JSON string representation of the object
print(DefaultProjectErrorResponse.to_json())

# convert the object into a dict
default_project_error_response_dict = default_project_error_response_instance.to_dict()
# create an instance of DefaultProjectErrorResponse from a dict
default_project_error_response_from_dict = DefaultProjectErrorResponse.from_dict(default_project_error_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


