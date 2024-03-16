# ListFineTunesResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **str** |  | 
**data** | [**List[FineTune]**](FineTune.md) |  | 

## Example

```python
from openapiopenai.models.list_fine_tunes_response import ListFineTunesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListFineTunesResponse from a JSON string
list_fine_tunes_response_instance = ListFineTunesResponse.from_json(json)
# print the JSON string representation of the object
print(ListFineTunesResponse.to_json())

# convert the object into a dict
list_fine_tunes_response_dict = list_fine_tunes_response_instance.to_dict()
# create an instance of ListFineTunesResponse from a dict
list_fine_tunes_response_form_dict = list_fine_tunes_response.from_dict(list_fine_tunes_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


