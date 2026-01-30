# CreateVectorStoreRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**file_ids** | **List[str]** | A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like &#x60;file_search&#x60; that can access files. | [optional] 
**name** | **str** | The name of the vector store. | [optional] 
**expires_after** | [**VectorStoreExpirationAfter**](VectorStoreExpirationAfter.md) |  | [optional] 
**chunking_strategy** | [**CreateVectorStoreRequestChunkingStrategy**](CreateVectorStoreRequestChunkingStrategy.md) |  | [optional] 
**metadata** | **object** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | [optional] 

## Example

```python
from openapiopenai.models.create_vector_store_request import CreateVectorStoreRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CreateVectorStoreRequest from a JSON string
create_vector_store_request_instance = CreateVectorStoreRequest.from_json(json)
# print the JSON string representation of the object
print(CreateVectorStoreRequest.to_json())

# convert the object into a dict
create_vector_store_request_dict = create_vector_store_request_instance.to_dict()
# create an instance of CreateVectorStoreRequest from a dict
create_vector_store_request_from_dict = CreateVectorStoreRequest.from_dict(create_vector_store_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


