# ListThreadsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **str** |  | 
**data** | [**List[ThreadObject]**](ThreadObject.md) |  | 
**first_id** | **str** |  | 
**last_id** | **str** |  | 
**has_more** | **bool** |  | 

## Example

```python
from openapiopenai.models.list_threads_response import ListThreadsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListThreadsResponse from a JSON string
list_threads_response_instance = ListThreadsResponse.from_json(json)
# print the JSON string representation of the object
print(ListThreadsResponse.to_json())

# convert the object into a dict
list_threads_response_dict = list_threads_response_instance.to_dict()
# create an instance of ListThreadsResponse from a dict
list_threads_response_form_dict = list_threads_response.from_dict(list_threads_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


