# CreateEmbeddingResponseUsage


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**prompt_tokens** | **int** |  | 
**total_tokens** | **int** |  | 

## Example

```python
from openapiopenai.models.create_embedding_response_usage import CreateEmbeddingResponseUsage

# TODO update the JSON string below
json = "{}"
# create an instance of CreateEmbeddingResponseUsage from a JSON string
create_embedding_response_usage_instance = CreateEmbeddingResponseUsage.from_json(json)
# print the JSON string representation of the object
print(CreateEmbeddingResponseUsage.to_json())

# convert the object into a dict
create_embedding_response_usage_dict = create_embedding_response_usage_instance.to_dict()
# create an instance of CreateEmbeddingResponseUsage from a dict
create_embedding_response_usage_form_dict = create_embedding_response_usage.from_dict(create_embedding_response_usage_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


