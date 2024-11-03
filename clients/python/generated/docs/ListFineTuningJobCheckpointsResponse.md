# ListFineTuningJobCheckpointsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**List[FineTuningJobCheckpoint]**](FineTuningJobCheckpoint.md) |  | 
**object** | **str** |  | 
**first_id** | **str** |  | [optional] 
**last_id** | **str** |  | [optional] 
**has_more** | **bool** |  | 

## Example

```python
from openapiopenai.models.list_fine_tuning_job_checkpoints_response import ListFineTuningJobCheckpointsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListFineTuningJobCheckpointsResponse from a JSON string
list_fine_tuning_job_checkpoints_response_instance = ListFineTuningJobCheckpointsResponse.from_json(json)
# print the JSON string representation of the object
print(ListFineTuningJobCheckpointsResponse.to_json())

# convert the object into a dict
list_fine_tuning_job_checkpoints_response_dict = list_fine_tuning_job_checkpoints_response_instance.to_dict()
# create an instance of ListFineTuningJobCheckpointsResponse from a dict
list_fine_tuning_job_checkpoints_response_from_dict = ListFineTuningJobCheckpointsResponse.from_dict(list_fine_tuning_job_checkpoints_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


