# VectorStoreObjectFileCounts


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**in_progress** | **int** | The number of files that are currently being processed. | 
**completed** | **int** | The number of files that have been successfully processed. | 
**failed** | **int** | The number of files that have failed to process. | 
**cancelled** | **int** | The number of files that were cancelled. | 
**total** | **int** | The total number of files. | 

## Example

```python
from openapiopenai.models.vector_store_object_file_counts import VectorStoreObjectFileCounts

# TODO update the JSON string below
json = "{}"
# create an instance of VectorStoreObjectFileCounts from a JSON string
vector_store_object_file_counts_instance = VectorStoreObjectFileCounts.from_json(json)
# print the JSON string representation of the object
print(VectorStoreObjectFileCounts.to_json())

# convert the object into a dict
vector_store_object_file_counts_dict = vector_store_object_file_counts_instance.to_dict()
# create an instance of VectorStoreObjectFileCounts from a dict
vector_store_object_file_counts_from_dict = VectorStoreObjectFileCounts.from_dict(vector_store_object_file_counts_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


