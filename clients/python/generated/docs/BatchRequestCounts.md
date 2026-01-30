# BatchRequestCounts

The request counts for different statuses within the batch.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**total** | **int** | Total number of requests in the batch. | 
**completed** | **int** | Number of requests that have been completed successfully. | 
**failed** | **int** | Number of requests that have failed. | 

## Example

```python
from openapiopenai.models.batch_request_counts import BatchRequestCounts

# TODO update the JSON string below
json = "{}"
# create an instance of BatchRequestCounts from a JSON string
batch_request_counts_instance = BatchRequestCounts.from_json(json)
# print the JSON string representation of the object
print(BatchRequestCounts.to_json())

# convert the object into a dict
batch_request_counts_dict = batch_request_counts_instance.to_dict()
# create an instance of BatchRequestCounts from a dict
batch_request_counts_from_dict = BatchRequestCounts.from_dict(batch_request_counts_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


