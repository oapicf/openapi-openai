# CreateEmbeddingRequestInput

Input text to embed, encoded as a string or array of tokens. To embed multiple inputs in a single request, pass an array of strings or array of token arrays. Each input must not exceed the max input tokens for the model (8191 tokens for `text-embedding-ada-002`). [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_count_tokens_with_tiktoken.ipynb) for counting tokens. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------

## Example

```python
from openapiopenai.models.create_embedding_request_input import CreateEmbeddingRequestInput

# TODO update the JSON string below
json = "{}"
# create an instance of CreateEmbeddingRequestInput from a JSON string
create_embedding_request_input_instance = CreateEmbeddingRequestInput.from_json(json)
# print the JSON string representation of the object
print(CreateEmbeddingRequestInput.to_json())

# convert the object into a dict
create_embedding_request_input_dict = create_embedding_request_input_instance.to_dict()
# create an instance of CreateEmbeddingRequestInput from a dict
create_embedding_request_input_form_dict = create_embedding_request_input.from_dict(create_embedding_request_input_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


