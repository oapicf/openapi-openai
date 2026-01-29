# CreateCompletionResponseChoicesInnerLogprobs


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**text_offset** | **List[int]** |  | [optional] 
**token_logprobs** | **List[float]** |  | [optional] 
**tokens** | **List[str]** |  | [optional] 
**top_logprobs** | **List[Dict[str, float]]** |  | [optional] 

## Example

```python
from openapiopenai.models.create_completion_response_choices_inner_logprobs import CreateCompletionResponseChoicesInnerLogprobs

# TODO update the JSON string below
json = "{}"
# create an instance of CreateCompletionResponseChoicesInnerLogprobs from a JSON string
create_completion_response_choices_inner_logprobs_instance = CreateCompletionResponseChoicesInnerLogprobs.from_json(json)
# print the JSON string representation of the object
print(CreateCompletionResponseChoicesInnerLogprobs.to_json())

# convert the object into a dict
create_completion_response_choices_inner_logprobs_dict = create_completion_response_choices_inner_logprobs_instance.to_dict()
# create an instance of CreateCompletionResponseChoicesInnerLogprobs from a dict
create_completion_response_choices_inner_logprobs_from_dict = CreateCompletionResponseChoicesInnerLogprobs.from_dict(create_completion_response_choices_inner_logprobs_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


