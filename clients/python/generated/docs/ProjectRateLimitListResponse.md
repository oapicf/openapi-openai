# ProjectRateLimitListResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **str** |  | 
**data** | [**List[ProjectRateLimit]**](ProjectRateLimit.md) |  | 
**first_id** | **str** |  | 
**last_id** | **str** |  | 
**has_more** | **bool** |  | 

## Example

```python
from openapiopenai.models.project_rate_limit_list_response import ProjectRateLimitListResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ProjectRateLimitListResponse from a JSON string
project_rate_limit_list_response_instance = ProjectRateLimitListResponse.from_json(json)
# print the JSON string representation of the object
print(ProjectRateLimitListResponse.to_json())

# convert the object into a dict
project_rate_limit_list_response_dict = project_rate_limit_list_response_instance.to_dict()
# create an instance of ProjectRateLimitListResponse from a dict
project_rate_limit_list_response_from_dict = ProjectRateLimitListResponse.from_dict(project_rate_limit_list_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


