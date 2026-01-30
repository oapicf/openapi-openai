# ListBatchesResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**List[Batch]**](Batch.md) |  | 
**first_id** | **str** |  | [optional] 
**last_id** | **str** |  | [optional] 
**has_more** | **bool** |  | 
**object** | **str** |  | 

## Example

```python
from openapiopenai.models.list_batches_response import ListBatchesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListBatchesResponse from a JSON string
list_batches_response_instance = ListBatchesResponse.from_json(json)
# print the JSON string representation of the object
print(ListBatchesResponse.to_json())

# convert the object into a dict
list_batches_response_dict = list_batches_response_instance.to_dict()
# create an instance of ListBatchesResponse from a dict
list_batches_response_from_dict = ListBatchesResponse.from_dict(list_batches_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


