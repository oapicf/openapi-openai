# ListRunsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **str** |  | 
**data** | [**List[RunObject]**](RunObject.md) |  | 
**first_id** | **str** |  | 
**last_id** | **str** |  | 
**has_more** | **bool** |  | 

## Example

```python
from openapiopenai.models.list_runs_response import ListRunsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListRunsResponse from a JSON string
list_runs_response_instance = ListRunsResponse.from_json(json)
# print the JSON string representation of the object
print(ListRunsResponse.to_json())

# convert the object into a dict
list_runs_response_dict = list_runs_response_instance.to_dict()
# create an instance of ListRunsResponse from a dict
list_runs_response_form_dict = list_runs_response.from_dict(list_runs_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


