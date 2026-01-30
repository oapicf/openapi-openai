# UpdateVectorStoreRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | The name of the vector store. | [optional] 
**expires_after** | [**VectorStoreExpirationAfter**](VectorStoreExpirationAfter.md) |  | [optional] 
**metadata** | **object** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | [optional] 

## Example

```python
from openapiopenai.models.update_vector_store_request import UpdateVectorStoreRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateVectorStoreRequest from a JSON string
update_vector_store_request_instance = UpdateVectorStoreRequest.from_json(json)
# print the JSON string representation of the object
print(UpdateVectorStoreRequest.to_json())

# convert the object into a dict
update_vector_store_request_dict = update_vector_store_request_instance.to_dict()
# create an instance of UpdateVectorStoreRequest from a dict
update_vector_store_request_from_dict = UpdateVectorStoreRequest.from_dict(update_vector_store_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


