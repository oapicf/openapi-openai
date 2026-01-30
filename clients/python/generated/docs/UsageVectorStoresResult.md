# UsageVectorStoresResult

The aggregated vector stores usage details of the specific time bucket.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **str** |  | 
**usage_bytes** | **int** | The vector stores usage in bytes. | 
**project_id** | **str** | When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped usage result. | [optional] 

## Example

```python
from openapiopenai.models.usage_vector_stores_result import UsageVectorStoresResult

# TODO update the JSON string below
json = "{}"
# create an instance of UsageVectorStoresResult from a JSON string
usage_vector_stores_result_instance = UsageVectorStoresResult.from_json(json)
# print the JSON string representation of the object
print(UsageVectorStoresResult.to_json())

# convert the object into a dict
usage_vector_stores_result_dict = usage_vector_stores_result_instance.to_dict()
# create an instance of UsageVectorStoresResult from a dict
usage_vector_stores_result_from_dict = UsageVectorStoresResult.from_dict(usage_vector_stores_result_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


