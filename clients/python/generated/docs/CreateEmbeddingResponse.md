# CreateEmbeddingResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **str** |  | 
**model** | **str** |  | 
**data** | [**List[CreateEmbeddingResponseDataInner]**](CreateEmbeddingResponseDataInner.md) |  | 
**usage** | [**CreateEmbeddingResponseUsage**](CreateEmbeddingResponseUsage.md) |  | 

## Example

```python
from openapiopenai.models.create_embedding_response import CreateEmbeddingResponse

# TODO update the JSON string below
json = "{}"
# create an instance of CreateEmbeddingResponse from a JSON string
create_embedding_response_instance = CreateEmbeddingResponse.from_json(json)
# print the JSON string representation of the object
print(CreateEmbeddingResponse.to_json())

# convert the object into a dict
create_embedding_response_dict = create_embedding_response_instance.to_dict()
# create an instance of CreateEmbeddingResponse from a dict
create_embedding_response_form_dict = create_embedding_response.from_dict(create_embedding_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


