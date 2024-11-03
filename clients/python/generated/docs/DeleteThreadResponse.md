# DeleteThreadResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** |  | 
**deleted** | **bool** |  | 
**object** | **str** |  | 

## Example

```python
from openapiopenai.models.delete_thread_response import DeleteThreadResponse

# TODO update the JSON string below
json = "{}"
# create an instance of DeleteThreadResponse from a JSON string
delete_thread_response_instance = DeleteThreadResponse.from_json(json)
# print the JSON string representation of the object
print(DeleteThreadResponse.to_json())

# convert the object into a dict
delete_thread_response_dict = delete_thread_response_instance.to_dict()
# create an instance of DeleteThreadResponse from a dict
delete_thread_response_from_dict = DeleteThreadResponse.from_dict(delete_thread_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


