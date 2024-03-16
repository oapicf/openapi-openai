# CreateCompletionResponseChoicesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**text** | **str** |  | 
**index** | **int** |  | 
**logprobs** | [**CreateCompletionResponseChoicesInnerLogprobs**](CreateCompletionResponseChoicesInnerLogprobs.md) |  | 
**finish_reason** | **str** |  | 

## Example

```python
from openapiopenai.models.create_completion_response_choices_inner import CreateCompletionResponseChoicesInner

# TODO update the JSON string below
json = "{}"
# create an instance of CreateCompletionResponseChoicesInner from a JSON string
create_completion_response_choices_inner_instance = CreateCompletionResponseChoicesInner.from_json(json)
# print the JSON string representation of the object
print(CreateCompletionResponseChoicesInner.to_json())

# convert the object into a dict
create_completion_response_choices_inner_dict = create_completion_response_choices_inner_instance.to_dict()
# create an instance of CreateCompletionResponseChoicesInner from a dict
create_completion_response_choices_inner_form_dict = create_completion_response_choices_inner.from_dict(create_completion_response_choices_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


