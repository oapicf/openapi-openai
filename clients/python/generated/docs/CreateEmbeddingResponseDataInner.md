# CreateEmbeddingResponseDataInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **int** |  | 
**object** | **str** |  | 
**embedding** | **List[float]** |  | 

## Example

```python
from openapiopenai.models.create_embedding_response_data_inner import CreateEmbeddingResponseDataInner

# TODO update the JSON string below
json = "{}"
# create an instance of CreateEmbeddingResponseDataInner from a JSON string
create_embedding_response_data_inner_instance = CreateEmbeddingResponseDataInner.from_json(json)
# print the JSON string representation of the object
print(CreateEmbeddingResponseDataInner.to_json())

# convert the object into a dict
create_embedding_response_data_inner_dict = create_embedding_response_data_inner_instance.to_dict()
# create an instance of CreateEmbeddingResponseDataInner from a dict
create_embedding_response_data_inner_form_dict = create_embedding_response_data_inner.from_dict(create_embedding_response_data_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


