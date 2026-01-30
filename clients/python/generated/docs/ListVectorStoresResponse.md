# ListVectorStoresResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **str** |  | 
**data** | [**List[VectorStoreObject]**](VectorStoreObject.md) |  | 
**first_id** | **str** |  | 
**last_id** | **str** |  | 
**has_more** | **bool** |  | 

## Example

```python
from openapiopenai.models.list_vector_stores_response import ListVectorStoresResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListVectorStoresResponse from a JSON string
list_vector_stores_response_instance = ListVectorStoresResponse.from_json(json)
# print the JSON string representation of the object
print(ListVectorStoresResponse.to_json())

# convert the object into a dict
list_vector_stores_response_dict = list_vector_stores_response_instance.to_dict()
# create an instance of ListVectorStoresResponse from a dict
list_vector_stores_response_from_dict = ListVectorStoresResponse.from_dict(list_vector_stores_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


