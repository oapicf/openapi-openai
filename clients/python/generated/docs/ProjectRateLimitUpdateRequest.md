# ProjectRateLimitUpdateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**max_requests_per_1_minute** | **int** | The maximum requests per minute. | [optional] 
**max_tokens_per_1_minute** | **int** | The maximum tokens per minute. | [optional] 
**max_images_per_1_minute** | **int** | The maximum images per minute. Only relevant for certain models. | [optional] 
**max_audio_megabytes_per_1_minute** | **int** | The maximum audio megabytes per minute. Only relevant for certain models. | [optional] 
**max_requests_per_1_day** | **int** | The maximum requests per day. Only relevant for certain models. | [optional] 
**batch_1_day_max_input_tokens** | **int** | The maximum batch input tokens per day. Only relevant for certain models. | [optional] 

## Example

```python
from openapiopenai.models.project_rate_limit_update_request import ProjectRateLimitUpdateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ProjectRateLimitUpdateRequest from a JSON string
project_rate_limit_update_request_instance = ProjectRateLimitUpdateRequest.from_json(json)
# print the JSON string representation of the object
print(ProjectRateLimitUpdateRequest.to_json())

# convert the object into a dict
project_rate_limit_update_request_dict = project_rate_limit_update_request_instance.to_dict()
# create an instance of ProjectRateLimitUpdateRequest from a dict
project_rate_limit_update_request_from_dict = ProjectRateLimitUpdateRequest.from_dict(project_rate_limit_update_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


