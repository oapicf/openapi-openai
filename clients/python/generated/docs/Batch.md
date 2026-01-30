# Batch


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** |  | 
**object** | **str** | The object type, which is always &#x60;batch&#x60;. | 
**endpoint** | **str** | The OpenAI API endpoint used by the batch. | 
**errors** | [**BatchErrors**](BatchErrors.md) |  | [optional] 
**input_file_id** | **str** | The ID of the input file for the batch. | 
**completion_window** | **str** | The time frame within which the batch should be processed. | 
**status** | **str** | The current status of the batch. | 
**output_file_id** | **str** | The ID of the file containing the outputs of successfully executed requests. | [optional] 
**error_file_id** | **str** | The ID of the file containing the outputs of requests with errors. | [optional] 
**created_at** | **int** | The Unix timestamp (in seconds) for when the batch was created. | 
**in_progress_at** | **int** | The Unix timestamp (in seconds) for when the batch started processing. | [optional] 
**expires_at** | **int** | The Unix timestamp (in seconds) for when the batch will expire. | [optional] 
**finalizing_at** | **int** | The Unix timestamp (in seconds) for when the batch started finalizing. | [optional] 
**completed_at** | **int** | The Unix timestamp (in seconds) for when the batch was completed. | [optional] 
**failed_at** | **int** | The Unix timestamp (in seconds) for when the batch failed. | [optional] 
**expired_at** | **int** | The Unix timestamp (in seconds) for when the batch expired. | [optional] 
**cancelling_at** | **int** | The Unix timestamp (in seconds) for when the batch started cancelling. | [optional] 
**cancelled_at** | **int** | The Unix timestamp (in seconds) for when the batch was cancelled. | [optional] 
**request_counts** | [**BatchRequestCounts**](BatchRequestCounts.md) |  | [optional] 
**metadata** | **object** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | [optional] 

## Example

```python
from openapiopenai.models.batch import Batch

# TODO update the JSON string below
json = "{}"
# create an instance of Batch from a JSON string
batch_instance = Batch.from_json(json)
# print the JSON string representation of the object
print(Batch.to_json())

# convert the object into a dict
batch_dict = batch_instance.to_dict()
# create an instance of Batch from a dict
batch_from_dict = Batch.from_dict(batch_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


