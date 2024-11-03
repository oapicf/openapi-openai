# DeleteModelResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** |  | 
**deleted** | **bool** |  | 
**object** | **str** |  | 

## Example

```python
from openapiopenai.models.delete_model_response import DeleteModelResponse

# TODO update the JSON string below
json = "{}"
# create an instance of DeleteModelResponse from a JSON string
delete_model_response_instance = DeleteModelResponse.from_json(json)
# print the JSON string representation of the object
print(DeleteModelResponse.to_json())

# convert the object into a dict
delete_model_response_dict = delete_model_response_instance.to_dict()
# create an instance of DeleteModelResponse from a dict
delete_model_response_from_dict = DeleteModelResponse.from_dict(delete_model_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


