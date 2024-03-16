# CreateEditResponseChoicesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**text** | **str** |  | [optional] 
**index** | **int** |  | [optional] 
**logprobs** | [**CreateCompletionResponseChoicesInnerLogprobs**](CreateCompletionResponseChoicesInnerLogprobs.md) |  | [optional] 
**finish_reason** | **str** |  | [optional] 

## Example

```python
from openapiopenai.models.create_edit_response_choices_inner import CreateEditResponseChoicesInner

# TODO update the JSON string below
json = "{}"
# create an instance of CreateEditResponseChoicesInner from a JSON string
create_edit_response_choices_inner_instance = CreateEditResponseChoicesInner.from_json(json)
# print the JSON string representation of the object
print(CreateEditResponseChoicesInner.to_json())

# convert the object into a dict
create_edit_response_choices_inner_dict = create_edit_response_choices_inner_instance.to_dict()
# create an instance of CreateEditResponseChoicesInner from a dict
create_edit_response_choices_inner_form_dict = create_edit_response_choices_inner.from_dict(create_edit_response_choices_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


