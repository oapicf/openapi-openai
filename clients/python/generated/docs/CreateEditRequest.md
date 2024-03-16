# CreateEditRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**model** | [**CreateEditRequestModel**](CreateEditRequestModel.md) |  | 
**input** | **str** | The input text to use as a starting point for the edit. | [optional] [default to '']
**instruction** | **str** | The instruction that tells the model how to edit the prompt. | 
**n** | **int** | How many edits to generate for the input and instruction. | [optional] [default to 1]
**temperature** | **float** | What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or &#x60;top_p&#x60; but not both.  | [optional] [default to 1]
**top_p** | **float** | An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or &#x60;temperature&#x60; but not both.  | [optional] [default to 1]

## Example

```python
from openapiopenai.models.create_edit_request import CreateEditRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CreateEditRequest from a JSON string
create_edit_request_instance = CreateEditRequest.from_json(json)
# print the JSON string representation of the object
print(CreateEditRequest.to_json())

# convert the object into a dict
create_edit_request_dict = create_edit_request_instance.to_dict()
# create an instance of CreateEditRequest from a dict
create_edit_request_form_dict = create_edit_request.from_dict(create_edit_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


