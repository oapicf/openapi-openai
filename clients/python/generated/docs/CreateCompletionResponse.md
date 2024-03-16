# CreateCompletionResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** |  | 
**object** | **str** |  | 
**created** | **int** |  | 
**model** | **str** |  | 
**choices** | [**List[CreateCompletionResponseChoicesInner]**](CreateCompletionResponseChoicesInner.md) |  | 
**usage** | [**CreateCompletionResponseUsage**](CreateCompletionResponseUsage.md) |  | [optional] 

## Example

```python
from openapiopenai.models.create_completion_response import CreateCompletionResponse

# TODO update the JSON string below
json = "{}"
# create an instance of CreateCompletionResponse from a JSON string
create_completion_response_instance = CreateCompletionResponse.from_json(json)
# print the JSON string representation of the object
print(CreateCompletionResponse.to_json())

# convert the object into a dict
create_completion_response_dict = create_completion_response_instance.to_dict()
# create an instance of CreateCompletionResponse from a dict
create_completion_response_form_dict = create_completion_response.from_dict(create_completion_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


