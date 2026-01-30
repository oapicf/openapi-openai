# ProjectRateLimit

Represents a project rate limit config.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **str** | The object type, which is always &#x60;project.rate_limit&#x60; | 
**id** | **str** | The identifier, which can be referenced in API endpoints. | 
**model** | **str** | The model this rate limit applies to. | 
**max_requests_per_1_minute** | **int** | The maximum requests per minute. | 
**max_tokens_per_1_minute** | **int** | The maximum tokens per minute. | 
**max_images_per_1_minute** | **int** | The maximum images per minute. Only present for relevant models. | [optional] 
**max_audio_megabytes_per_1_minute** | **int** | The maximum audio megabytes per minute. Only present for relevant models. | [optional] 
**max_requests_per_1_day** | **int** | The maximum requests per day. Only present for relevant models. | [optional] 
**batch_1_day_max_input_tokens** | **int** | The maximum batch input tokens per day. Only present for relevant models. | [optional] 

## Example

```python
from openapiopenai.models.project_rate_limit import ProjectRateLimit

# TODO update the JSON string below
json = "{}"
# create an instance of ProjectRateLimit from a JSON string
project_rate_limit_instance = ProjectRateLimit.from_json(json)
# print the JSON string representation of the object
print(ProjectRateLimit.to_json())

# convert the object into a dict
project_rate_limit_dict = project_rate_limit_instance.to_dict()
# create an instance of ProjectRateLimit from a dict
project_rate_limit_from_dict = ProjectRateLimit.from_dict(project_rate_limit_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


