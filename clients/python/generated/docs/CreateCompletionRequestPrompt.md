# CreateCompletionRequestPrompt

The prompt(s) to generate completions for, encoded as a string, array of strings, array of tokens, or array of token arrays.  Note that <|endoftext|> is the document separator that the model sees during training, so if a prompt is not specified the model will generate as if from the beginning of a new document. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------

## Example

```python
from openapiopenai.models.create_completion_request_prompt import CreateCompletionRequestPrompt

# TODO update the JSON string below
json = "{}"
# create an instance of CreateCompletionRequestPrompt from a JSON string
create_completion_request_prompt_instance = CreateCompletionRequestPrompt.from_json(json)
# print the JSON string representation of the object
print(CreateCompletionRequestPrompt.to_json())

# convert the object into a dict
create_completion_request_prompt_dict = create_completion_request_prompt_instance.to_dict()
# create an instance of CreateCompletionRequestPrompt from a dict
create_completion_request_prompt_form_dict = create_completion_request_prompt.from_dict(create_completion_request_prompt_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


