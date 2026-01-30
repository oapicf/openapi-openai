# CreateVectorStoreFileRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**file_id** | **str** | A [File](/docs/api-reference/files) ID that the vector store should use. Useful for tools like &#x60;file_search&#x60; that can access files. | 
**chunking_strategy** | [**ChunkingStrategyRequestParam**](ChunkingStrategyRequestParam.md) |  | [optional] 

## Example

```python
from openapiopenai.models.create_vector_store_file_request import CreateVectorStoreFileRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CreateVectorStoreFileRequest from a JSON string
create_vector_store_file_request_instance = CreateVectorStoreFileRequest.from_json(json)
# print the JSON string representation of the object
print(CreateVectorStoreFileRequest.to_json())

# convert the object into a dict
create_vector_store_file_request_dict = create_vector_store_file_request_instance.to_dict()
# create an instance of CreateVectorStoreFileRequest from a dict
create_vector_store_file_request_from_dict = CreateVectorStoreFileRequest.from_dict(create_vector_store_file_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


