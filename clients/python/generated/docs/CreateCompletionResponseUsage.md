# CreateCompletionResponseUsage


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**prompt_tokens** | **int** |  | 
**completion_tokens** | **int** |  | 
**total_tokens** | **int** |  | 

## Example

```python
from openapiopenai.models.create_completion_response_usage import CreateCompletionResponseUsage

# TODO update the JSON string below
json = "{}"
# create an instance of CreateCompletionResponseUsage from a JSON string
create_completion_response_usage_instance = CreateCompletionResponseUsage.from_json(json)
# print the JSON string representation of the object
print(CreateCompletionResponseUsage.to_json())

# convert the object into a dict
create_completion_response_usage_dict = create_completion_response_usage_instance.to_dict()
# create an instance of CreateCompletionResponseUsage from a dict
create_completion_response_usage_form_dict = create_completion_response_usage.from_dict(create_completion_response_usage_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


