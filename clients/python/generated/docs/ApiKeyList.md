# ApiKeyList


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **str** |  | [optional] 
**data** | [**List[AdminApiKey]**](AdminApiKey.md) |  | [optional] 
**has_more** | **bool** |  | [optional] 
**first_id** | **str** |  | [optional] 
**last_id** | **str** |  | [optional] 

## Example

```python
from openapiopenai.models.api_key_list import ApiKeyList

# TODO update the JSON string below
json = "{}"
# create an instance of ApiKeyList from a JSON string
api_key_list_instance = ApiKeyList.from_json(json)
# print the JSON string representation of the object
print(ApiKeyList.to_json())

# convert the object into a dict
api_key_list_dict = api_key_list_instance.to_dict()
# create an instance of ApiKeyList from a dict
api_key_list_from_dict = ApiKeyList.from_dict(api_key_list_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


